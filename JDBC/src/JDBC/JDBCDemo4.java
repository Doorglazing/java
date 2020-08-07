package JDBC;

import java.sql.*;

public class JDBCDemo4 {
    // 查询语句
    public static void main(String[] args) {
        Connection conn = null;
        ResultSet rs = null;
        Statement statement = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/door","root", "root");
//            String sql = "insert into account(id, name, balance) values(null, '老6', 1000)";
//            String sql = "delete from account where id = 4";
            String sql = "select * from account";
            statement = conn.createStatement();
//            int count = statement.executeUpdate(sql); // 返回收到影响的函数
            //封装查询结果
            rs = statement.executeQuery(sql);
            //类似与迭代器
            // 让游标移动一下
            while (rs.next()){
                System.out.println(rs.getInt(1)+rs.getString("name")+rs.getInt(3));
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
    }
}
