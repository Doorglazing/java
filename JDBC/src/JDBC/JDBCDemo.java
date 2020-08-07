package JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/door", "root", "root");
        Statement statement = conn.createStatement();
        String sql = "select * from emp";
        ResultSet set =  statement.executeQuery(sql);
        while (set.next()){
            System.out.println(set.getInt(1) + set.getString("ename"));
        }
        conn.close();
    }

}
