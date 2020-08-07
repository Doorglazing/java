package JDBC;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import jdk.nashorn.internal.ir.RuntimeNode;
import sun.misc.Request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //        1、导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
        //        2、注册驱动  mysql5可以省略注册步走
//        Class.forName("com.mysql.jdbc.Driver");
        //        3、获取数据库连接对象 Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/door","root", "root");
        //        4、定义sql
        System.out.println(conn);
        //        5、获取执行sql语句的对象 Statement
        String sql = "update account set balance = 20000 where id = 1";
        //        6、执行sql，接受返回结果
        Statement statement = conn.createStatement();
        //        7、处理结果
        int count = statement.executeUpdate(sql); // 返回收到影响的函数
        System.out.println(count);
        //        8、释放资源
        statement.close();
        conn.close();
    }

}
