package al223jw_assign1;

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {

        while(true)
        {
            Scanner scan = new Scanner(System.in);

            String text = scan.nextLine();


            String textReverse = new StringBuilder(text).reverse().toString();

            System.out.println(textReverse);
        }
    }
}
