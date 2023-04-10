package Classes.Files;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File file = new File("HelloWord.text");
        try {
            file.createNewFile();
            System.out.println("Enter your name");

            FileWriter fileWriter = new FileWriter(file);
            String o = scanner.nextLine();

            fileWriter.write(o);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("HelloWord.text");
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
