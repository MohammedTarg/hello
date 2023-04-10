package Classes.lol;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File file=new File("file.exe");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file,true);
            System.out.println("Enter string");
            String g= scanner.nextLine();
            fileWriter.write(g+"\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("file.exe");
            int h;
            while ((h = fileReader.read()) != -1) {
                System.out.print((char)h);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
