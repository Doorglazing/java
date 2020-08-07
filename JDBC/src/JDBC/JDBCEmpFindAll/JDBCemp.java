package JDBC.JDBCEmpFindAll;

import JDBC.JDBCEmpFindAll.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCemp {
    public static void main(String[] args) {
        List<Emp> list = findAll();
        for(Emp emp : list){
            System.out.println(emp);
        }
    }
    public static List<Emp> findAll(){
        Connection conn = null;
        Statement statement = null;
        ResultSet set = null;
        ArrayList<Emp> list = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/door","root","root");
            statement = conn.createStatement();
            String sql = "select * from emp";
            set = statement.executeQuery(sql);
            list = new ArrayList<>();
            while (set.next()){
                list.add(new Emp(set.getInt(1),set.getString(2),set.getString(3),set.getInt(4),set.getDate(5),set.getInt(6),set.getInt(7),set.getInt(8)));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(set!=null){
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
        return list;
    }
}
