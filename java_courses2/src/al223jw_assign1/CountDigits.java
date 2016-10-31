package al223jw_assign1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        while(true)
            try {

            int N;
            int sum = 0;
            int numberOfZeroes = 0;
            int numberOfEven = 0;
            int numberOfOdd = 0;

            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();

            if (N <= -1) {
                System.out.println("The number have to be positive!");
            }

            char[] array = String.valueOf(N).toCharArray();

               for (int i =0; i < array.length; i++)
               {
                   if(array[i] == '0')
                   {
                       numberOfZeroes++;
                   }
                   if(array[i] % 2 == 0 && array[i] != '0')
                   {
                       numberOfEven++;
                   }
                   if(array[i] % 2 != 0 && array[i] != '0')
                   {
                       numberOfOdd++;
                   }

                   String tempString = String.valueOf(array[i]);
                   sum += Integer.valueOf(array[i]).parseInt(tempString);

               }
                System.out.println("Zeros: " + numberOfZeroes);
                System.out.println("Even: " + numberOfEven);
                System.out.println("Odd: " + numberOfOdd);
                System.out.println(sum);

        } catch (InputMismatchException e) {
            System.out.println("Only numbers are allowed in this field");
        }
    }
}
