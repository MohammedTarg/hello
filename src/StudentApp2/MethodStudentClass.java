package StudentApp2;

import java.io.IOException;
import java.util.Scanner;

public class MethodStudentClass extends Student{

    int n=2000;

    public MethodStudentClass(){

    }
    public void student(){




    }
    public void newStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the University\n\n");
        System.out.println("[1]Abut the University");
        System.out.println("[2]Log in to the University");

        int x= scanner.nextShort();
        switch (x){
            case 1:
                System.out.println("Al_Azhar University\n");
                System.out.println("Pris 2 to Log in In the University");
                newStudent();
                break;
            case 2:
                Student[] students = new Student[n];

                    System.out.println("Enter your Name :");
                    String name= scanner.next();
                students[n].setName(name);

                System.out.println("Enter your Age :");
                int age= scanner.nextInt();
                students[n].setAge(age);

                System.out.println("Day :");
                int day= scanner.nextInt();
                students[n].setDay(day);

                System.out.println("month :");
                int month= scanner.nextInt();
                students[n].setMonth(month);

                System.out.println("years :");
                int years= scanner.nextInt();
                students[n].setYears(years);

                System.out.println("Enter Id :");
                long id= scanner.nextLong();
                students[n].setID(id);

                System.out.println("Enter your Average :");
                float average= scanner.nextFloat();
                students[n].setAverage(average);

                System.out.println("Your Id UniversityId Is :"+n);

                students[n].toString();





                break;

            default:
                System.out.println("Not found plz Enter *Correct* Number");
                newStudent();
        }




    }


}
