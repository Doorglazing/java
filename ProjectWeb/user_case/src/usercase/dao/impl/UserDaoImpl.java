package usercase.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import usercase.dao.UserDao;
import usercase.domain.User;
import usercase.util.JDBCUtils;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        return  template.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }
}
