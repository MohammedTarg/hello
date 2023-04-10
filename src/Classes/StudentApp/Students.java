package Classes.StudentApp;

public class Students {

    private String name;
    private int ID;
    private float average;
    private int studingHourPrice;
    private int studyHours;
    private String major;

    public Students() {
    }

    public Students(String name, int ID, float average, int studingHourPrice, int studyHours,String major) {
        this.name = name;
        this.ID = ID;
        this.average = average;
        this.studingHourPrice = studingHourPrice;
        this.studyHours = studyHours;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public int getStudingHourPrice() {
        return studingHourPrice;
    }

    public void setStudingHourPrice(int studingHourPrice) {
        this.studingHourPrice = studingHourPrice;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", average=" + average +
                ", studingHourPrice=" + studingHourPrice +
                ", studyHours=" + studyHours +
                ", major='" + major + '\'' +
                '}';
    }
}
