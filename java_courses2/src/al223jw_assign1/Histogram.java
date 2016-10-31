package al223jw_assign1;

import java.io.*;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        int outOfBounce = 0;
        int oneToHundred = 0;

        int singles = 0;
        int tens = 0;
        int twentees = 0;
        int thirtys = 0;
        int forthys = 0;
        int fiftees = 0;
        int sixtees = 0;
        int seventys = 0;
        int eightys = 0;
        int ninetees = 0;
        int hundreds = 0;

        try
        {
            File file = new File(args[0].toString());
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine())
            {
                int number = sc.nextInt();

                if(number <= 10)
                {
                    singles++;
                }
                else if(number <= 20)
                {
                    tens++;
                }
                else if(number <= 30)
                {
                    twentees++;
                }
                else if(number <= 40)
                {
                    thirtys++;
                }
                else if(number <= 50)
                {
                    forthys++;
                }
                else if(number <= 60)
                {
                    fiftees++;
                }
                else if(number <= 70)
                {
                    sixtees++;
                }
                else if(number <= 80)
                {
                    seventys++;
                }
                else if(number <= 90)
                {
                    eightys++;
                }
                else if(number <= 100)
                {
                    ninetees++;
                }
                else if(number > 200)
                {
                    outOfBounce++;
                }
                else
                {
                    hundreds++;
                }
            }

            oneToHundred += singles + tens + twentees + thirtys + forthys + fiftees + sixtees + seventys + eightys + ninetees;

            System.out.println("Number of integers in the interval [1,100]: " + oneToHundred);
            System.out.println("in the interval [101,200]: " + hundreds);

            //EXTRA TASK!
            System.out.println("");
            System.out.println("Number of inttegers out of bounce: " + outOfBounce);
            System.out.println("");


            printer("1 - 10" + "     " + "|", singles);
            printer("11 - 20" + "    " + "|", tens);
            printer("21 - 30" + "    " + "|", twentees);
            printer("31 - 40" + "    " + "|", thirtys);
            printer("41 - 50" + "    " + "|", forthys);
            printer("51 - 60" + "    " + "|", fiftees);
            printer("61 - 70" + "    " + "|", sixtees);
            printer("71 - 80" + "    " + "|", seventys);
            printer("81 - 90" + "    " + "|", eightys);
            printer("91 - 100" + "   " + "|", ninetees);
            printer("101 - 200" + "  " + "|", hundreds);

        }
        catch (java.io.IOException ex)
        {
            System.out.println("File not found.");
        }
    }

    private static void printer(String intervall, int count)
    {
        System.out.print(intervall);
        System.out.println(String.format("%1$0" + count + "d",0 ,0).replace("0", "*"));
    }
}
