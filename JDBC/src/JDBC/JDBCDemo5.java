package JDBC;

import java.sql.*;

public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet set= null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/door","root","root");
            statement = conn.createStatement();
            String sql = "select * from emp";
            set = statement.executeQuery(sql);
            while (set.next()){
                System.out.print(set.getString("ename") + "  ");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(set != null){
                try{
                    set.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
