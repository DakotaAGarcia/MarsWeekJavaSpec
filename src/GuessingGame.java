import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter your name to begin");
        String name = scan.nextLine();
        System.out.println("Hello " + name + " Welcome to number guesser!");
        int number = rand.nextInt(100);
        System.out.println( name + " I'm thinking of a number between 1 and 100");
        System.out.println("Take a guess and see how many times it takes you to guess it.");
        int counter = 0;

while (true) {
    int guess = scan.nextInt();
    if(guess > 100 || guess < 1){
        System.out.println("Please choose a number between 1 and 100 next time! Now I don't want to play");
        break;
    }
    counter += 1;
    if (guess > number) {
        System.out.println("Too high, guess again.");
        System.out.println("Total guesses:" + counter);
    } else if (guess < number) {
        System.out.println("Too low, guess again");
        System.out.println("Total guesses:" + counter);
    } else {
        System.out.println("You got it!");
        System.out.println("It took you " + counter + " guesses");
        break;
    }
}


    }
}
