package Classes.Super;

public class Main {
    public static void main(String[] args) {

        /*SuperMane man1 = new SuperMane("hamada",40,2,"male");
        System.out.println(man1.toString());
        man1.flay(1500);
        man1.stroing(1000);
        man1.speed(3);
*/

        IronMane man2 = new IronMane("Tone",20,2,"male");
        System.out.println(man2.toString());
        man2.flay(1000);
        man2.iq();
        man2.money();
        man2.speed(1000);
    }
}
