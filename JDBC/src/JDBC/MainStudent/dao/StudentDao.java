package JDBC.MainStudent.dao;

import JDBC.MainStudent.demain.Student;

import java.util.List;

public interface StudentDao {
    // 学生列表 查询所有学生
    List<Student> findAll();
    // 保存某个学生
    boolean save(Student student);
    // 删除某个学生
    boolean remove(Integer id);
    // 修改学生信息
    void update(Student student);
}
