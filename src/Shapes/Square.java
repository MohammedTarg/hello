package Shapes;

public class Square extends Shape {

    public Square() {
    }

    public Square(int length, int withe) {
        super(length, withe);
    }

    public void squareDimesions(){
        System.out.println("Length="+length);
        System.out.println("Withe="+withe);
    }

    public void areaSquare(){
        System.out.println("area="+(length*withe));
    }
    public void perimterOfSquare(){
        System.out.println("Perimter="+(length)*4);
    }

}
