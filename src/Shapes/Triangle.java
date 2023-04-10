package Shapes;

public class Triangle extends Shape{

    public Triangle() {
    }

    public Triangle(int length, int withe) {
        super(length, withe);
    }
        public void triangleDimesions(){
            System.out.println("Length="+length);
            System.out.println("Withe="+withe);
     }
     public void area(){
         System.out.println("Area="+(length*withe));
     }
     public void perimterOfTriangle(){
         System.out.println("Perimter="+(length+withe)*2);
     }
}
