
import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() {

            Scanner input = new Scanner(System.in);

            System.out.println("Booting Up please wait...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Musk1 ready");
            System.out.print("Enter Name to begin:");
            String name  = input.nextLine();

            System.out.println("Hello, "+ name + " Welcome to the Expedition prep program. Are you ready for the new world? Type Y or N");
            String response = input.nextLine();

            if(response.equals("Y")) {
                System.out.println("I knew you would say that. You are the team leader for a reason");
            } else {
                System.out.println("Well... That is unfortunate... You have to go.");

            }
            System.out.println("How many members of your team would you like to take with you?");

            int fireTeam = input.nextInt();

            if(fireTeam > 2 ) {
                System.out.println("that is waaay to many people.. The maximum capacity of the ship is 3");
            } else if(fireTeam < 2 ) {
                System.out.println("There are 2 extra seats on the ship. We intend to fill them");
            } else if( fireTeam == 2) {
                System.out.println("Perfect!");}
            input.nextLine();
            System.out.println("What snacks would you like to take with you?");

            String snack = input.nextLine();

            System.out.println("Nice choice, we will be sure to pack " + snack + " onboard.");

            System.out.println("Which vehicle would you like to take?");
            System.out.println("A: Warthog");
            System.out.println("B: Mars Rover");
            System.out.println("C: Cyber Truck");
            System.out.println("D: Tank");
            String choice = input.nextLine();

            if(choice.equals("A")){
                choice = "Warthog";
                System.out.println(choice + " Selected");
            } else if(choice.equals("B")){
                choice = "Mars Rover";
                System.out.println(choice + " Selected");
            } else if(choice.equals("C")){
                choice = "Cyber Truck";
                System.out.println(choice + " Selected");
            } else if(choice.equals("D")){
                choice = "Tank";
                System.out.println(choice + " Selected");
            } else {
                choice = "Feet";
                System.out.println(choice + " Selected");
            }


            System.out.println("Congratulations! You are now ready to embark on your trip to mars commander "+
                    name + " You and your team of "+ fireTeam +" are headed to mars. Your "+ choice +
                    " is loaded and ready for you upon arrival and of course, We have your "+
                    snack + " onboard for your flight.");


            input.close();
        }
    }




