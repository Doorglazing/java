package JDBC.MainStudent.dao.impl;

import JDBC.MainStudent.dao.StudentDao;
import JDBC.MainStudent.demain.Student;
import JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaolmpl implements StudentDao {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ArrayList<Student> list = null;
    @Override
    public List<Student> findAll() {
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "Select * from studentManage";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            conn.commit();
            list = new ArrayList<>();
            while (rs.next()){
                list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
            }
        }catch(Exception e){
            rollback(pst, conn);
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }
        return list;
    }

    @Override
    public boolean save(Student student) {
        List<Student> list = new StudentDaolmpl().findAll();
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if(list.get(i).getId() == student.getId()){
                System.out.println("已经存在此人");
                return true;
            }
        }
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into studentManage values(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            System.out.println(pst);
            pst.setInt(1, student.getId());
            pst.setString(2, student.getName());
            pst.setString(3, student.getGender());
            pst.setInt(4, student.getScore());
            pst.setString(5, student.getAddr());
            pst.setString(6,student.getTel());
            pst.executeUpdate();
            conn.commit();
            return true;
        }catch (Exception e){
            rollback(pst, conn);
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null, pst, conn);
        }

        return false;
    }

    @Override
    public boolean remove(Integer id) {
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "delete from studentManage where id = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            conn.commit();
            return true;
        }catch (Exception e){
            rollback(pst, conn);
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null, pst, conn);
        }
        return false;
    }

    @Override
    public void update(Student student) {
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "update studentManage set score = ? where id = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, student.getScore());
            pst.setInt(2, student.getId());
            pst.executeUpdate();
            conn.commit();
        }catch (Exception e){
            rollback(pst, conn);
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null, pst, conn);
        }
    }
    // 减少代码冗余度
    private static void rollback(PreparedStatement pst, Connection conn){
        if(pst != null){
            try{
                conn.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
        }
    }

}
