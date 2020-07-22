package homework;

public class Teacher extends Person{
    private String subject;
    Teacher(){}
    Teacher(String subject){
        this.subject = subject;
    }
    Teacher(String name, int age, String subject){
        super(name,age);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach(){
        System.out.println(super.showMsg("name")+ "老师" + ","+"讲授"+subject+"课");
    }
}
