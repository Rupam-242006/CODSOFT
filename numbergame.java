import java.util.*;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int score = 0,attempts = 5;
        String playAgain;
        boolean Correctly = false;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int number = rand.nextInt(100) + 1;
            

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i +  " Enter your guess: ");
                int guess = in.nextInt();

                if (guess == number) {
                    System.out.println(" Correct! You've guessed the number in " + i + " attempt(s).");
                    score++;
                    Correctly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Oops! The number is higher. Guess again");
                } 
                else {
                    System.out.println("Oops! The number is lower. Guess again");
                }
            }

            if (!Correctly) {
                System.out.println(" You've used all attempts. The number was: " + number);
            }

            System.out.print("Do you want to play another round (yes/no): ");
            playAgain = in.next();
        } 
        while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nGame Over! Total score is " + score );
        System.out.println("Rounds Own :"+ score);
        System.out.println("Thanks for playing!");
    }
}