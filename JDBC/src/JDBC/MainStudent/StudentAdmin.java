package JDBC.MainStudent;

import JDBC.MainStudent.dao.impl.StudentDaolmpl;
import JDBC.MainStudent.demain.Student;

public class StudentAdmin {
    public static void main(String[] args) {
        System.out.println("欢迎登录low版学生管理系统");
        StudentDaolmpl studentDaolmpl = new StudentDaolmpl();
        System.out.println("----------学生列表----------");
        //查询所有
//        System.out.println(studentDaolmpl.findAll());
        // 增加一个
        studentDaolmpl.save(new Student(5,"李四",null, 60,"北京","1381381888"));
        //移除一个
//        studentDaolmpl.remove(2);
        //更改成绩
//        studentDaolmpl.update(new Student(2,"李四","男", 80,"北京","1381381888"));
    }
}
