package al223jw_assign1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        // While loop will always start a new game when a game is finished.
        while(true)
        {
            int number = 0;
            int countOfTries = 0;
            int numberToGuess = 0;

            Random rand = new Random();
            numberToGuess = rand.nextInt(100) + 1;
            // Test code to easy test game.
            //System.out.println(numberToGuess);

            if (numberToGuess % 2 == 0) {
                numberToGuess = rand.nextInt(100) + 1;
                // Test code to easy test game.
                //System.out.println(numberToGuess);
            }

            // While loop makes sure every answer gets validated and a new try is given.
            while (true) {
                try {
                    Scanner scan = new Scanner(System.in);
                    number = scan.nextInt();

                    if (number < 0 || number > 100) {
                        System.out.println("Write a number between 1 - 100!");
                    }

                    if (countOfTries == 10) {
                        System.out.println("Out of tries...");
                        break;
                    }

                    if (numberToGuess < number)

                    {
                        countOfTries++;
                        System.out.println("Hint: Lower");
                    }

                    if (numberToGuess > number) {
                        countOfTries++;
                        System.out.println("Hint: Higher");
                    }

                    if (numberToGuess == number) {
                        countOfTries++;
                        System.out.println("Correct after " + countOfTries + " guesses!");
                        break;
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Input a number between 1 -100!");
                }
            }
        }
    }
}
