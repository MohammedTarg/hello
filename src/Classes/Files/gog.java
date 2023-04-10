package Classes.Files;

import java.io.*;
import java.util.Scanner;

public class gog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File file = new File("rassem.text");
        try {
            System.out.println("Enter name");
            String s= scanner.nextLine();
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("rassem.text");
            for (int c ; (c= fileReader.read())!=-1; ) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
