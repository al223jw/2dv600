package al223jw_assign1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestK {
    public static void main(String[] args) {

        while(true)
        {
            try
            {
                int N;
                int K = 0;
                int i = 0;

                Scanner scan = new Scanner(System.in);

                N = scan.nextInt();

                if (N <= -1) {
                    System.out.println("The number should be an arbitrary positive integer!");
                }

                while(i + K < N)
                {
                    K += 2;

                    i += K;

                    if(i > N)
                    {
                        K -= 2;
                        break;
                    }
                }
                System.out.println(K);
            }
            catch(InputMismatchException e)
            {
                System.out.println("Only numbers are allowed in this field");
            }
        }
    }
}
