package Classes.GameCar;

public class JavaCars extends Car implements PropertiesForCars{

    public JavaCars() {
    }

    public JavaCars(String material, int wheels) {
        super(material, wheels);
    }

    @Override
    public void pure() {
        System.out.println("Battery");
    }

    @Override
    public void areyControl() {
        System.out.println("20M");
    }

    @Override
    public void sizeForBattery() {
        System.out.println("3000KW");
    }

    @Override
    public void speed() {
        System.out.println("10M/s");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
