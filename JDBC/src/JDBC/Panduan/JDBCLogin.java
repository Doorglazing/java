package JDBC.Panduan;

import JDBC.util.JDBCUtil;
import JDBC.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCLogin {
    public static void main(String[] args) {
        System.out.println("请输出账号");
        Scanner scan =  new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("请输入密码");
        String password = scan.nextLine();

        if(login(userName,password)){
            System.out.println("登录成功");
        }else {
            System.out.println("账号密码错误");
        }
        scan.close();
    }
    public static boolean login(String userName , String password){
        if(userName == null || password == null){
            return false;
        }
        Connection conn = null;
//        Statement state = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
//            state = conn.createStatement();
//            String sql = "select * from user where username =  '"+userName +"'and password = '"+ password +"'";
//            System.out.println(sql);
            //解决sql注入
            String sql = "select * from user  where username = ? and password = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, userName);
            pst.setString(2, password);
            //此时查询不需要传递sql
            rs = pst.executeQuery();
//            rs = state.executeQuery(sql);
            return rs.next();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pst,conn);
        }

        return false;
    }
}
