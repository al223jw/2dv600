package al223jw_assign1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int input = 0;
        int star = 1;
        int addStars = 2;
        int reduceStars = -2;

        while(true)
        {
            try {

                Scanner scan = new Scanner(System.in);
                input = scan.nextInt();

                if (input % 2 == 0) {
                    System.out.println("Enter a odd number!");
                    break;
                }

                for (int i = 0; i < input; i++) {
                    for (int k = 0; k < (input - star) / 2; k++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < star; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");

                    star += addStars;

                    if (star == input) {
                        addStars = reduceStars;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a odd number!");
            }
        }
    }
}
