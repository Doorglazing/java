package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        //        1、导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
        //        2、注册驱动  mysql5可以省略注册步走
//        Class.forName("com.mysql.jdbc.Driver");
        //        3、获取数据库连接对象 Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/door","root", "root");
        //        4、定义sql
        //        5、获取执行sql语句的对象 Statement
        String sql = "insert into account(id, name, balance) values(null, '老王', 1000)";
        //        6、执行sql，接受返回结果
        Statement statement = conn.createStatement();
        //        7、处理结果
        int count = statement.executeUpdate(sql); // 返回收到影响的函数
        if(count > 0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        //        8、释放资源
        statement.close();
        conn.close();
    }
}
