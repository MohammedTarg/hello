package Shapes;

public class Circle extends Shape{
    int radius;

    double pi=Math.PI;
    public Circle(){

    }

    public Circle(int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }
    public void radiusDimesions(){
        System.out.println("Radius="+radius);
    }
    public void area(){
        System.out.println("Area="+pi*Math.pow(radius,2));
    }
    public void perimterCircle(){
        System.out.println("Perimter="+(2*pi*radius));
    }


}


