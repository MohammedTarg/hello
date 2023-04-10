package Classes.Super;

public class Peirson {

   private String name;
    private int age;
    private  int tall;
    String gender;

    public Peirson() {
    }

    public Peirson(String name, int age, int tall, String gender) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Peirson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                ", gender='" + gender + '\'' +
                '}';
    }
}
