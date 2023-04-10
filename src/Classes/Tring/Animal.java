package Classes.Tring;

public class Animal {

   private String name;
    int age;

   private  Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(name+" "+age);
    }

    @Override
    public String toString() {
        return "Sty{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
