package Pro;

import Classes.Super.Peirson;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);




       /* System.out.println("Enter number");
        int v= scanner.nextInt();
        System.out.println(abs(v));*/
        sum();
       /* System.out.println("Enter number");
        int c= scanner.nextInt();
        System.out.println(pow(c));*/

        /*System.out.println("Enter number");
        int c= scanner.nextInt();
        multeNumber(c);
*/

       /* System.out.println("Enter number");
        int x= scanner.nextInt();
        mult(x);*/







        /*for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {

                if (j% 2 == 0) {
                    System.out.print(0);

                }else {

                System.out.print(1);
                }
            }
            System.out.println("");
        }*/


        /*System.out.println("Enter number");
        int x= scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }*/





      /*  System.out.println("Enter number");
        int x= scanner.nextInt();


        for (int i = 1; i < x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/

       /* System.out.println("Enter number :");
        int x= scanner.nextInt();

        for (int i = 0; i <= x; i++) {

            System.out.println("Number ["+i+"] hes cube is"+Math.pow(i,3));
        }*/

        /*System.out.println("Enter number");
        int n= scanner.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println("SUM Is :"+sum);*/



        /*int sum=0;
        for (int i=0;i<=10;i++){
            sum += i;
        }
        System.out.println("SUM Is :"+sum);
*/





