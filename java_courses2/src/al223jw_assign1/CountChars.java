package al223jw_assign1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountChars {
    public static void main(String[] args) {

       try
        {
            int countUppercase = 0;
            int countLowercase = 0;
            int countWhiteSpace = 0;
            int countOtherChars = 0;
            int countNumbers = 0;

            String line;
            String length = "";


            BufferedReader br = new BufferedReader(new FileReader(args[0].toString()));

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                length += line;
            }

            char[] c_arr = length.toCharArray();

            for(int i = 0; i < c_arr.length; i++)
            {
                if(Character.isUpperCase(c_arr[i]))
                {
                    countUppercase++;
                }
                else if(Character.isLowerCase(c_arr[i]))
                {
                    countLowercase++;
                }
                else if(Character.isDigit(c_arr[i]))
                {
                    countNumbers++;
                }
                else if(Character.isWhitespace(c_arr[i]))
                {
                    countWhiteSpace++;
                }
                else
                {
                    countOtherChars++;
                }
            }

            System.out.println("There is " + countUppercase + " uppercase letters");
            System.out.println("There is " + countLowercase + " lowercase letters");
            System.out.println("There is " + countNumbers + " numbers");
            System.out.println("There is " + countOtherChars + " other chars");
            System.out.println("There is " + countWhiteSpace + " White spaces");
        }
       catch (java.io.IOException ex)
        {
            System.out.println("File not found");
        }
    }
}
