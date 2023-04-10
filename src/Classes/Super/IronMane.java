package Classes.Super;

public class IronMane extends Peirson implements Pouer2{

    public IronMane() {
    }

    public IronMane(String name, int age, int tall, String gender) {
        super(name, age, tall, gender);
    }

    @Override
    public void flay(int fay) {
        System.out.println(fay+"FromTheErth");
    }

    @Override
    public void stroing(int strong) {
        System.out.println(strong+"%");
    }

    @Override
    public void speed(int speed) {
        System.out.println(speed+"KM/s");
    }

    @Override
    public void money() {
        System.out.println("rich");
    }

    @Override
    public String iq() {
        return "200%";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
