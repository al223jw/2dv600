package al223jw_assign2.Exersise5;

import java.io.*;

public class IdentifyWordsMain {

    public static void main(String[] args) {

        try
        {
            String line;
            String length = "";
            String stripText = "";

            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            while ((line = br.readLine()) != null) {
                length += line;
            }


            for(int i = 0; i < length.length(); i++)
            {
                if(Character.isLetter(length.charAt(i)))
                {
                    stripText += length.charAt(i);
                }
                else if(Character.isWhitespace(length.charAt(i)))
                {
                    stripText += length.charAt(i);
                }
            }

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));

            out.println(stripText);
            out.close();

        }
        catch (java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
