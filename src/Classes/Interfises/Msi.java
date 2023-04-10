package Classes.Interfises;

public class Msi extends Computer implements CoolerWater{


    public Msi(String cpu, String gpu, int stoarg, int ram){
        super(cpu, gpu, stoarg, ram);
    }

    @Override
    public void tank(int ml) {
        System.out.println(ml+"ML");
    }

    @Override
    public void tube(int m) {
        System.out.println(m+"SM");
    }
    @Override
    public void RGP(String calor) {
        System.out.println(calor);
    }
    @Override
    public String toString() {
        return "Msi{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", stoarg=" + stoarg +
                ", ram=" + ram +
                '}';
    }



}
