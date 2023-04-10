package Classes.GameCar;

public class Main {
    public static void main(String[] args) {


        JavaCars car1 = new JavaCars("Blastek", 4);
        System.out.println(car1.toString());
        car1.pure();
        car1.sizeForBattery();
        car1.areyControl();
        car1.speed();
        System.out.println("=========================================================================================");
        KotlinCars car2 = new KotlinCars("BlastekAndIurn", 4);
        car2.solarEnergy();
        car2.chargingBattery();
        car2.solarPanel();
        car2.sizeForBattery();
        car2.areyControl();
        car2.speed();

    }
}
