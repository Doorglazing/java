public class TestST {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("周gg",30, "JAVA面向对象知识");
        teacher.eat();
        teacher.teach();
        Student student = new Student("韩dd", 18, "Java面向对象知识");
        student.eat();
        student.study();
    }
}
