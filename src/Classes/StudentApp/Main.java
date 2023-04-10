package Classes.StudentApp;


import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter students number");
        int o= scanner.nextInt();
        Students[] students = new Students[o];

        Run run = new Run();
        run.run1(scanner,students);

        for (; ; ) {
            run.run2(scanner, students);
        }







    }
}
