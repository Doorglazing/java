package homework;

public class Student extends Person {
    private int fraction;
    public Student() {

    }
    public Student(int fraction) {
        this.fraction = fraction;
    }

    public Student(String name, int age, int fraction) {
        super(name, age);
        this.fraction = fraction;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    public void exam(){
        System.out.println(super.showMsg("name")+"同学" + "," + "考试得了："+ fraction +"分" );
    }
}
