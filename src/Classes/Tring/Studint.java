package Classes.Tring;

public class Studint {

    String name;
    int age;

    public Studint() {
    }

    public Studint(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studint{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
