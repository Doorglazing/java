package JDBC.SQLZhuRu;

import JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemoSQL {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;

        try {

            // 解决 SQL 注入攻击
            conn  = JDBCUtils.getConnection();
            // 用？ 作为占位符 然后用数据库做预编译阶段生产临时变量集
            String sql = "update account set balance = balance - ? where id = ?";
            String sql1 = "update account set balance = balance + ? where id = ?";
            //
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql1);
            // 给临时变量集赋值
            pstmt.setInt(1, 5000);
            pstmt.setInt(2, 1);
            pstmt2.setInt(1, 800);
            pstmt2.setInt(2, 5);
            pstmt.executeUpdate();// 返回影响几行
            pstmt2.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
