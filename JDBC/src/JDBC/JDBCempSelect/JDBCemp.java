package JDBC.JDBCempSelect;

import JDBC.JDBCempSelect.domain.Emp;
import JDBC.util.JDBCUtil;
import JDBC.utils.JDBCUtils;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.stax.StAXResult;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCemp {
    public static void main(String[] args) {
        //定义一个方法查询emp表所有的数据
//        System.out.println(findAll());
//        System.out.println(findAllUse());
        System.out.println(findAllUseme());
    }

    public static List<Emp> findAll (){
        Connection conn = null;
        ResultSet rs = null;
        Statement statement = null;
        ArrayList<Emp> list = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/door","root", "root");
//            String sql = "insert into account(id, name, balance) values(null, '老6', 1000)";
//            String sql = "delete from account where id = 4";
            String sql = "select * from emp where";
            statement = conn.createStatement();
//            int count = statement.executeUpdate(sql); // 返回收到影响的函数
            //封装查询结果
            rs = statement.executeQuery(sql);
            //类似与迭代器
            // 让游标移动一下
            list = new ArrayList<>();
            while (rs.next()){
               list.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8)));
            }
        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // 释放资源
            if(statement != null){
                try {
                    statement.close();

                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public static List<Emp> findAllUse (){
        /**
         * JDBCuntils
         *
         */
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try{
            conn = JDBCUtils.getConnection();
            //定义sql
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()){
                list.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8)));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<Emp> findAllUseme(){
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try{
            conn = JDBCUtil.getConnection();
            statement = conn.createStatement();
            String sql = "select * from emp";
            rs = statement.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()){
                list.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8)));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
