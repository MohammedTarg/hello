package Classes.Super;

public class SuperMane extends Peirson implements Pouer1{

    public SuperMane(String name, int age, int tall, String gender) {
        super(name, age, tall, gender);
    }

    @Override
    public void flay(int flay) {
        System.out.println(flay+"FromTheErht");
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
    public String toString() {
        return super.toString();
    }
}
