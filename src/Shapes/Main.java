package Shapes;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);


        System.out.println("1.Square\n2.Triangle\n3.Circle");
        int c= scanner.nextByte();
        switch (c) {
            case 1:
                System.out.println("Enter the length");
                int yy= scanner.nextInt();
                System.out.println("enter the with");
                int y= scanner.nextInt();
                System.out.println("1.Dimesions\n2.Area\n3.Perimter");
                int x= scanner.nextByte();
                Square obj1 = new Square(yy, y);
                switch (x) {
                    case 1:
                        obj1.squareDimesions();
                        break;
                    case 2:
                        obj1.areaSquare();
                        break;
                    case 3:
                    obj1.perimterOfSquare();
                    break;
                }break;

            case 2:
                System.out.println("Enter the length");
                int ee= scanner.nextInt();
                System.out.println("enter the with");
                int e= scanner.nextInt();
                Triangle obj2 = new Triangle(ee,e);
                System.out.println("1.Dimesions\n2.Area\n3.Perimter");
                int u= scanner.nextByte();
                switch (u) {
                    case 1:
                        obj2.triangleDimesions();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj2.perimterOfTriangle();
                        break;
                }break;
            case 3:
                System.out.println("Enter the radius");
                int r= scanner.nextInt();
                Circle obj3 = new Circle(r, pi);
                System.out.println("1.CircleDimesions\n2.Area\n3.perimterCircle");
                int t= scanner.nextByte();
                switch (t) {
                    case 1:
                        obj3.radiusDimesions();
                        break;
                    case 2:
                        obj3.area();
                        break;
                    case 3:
                        obj3.perimterCircle();
                        break;
                }break;

        }





    }
}
