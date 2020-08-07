package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/door","root", "root");
            //        4、定义sql
            //        5、获取执行sql语句的对象 Statement
//            String sql = "insert into account(id, name, balance) values(null, '老6', 1000)";
            String sql = "delete from account where id = 4";
            //        6、执行sql，接受返回结果;
            statement = conn.createStatement();
            //        7、处理结果
            int count = statement.executeUpdate(sql); // 返回收到影响的函数
            if(count > 0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
            //        8、释放资源

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
        }
    }
}
