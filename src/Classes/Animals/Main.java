package Classes.Animals;

public class Main {
    public static void main(String[] args) {

        System.out.println("OBJ1");
        Animals obj1 = new Animals(30,20);
        obj1.addd();
        obj1.ssub();
        System.out.println("OBJ2");
        Animals obj2 = new Animals(22, 22);
        obj2.addd();
        obj2.ssub();
        Animals obj3 = new Animals("lol",10);
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.x);
        System.out.println(obj3.sound);



      /*  Animals cat1 = new Animals();
        System.out.println("Cat number 1");
        cat1.name = "vovo";
        cat1.age = 10;
        cat1.showName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cat number 2");
        Animals cat2 = new Animals();
        System.out.println("Enter name");
        cat2.name = scanner.nextLine();
        System.out.println("Enter age");
        cat2.age = scanner.nextInt();
        cat2.showName();
        System.out.println("");
        cat2.x = 10;
        cat2.y = 20;
        cat2.add();
        cat2.sub();*/

       /* System.out.println("Cat number 765");
        cat1.name = "momo";
        cat1.age = 5;
        cat1.sound = "meaww";
        System.out.println(cat1.name+cat1.age+cat1.sound);
*/


      /*  System.out.println("Cat number 2");
        cat2.name = "soso";
        System.out.println(cat2.name);
*/

    }
}
