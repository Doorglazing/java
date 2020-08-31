package user_case.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import user_case.dao.UserDao;
import user_case.domain.User;
import user_case.util.JDBCUtils;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        // query() : 查询结果封装为JavaBean对象
        return template.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }
}
