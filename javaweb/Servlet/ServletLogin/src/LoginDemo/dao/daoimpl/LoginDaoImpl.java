package LoginDemo.dao.daoimpl;

import LoginDemo.Utils.JDBCUtils;
import LoginDemo.dao.Login;
import LoginDemo.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements Login {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private User use1 = null;
    @Override
    public User loginServlet(User user) {
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from userlogin1 where username = ? and password = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            while (rs.next()){
                use1 = new User();
                use1.setUsername(rs.getString("username"));
                use1.setPassword(rs.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }
        return use1;
    }
}