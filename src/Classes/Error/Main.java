package Classes.Error;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        int a[] = {10,20,30,40,50};

        try {
            System.out.println("Enter less thin 5");
            int i= scanner.nextInt();
            System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException r) {
            System.out.println(r);
        }
        try {
            System.out.println("Enter nomber to div");
            int x= scanner.nextInt();
            System.out.println(a[4]/x);
        } catch (ArithmeticException k) {
            System.out.println(k);
        }





    }
}
