package StudentApp2;

public class Student {



    String name;
    int age;
    int day;
    int month;
    int years;
    long ID;
    float average;
    String major;
    int hours;
    int hourPrice;
    int UniversityId;

    public Student() {
    }


    public Student(String name, int age, int day, int month, int years, long ID, float average, String major, int hours, int hourPrice, int universityId) {
        this.name = name;
        this.age = age;
        this.day = day;
        this.month = month;
        this.years = years;
        this.ID = ID;
        this.average = average;
        this.major = major;
        this.hours = hours;
        this.hourPrice = hourPrice;
        UniversityId = universityId;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(int hourPrice) {
        this.hourPrice = hourPrice;
    }

    public int getUniversityId() {
        return UniversityId;
    }

    public void setUniversityId(int universityId) {
        UniversityId = universityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", day=" + day +
                ", month=" + month +
                ", years=" + years +
                ", ID=" + ID +
                ", average=" + average +
                ", major='" + major + '\'' +
                ", hours=" + hours +
                ", hourPrice=" + hourPrice +
                ", UniversityId=" + UniversityId +
                '}';
    }
}
