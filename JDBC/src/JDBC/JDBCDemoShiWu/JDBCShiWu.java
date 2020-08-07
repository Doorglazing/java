package JDBC.JDBCDemoShiWu;

import JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCShiWu {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "update account set balance = balance + ? where id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 1000);
            pstm.setInt(2,3);
            pstm.executeUpdate();
            System.out.println(pstm);
            int i = 5/0;
            int count = pstm.executeUpdate();
            conn.commit();
        }catch (Exception e){
            if(pstm != null){
                try{
                    conn.rollback();
                }catch (SQLException e1){
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
}
