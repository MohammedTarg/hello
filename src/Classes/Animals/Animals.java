package Classes.Animals;

public class Animals {
    String name;
    int age;
    String sound;
    int x;
    int y;

    public Animals(int xx,int yy){
        x = xx;
        y = yy;
        System.out.println("OMG");
    }
    public Animals(String x,int y){
        this.name=x;
        this.age = y;
        System.out.println(x+" "+y);
    }




    public void addd(){
        System.out.println(x+y);
    }

    public void showName(){
        System.out.println(name);
        System.out.println(age);

    }
    public void ssub(){
        System.out.println(x-y);
    }
    public void sub(){
        System.out.println(x-y);
    }


}
