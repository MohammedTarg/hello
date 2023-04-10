package Pro;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int sum=0;
        for (int i=0;i<10;i++){
            sum+=i;
        }
        S
        stem.out.println("Sum ="+sum);*/
        //==================================

        /*System.out.println("Enter number");
        int x= scanner.nextInt();
        int sum=0;
        for (int i=0;i<x;i++){
            sum+=i;
        }
        System.out.println("Sum ="+sum);*/
        //======================================

       /* double sum=0;

        for (int i=1;i<=4;i++){
            System.out.println("Enter number ["+i+"]");
            int x= scanner.nextInt();
            sum+=x;

        }
        System.out.println("The sum is :["+sum +"] and the average :["+(sum/4)+"]");
*/
        //================================================================

        /*System.out.println("Enter number");
        int nu= scanner.nextInt();
        if (nu%2==0){
            System.out.println(nu +"Is Even");
        }else {
            System.out.println(nu +"Is Odd");
        }*/
        //================================================================

        /*System.out.println("Enter Username :");
        String username= scanner.nextLine();
        if (username =="Hamada155"){
            System.out.println("Enter password :");
            String password = scanner.nextLine();
            if (password =="Moh123"){
                System.out.println("Welcome !");
            }else {
                System.out.println("Password is not correct");
            }
        }else {
            System.out.println("Not found");
        }
*/
        //================================================================
       /* System.out.println("Enter the first number :");
        int n1= scanner.nextInt();

        System.out.println("Enter sec number :");
        int n2 = scanner.nextInt();

        System.out.println("1.+\n" +
                "2.-\n" +
                "3.*\n" +
                "4.\\");
        int c= scanner.nextInt();

        switch (c){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Not found !");
        }

*/

        //================================================================

        /*System.out.println("Enter first number :");
        int n1= scanner.nextInt();
        System.out.println("Enter sec number :");
        int n2= scanner.nextInt();

        int result=n1/n2;

        System.out.println("The result is: " + (result));
        System.out.println("The remainder is :"+(n1-(result*n2)));*/

        //=================================================================

      /*  int x=10;
        int y=5;

        x=x+y; //10+5=15
        y=x-y; //15-5=10
        x=x-y; //15-10=5

        System.out.println("X is "+x);
        System.out.println("Y is "+y);

*/

        //===========================================================================


       /* System.out.println("Enter ( sa, su , mo , tu, we, th, fr)");

        String day = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (day) {
            case "sa":
                System.out.println("Saturday");
                break;
            case "su":
                System.out.println("Sunday");
                break;
            case "mo":
                System.out.println("Monday");
                break;
            case "tu":
                System.out.println("Tuesday");
                break;
            case "we":
                System.out.println("Wednesday");
                break;
            case "th":
                System.out.println("Thursday");
                break;
            case "fr":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Error");
        }*/

        //=================================================

        

    }
}
