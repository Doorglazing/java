package LoginDemo.dao.daoimpl;

import LoginDemo.Utils.JDBCUtils;
import LoginDemo.dao.RegisterDao;
import LoginDemo.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class RegisterDaoImpl implements RegisterDao {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private User use1 = null;
    private static int i = 10001;
    @Override
    public void register(String username, String password) {
        String sql = "insert into userlogin1(username, password, uid) VALUE (?,?,?)";
        try{
            conn = JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, Integer.toString(++i));
            pst.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }
    }
    public Boolean select (String username){
        String sql = "select * from userlogin1 where username = ?";
        try {
            conn = JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if(rs.next()){
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }

        return true;
    }
}
