package Pro;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        /*for (int i=0;i<5;i++){

            for (int j=5;j>i;j--){
                System.out.print(j);

            }

            System.out.println("");
        }
*/
       /* for (int i=5;i>=5;i--){
            for (int j=5;j<=i;j--){
                System.out.print(j);
            }
            System.out.println("");
        }*/



        /*int x[] = new int[5];

        for (int i = 0; i < x.length; i++) {
            System.out.println("enter number" +(i+1));
            x[i]= scanner.nextInt();
        }
        for (int i=x.length-1;i>=0;i--){
            System.out.print(x[i]+" ");
        }*/

        /*System.out.println("Enter first number :");
        int x= scanner.nextInt();
        System.out.println("Enter sec number :");
        int y= scanner.nextInt();
        calc(x,y);*/

    }
    public static void calc(int x,int y){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("[1]sum");
        System.out.println("[2]sub");
        System.out.println("[3]mult");
        System.out.println("[4]div");
        int c= scanner1.nextInt();
        switch (c){
            case 1:
                System.out.println(x+"+"+y+"="+(x+y));
                break;
            case 2:
                System.out.println(x+"-"+y+"="+(x+y));
                break;
            case 3:
                System.out.println(x+"*"+y+"="+(x+y));
                break;
            case 4:
                System.out.println(x+"/"+y+"="+(x+y));
                break;
            default:
                System.out.println("Error");
                break;

        }
    }

    public static void quiz(){
        for (int i=1;i<=5;i++){

            for (int j=1;j<=i;j++){             //محمد طارق محمد مصطفى
                System.out.print(j);            //20223138
            }
            System.out.println("");
        }
    }



}
