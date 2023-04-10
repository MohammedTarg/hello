package Classes.Interfises;

public  class Computer {

    String cpu;
    String gpu;
    int stoarg;
    int ram;


    public Computer() {

    }

    public Computer(String cpu, String gpu, int stoarg, int ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.stoarg = stoarg;
        this.ram = ram;
    }



    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", stoarg=" + stoarg +
                ", ram=" + ram +
                '}';
    }
}