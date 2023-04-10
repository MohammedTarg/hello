package StudentApp2;

import java.util.Scanner;

import static java.lang.System.exit;

public class RunClass extends MethodStudentClass {

    public RunClass() {

    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\tWelcome in my StudentApp_2\n\n");

        System.out.println("\t\t\t\t\tLog in As :");
        System.out.println("[1]Admin");
        System.out.println("[2]Student");
        System.out.println("[3]New Student");
        System.out.println("[4]Exit");
        int s= scanner.nextInt();
        switch (s){
            case 1:

                break;
            case 2:
                student();
                break;
            case 3:
                newStudent();
                break;
            case 4:
                System.out.println("Programing Ended");
                exit(0);
                break;
            default:
                System.out.println("Not found plz Enter *Correct* Number");
                start();

        }
    }
}
