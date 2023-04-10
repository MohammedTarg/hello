package Classes.StudentApp;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Run extends Students{


    public Run() {
    }

    public void run1(Scanner scanner,Students[] students) {

        for (int i = 0; i < students.length; i++) {
            students[i] = new Students ();
            System.out.println("Enter student"+"["+(i+1)+"]"+"name:");
            try {
                String name = scanner.next();
                students[i].setName(name);
            } catch (Exception g) {
                System.out.println("Enter a valid name!!!");
                return;
            }

            System.out.println("Enter student"+"["+(i+1)+"]"+"ID:");
            try {
                int ID = scanner.nextInt();
                students[i].setID(ID);
            } catch (Exception g) {
                System.out.println("Enter a valid ID!!!!");
                return;
            }

            System.out.println("Enter student"+"["+(i+1)+"]"+"average:");
            try {
                float average = scanner.nextFloat();

                students[i].setAverage(average);

                if (students[i].getAverage() > 100) {
                    System.out.println("Enter a valid average!!!!");
                    return;
                }
            } catch (Exception g) {
                System.out.println("Enter a valid average!!!!");
                return;
            }
            System.out.println("Enter student"+"["+(i+1)+"]"+"major");


            try {
                String[] g = {"1_Math", "2_physics", "3_IT", "4_Arabic"};

                for (int r = 0; r < g.length; r++) {
                    System.out.print(g[r] + "    ");
                }

                int h = scanner.nextInt();
                students[i].setMajor(g[h - 1]);

            } catch (Exception o) {
                System.out.println("Just 1 to 4 !!!!");
            }


            System.out.println("Enter student"+"["+(i+1)+"]"+"studingHourPrice:");
            try {
                int studingHourPrice = scanner.nextInt();
                students[i].setStudingHourPrice(studingHourPrice);
            } catch (Exception t) {
                System.out.println("Enter a valid studingHourPrice!!!!");
                break;
            }

            System.out.println("Enter student"+"["+(i+1)+"]"+"studyHours:");
            try {
                int studyHours = scanner.nextInt();
                students[i].setStudyHours(studyHours);
            } catch (Exception t) {
                System.out.println("Enter a valid setStudyHours!!!");
                return;
            }

        }
    }



    public void run2(Scanner scanner,Students[]students) {
        System.out.println("[1]AddStudent\n[2]SearchForStudent\n[3]DeleteStudent\n[4]SaveStudentInFile\n[5]Exit");
        short x= scanner.nextShort();
        switch (x) {
            case 1:
                String name5 = "";
                int ID5=0;
                float average5=0;
                int studingHourPrice5=0;
                int studyHours5=0;
                String major5 = "";
                System.out.println("Enter name:");
                try {
                    String name = scanner.next();
                    name5 = name;

                } catch (Exception g) {
                    System.out.println("Enter a valid name!!!");
                    return;
                }

                System.out.println("Enter ID:");
                try {
                    int ID = scanner.nextInt();
                    ID5 = ID;
                } catch (Exception g) {
                    System.out.println("Enter a valid ID!!!!");
                    return;
                }

                System.out.println("Enter average:");
                try {

                    float average = scanner.nextFloat();
                    average5 = average;
                    if (average > 100) {
                        System.out.println("Enter a valid average!!!!");
                        return;
                    }
                } catch (Exception g) {
                    System.out.println("Enter a valid average!!!!");
                    return;
                }
                System.out.println("Enter student major");
                try {

                    String[]g = {"1_Math","2_physics","3_IT","4_Arabic"};
                    for (int r= 0; r < g.length; r++) {
                        System.out.print(g[r]+"    ");
                    }
                    int h= scanner.nextInt();
                    String major = g[h-1];
                    major5 = major;
                } catch (Exception n) {
                    System.out.println("Enter 1 to 4 !!!");
                    return;
                }


                System.out.println("Enter studingHourPrice:");
                try {
                    int studingHourPrice = scanner.nextInt();
                    studingHourPrice5 = studingHourPrice;
                } catch (Exception g) {
                    System.out.println("Enter a valid studingHourPrice!!!!");
                    return;
                }
                System.out.println("Enter studyHours:");
                try {
                    int studyHours = scanner.nextInt();
                    studyHours5 = studyHours;
                } catch (Exception g) {
                    System.out.println("Enter a valid studyHours!!!!");
                    return;
                }
                Students students1 = new Students(name5,ID5,average5,studingHourPrice5,studyHours5,major5);

                System.out.println(students1.toString());
                return;

            case 2:
                System.out.println("Enter ID:");
                int id= scanner.nextInt();
                for (int i = 0; i < students.length; i++) {
                    if (id == students[i].getID()) {
                        System.out.println(students[i].toString());

                        break;

                    }else {
                        System.out.println("Not found!!!");
                    }

                }
                return;
            case 3:
                System.out.println("Enter ID:");
                int d= scanner.nextInt();
                for (int i = 0; i < students.length; i++) {
                    if (d == students[i].getID()) {
                        students[i] = new Students();
                        System.out.println(students[i].getName());
                        System.out.println("Student delete");

                        return;

                    }else {
                        System.out.println("Not found!!!!");
                    }
                }
                return;

            case 4:
                String name6 = "";
                int ID6=0;
                float average6=0;
                int studingHourPrice6=0;
                int studyHours6=0;
                String major6 = "";
                System.out.println("Enter name:");
                try {
                    String name = scanner.next();
                    name6 = name;

                } catch (Exception g) {
                    System.out.println("Enter a valid name!!!!");
                    return;
                }

                System.out.println("Enter ID:");
                try {
                    int ID = scanner.nextInt();
                    ID6 = ID;
                } catch (Exception g) {
                    System.out.println("Enter a valid ID!!!!");
                    return;
                }

                System.out.println("Enter average:");
                try {

                    float average = scanner.nextFloat();
                    average6 = average;
                    if (average > 100) {
                        System.out.println("Enter a valid average!!!!");
                        return;
                    }
                } catch (Exception g) {
                    System.out.println("Enter a valid average");
                    return;
                }


                    System.out.println("Enter student major:");
                    try {
                        String[] g = {"1_Math", "2_physics", "3_IT", "4_Arabic"};

                        for (int r = 0; r < g.length; r++) {
                            System.out.print(g[r] + "    ");
                        }
                        int p= scanner.nextInt();
                        String major = g[p-1];
                        major6 = major;
                    } catch (Exception n) {
                        System.out.println("Enter 1 to 4!!!");
                        return;
                    }


                System.out.println("Enter studingHourPrice:");
                try {
                    int studingHourPrice = scanner.nextInt();
                    studingHourPrice6 = studingHourPrice;
                } catch (Exception g) {
                    System.out.println("Enter a valid studingHourPrice!!!!");
                    return;
                }


                System.out.println("Enter studyHours:");
                try {
                    int studyHours = scanner.nextInt();
                    studyHours6 = studyHours;
                } catch (Exception g) {
                    System.out.println("Enter a valid studyHours!!!!");
                    return;
                }
                Students students2 = new Students(name6,ID6,average6,studingHourPrice6,studyHours6,major6);
                System.out.println(students2.toString());

                File file = new File("Student.text");
                try {

                    file.createNewFile();
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(students2.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    FileReader fileReader = new FileReader("Student.text");
                    int c;
                    for (; (c = fileReader.read()) != -1; ) {
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;

            case 5:

                exit(0);


        }

    }
}
