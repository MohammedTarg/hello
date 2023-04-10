package Classes.Interfises;

public class Main {
    public static void main(String[] args) {

        Msi pc1 = new Msi("IntelCor i7","RTX3050",1,16);
        System.out.println(pc1.toString());
        pc1.tank(200);
        pc1.tube(140);
        pc1.RGP("Ploy");
        MsiCustem mo = new MsiCustem("IntelCor i5","RTX3050",1,16);


    }
}