/*

        int x = 50, y = 35;


        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x IS "+x);
        System.out.println("Y IS "+y);
*/


       /* int x[] = new int[3];
        int max=0;
        int min=0;
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number ["+(i+1)+"]");
            int n= scanner.nextInt();
            x[i] = n;
            if (i==0){
                min = x[0];
            }
            if (max<x[i]){
                max = x[i];
            }
            if (min>x[i]){
                min = x[i];
            }

        }
        System.out.println("Max Is "+max);
        System.out.println("Min IS "+min);
*/

        /*System.out.println("Enter char");
        String c = scanner.next();

        System.out.println(c);*/



        /*System.out.println("enter number");
        int v= scanner.nextInt();
        System.out.println("Number is "+Math.abs(v));*/


       /* System.out.println("Enter number");
        int n= scanner.nextInt();
        if (n>0){
            System.out.println("Poistev");
        } else if (n<0) {
            System.out.println("Negatev");
        }else {
            System.out.println("Zero");
        }*/

        /*System.out.println("Enter yor name");
        String name= scanner.nextLine();
        System.out.println("NameLength "+name.length());
*/


       /*
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + " is " + (isPrime ? "" : "not ") + "a prime number");
*/

       /* int n = JOptionPane.showConfirmDialog(null, "Hello","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
        if (n == 0) {
            JOptionPane.showMessageDialog(null,"Yes");
        } else if (n==1) {
            JOptionPane.showMessageDialog(null,"No");
        } else {
            JOptionPane.showMessageDialog(null,"Cancel");
        }*/
        /*int n1 = random.nextInt(10) + 1;
        int n2 = random.nextInt(10) + 1;
        int n;
        if (n1>n2){
           *//* n = n1;
            n1 = n2;
            n2 = n;*//*
            int answerPro=n1-n2;
            String inPut = JOptionPane.showInputDialog(null, "What is " + n1 + "-" + n2 + "= ?", "InPut", JOptionPane.QUESTION_MESSAGE);
            int answer = Integer.parseInt(inPut);
            JOptionPane.showMessageDialog(null,n1 + "-" + n2 + "="+answer+" Is "+(answerPro==answer),"Answer",JOptionPane.INFORMATION_MESSAGE);
            main(args);
        }else {
            String ansar = JOptionPane.showInputDialog(null, n1 + "+" + n2 + "=" + "?", "InPut", JOptionPane.QUESTION_MESSAGE);
            int sum = Integer.parseInt(ansar);

            JOptionPane.showMessageDialog(null, n1 + "+" + n2 + "=" + sum + " Is " + (n1 + n2 == sum),"Full It",JOptionPane.INFORMATION_MESSAGE);
            main(args);
        }
*/

       /* int x=10;
        int y = 5;
        int c;

        c = y;
        y = x;
        x = c;
        System.out.println("y"+y);
        System.out.println("x"+x);
*/

     /*   Random random = new Random();
        int n1= random.nextInt(10)+1;
        int n2= random.nextInt(10)+1;
        String ansar = JOptionPane.showInputDialog(null, n1 + "+" + n2 + "=" + "?", "InPut", JOptionPane.QUESTION_MESSAGE);
        int sum = Integer.parseInt(ansar);

            JOptionPane.showMessageDialog(null, n1 + "+" + n2 + "=" + sum + " Is " + (n1 + n2 == sum),"Full It",JOptionPane.INFORMATION_MESSAGE);
            main(args);
*/







 /*   String name = JOptionPane.showInputDialog(null, "Enter yor name", "Title", JOptionPane.QUESTION_MESSAGE);
        float num = Float.parseFloat(name);
    JOptionPane.showMessageDialog(null,"Your name is :"+num,"PrintName",JOptionPane.INFORMATION_MESSAGE);*/

        /*System.out.println("Enter first num");
        int n1= scanner.nextInt();
        System.out.println("enter sec num");
        int n2= scanner.nextInt();


        System.out.println("[1]sum");
        System.out.println("[2]sub");
        System.out.println("[3]mult");
        System.out.println("[4]div");
        int x= scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println(n1+n2);
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
                System.out.println("Not found");
        }
*/

       /* System.out.println("enter your Name");
        String name= scanner.nextLine();
        System.out.println("enter your Age");
        int age= scanner.nextInt();

        JOptionPane.showMessageDialog(null,"Your name Is :"+name+"\n"+
                "Your age Is :"+age);
*/



        /*System.out.println("enter the rad");
        int num1= scanner.nextInt();
        System.out.println("enter the rad");
        int num2= scanner.nextInt();
        float sum=num1+num2;
        System.out.println(sum);*/

      /*  int x= scanner.nextInt();
        for (int i=0;i<x;i++){
            for (int j=0;j<i;j++){
                System.out.println("*");
            }
        }*/



      /*//  System.out.println("enter the rad");
     //   int rad = 5;
        String num = JOptionPane.showInputDialog(null, "Enter the red");
        double n = Integer.parseInt(num);

        String num1 = JOptionPane.showInputDialog(null, "Enter the red");
        double n1 = Integer.parseInt(num);
        double sum = (n + n1);
        int mult = (int) (n * n1);
        double div = n / n1;
                //   System.out.println(area);
                JOptionPane.showMessageDialog(null, "The Sum is :" + sum, "Hello", 2);
        JOptionPane.showMessageDialog(null, "The mult is :" + mult, "Hello", 2);
        JOptionPane.showMessageDialog(null, "The div is :" + div, "Hello", 2);*/

          /* // JOptionPane.showMessageDialog(null,"Hello","Error",JOptionPane.INFORMATION_MESSAGE);

       // System.out.println("Enter the number :");
        String n = JOptionPane.showInputDialog(null,"Enter number",0);
        int num = Integer.parseInt(n);
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null,"The number ["+num+"] is \"Even\"","Even or Odd",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"The number ["+num+"] is \"Odd\"","Even or Odd",JOptionPane.INFORMATION_MESSAGE);
        }
*/

        /*System.out.println("Enter number");
        int num= scanner.nextInt();
        switch (num){
            case 2:

            case 3:
                System.out.println("Tow or Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Other value");
        }
*/

       /* Random random = new Random();
        int rand= random.nextInt(100)+1;

        for (;;){
            String c = JOptionPane.showInputDialog(null, "Enter the number", 0);
            int num = Integer.parseInt(c);

            if (num>rand){
                JOptionPane.showMessageDialog(null,"to High","Random",JOptionPane.INFORMATION_MESSAGE);
               // System.out.println("to High");
            } else if (num<rand) {
                JOptionPane.showMessageDialog(null,"to Low","Random",JOptionPane.INFORMATION_MESSAGE);
               // System.out.println("to Low");
            }else {
                JOptionPane.showMessageDialog(null,"number ["+rand+"] is correct","Good jop",JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("Good jop");
                //System.out.println("number ["+rand+"] is correct");
            }
        }
*//*

        System.out.println("Enter number");
        int number = scanner.nextInt();
        if(number %2 == 0){
            System.out.println("This is an even number");
        } else{
            System.out.println("This is an odd number");

        }

*/

        /*System.out.println("enter number");
        int num= scanner.nextInt();
        System.out.println((num % 2 ==0)?"This is an even number":"This is an odd number");
*/

        /*System.out.println("Enter Number");
        int x = scanner.nextInt();//=5
        int factorial=1;
        for (int i=1;i<=x;i++){//i=2
            factorial *= i;

        }
        System.out.println("Factorial "+factorial);*/

    //JOptionPane.showMessageDialog(null ,"Hello","titel",JOptionPane.PLAIN_MESSAGE);

       /* try {
            String m = JOptionPane.showInputDialog(nuzll, "Enter number");
            int num = Integer.parseInt(m);
            System.out.println(m);
        }catch (Exception c){
            System.out.println(c);
        }*/


     }


     private static void mult(int n){


        for (int i=0;i<=n;i++){
            System.out.println(1+"*"+i+"="+(i*1));
        }
     }

     private static void sum(){
         int sum = 0;
         for (int i = 0; i < 100; i++) {
             if (i % 2 == 1) {
                 System.out.println(i);
                 sum += i;

             }
         }
         System.out.println("Sum Is "+sum);
     }

     private static void multeNumber(int x){
         int mult = 1;
         for (int i = 1; i <= x; i++) {
             mult *= i;
         }
         System.out.println(mult);
     }

     public static int pow(int x){
         return x * x;
     }

     public static int abs(int x){
        if (x>0){
            return x;
        } else if (x<0) {
            return (x * -1) ;
        }else {

            return 0;
        }

     }

}
