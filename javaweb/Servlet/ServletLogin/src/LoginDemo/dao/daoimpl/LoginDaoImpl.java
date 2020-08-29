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
    User user = null;
    @Override
    public User loginServlet(User user) {
        String sql = "select * from userLogin1 where username = ? and password = ?";
        try{
            conn = JDBCUtils.getConnection();
            System.out.println(conn);
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            while (rs.next()){
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}