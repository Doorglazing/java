package homework;

public class testManager {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平", 38, "java");
        teacher.teach();
        Student student = new Student("李小乐", 19, 90);
        student.exam();
    }
}
