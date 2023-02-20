public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Musk 1";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        double rations = 0.75;
        double mealsLeft = meals - (shipPopulation * rations);
        System.out.println("There are " +mealsLeft +" meals remaining.");
        double mealsFound = (mealsLeft * 0.5);
        double newMeals = mealsFound + mealsLeft;

        System.out.println("There are now " +newMeals + "means remaining");
        shipPopulation += 5;

        System.out.println("There are now "+ shipPopulation + " onboard Musk1");

        String landingLocation = "The Hill";

        if(landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("shhhhwhhwhwh Landing on the Plain");
        }else{
            System.out.println("Abort! Abort! Pull Up! Landing Zone unfit to land!");
        }
        try{
            landingCheck(5);
        } catch(InterruptedException e) {
            System.out.println("Error");
        }

        new MarsExpedition();

      new FindingsList();


    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for( int minute = 0; minute <= minutesLeft; minute++){
            if(minute % 2 == 0){
                System.out.println("Bank right");
            }

            else if(minute % 3 == 0){
                System.out.println("Bank left");
            }
            else if(minute % 2 == 0 && minute % 3 ==0 ) {
                System.out.println("Hold current trajectory");
            }else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);

        }
        System.out.println("landing successful");
        return false;



    }




}
