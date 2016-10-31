package al223jw_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CountJava {
    private static ArrayList<File> list = new ArrayList();

    public static void main(String[] args) {

        String directoryName = args[0].toString();

        ArrayList<File> fileList = listFiles(directoryName);


        for(File file : fileList) {
            int countLines = 0;

            try
            {
                Scanner sc = new Scanner(new FileReader(file));

                while(sc.hasNextLine())
                {
                    sc.nextLine();
                    countLines++;
                }
                System.out.println(file.getName() + " lines = " + countLines);
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
        }





    }

    public static ArrayList listFiles(String directoryName) {

        File directory = new File(directoryName);

        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                list.add(file);
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
        }
        return list;
    }
}
