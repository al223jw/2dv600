package al223jw_assign2.Exersise5;

import al223jw_assign2.Exersise5_4.HashWordSet;
import al223jw_assign2.Exersise5_4.TreeWordSet;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount2Main {
    public static void main(String[] args) {
        try {
            String line;

            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            HashWordSet hashWord = new HashWordSet();
            TreeWordSet treeWord = new TreeWordSet();

            while ((line = br.readLine()) != null) {
                for (String s : line.split("\\s+")) {
                    if (!s.isEmpty()) {
                        hashWord.add(new Word(s.toLowerCase()));
                        treeWord.add(new Word(s.toLowerCase()));
                    }
                }
            }

            System.out.println("Hash Content");
            System.out.println("---------------");
            System.out.println(hashWord.toString());
            System.out.println();

            System.out.println("Tree Content");
            System.out.println("---------------");
            System.out.println(treeWord.toString());

            System.out.println("Hash Size:" +hashWord.size());
            System.out.println("Tree Size:" +treeWord.size());

        }
        catch (java.io.IOException e)
        {
            e.getMessage();
        }
    }
}
