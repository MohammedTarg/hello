package Classes.GameCar;

public class KotlinCars extends Car implements CustemPropertiesForCars{


    public KotlinCars(String material, int wheels) {
        super(material, wheels);
    }

    @Override
    public void solarEnergy() {
        System.out.println("solarEnergy\"ON\"");
    }

    @Override
    public void chargingBattery() {
        System.out.println("chargingBattery\"ON\"");
    }

    @Override
    public void solarPanel() {
        System.out.println("solarPanel(5sm)");
    }

    @Override
    public void pure() {

    }

    @Override
    public void areyControl() {
        System.out.println(18+"M");
    }

    @Override
    public void sizeForBattery() {
        System.out.println("2500KW");
    }

    @Override
    public void speed() {
        System.out.println(8+"M/s");
    }
}
