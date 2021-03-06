package user_case.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import user_case.dao.UserDao;
import user_case.domain.User;
import user_case.util.JDBCUtils;

import java.util.*;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        // query() : 查询结果封装为JavaBean对象
        return template.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public void add(User user) {
        String sql = "insert into user values (null, ?,?,?,?,?,?, null, null)";
        template.update(sql, user.getName(), user.getGender(),
                user.getAge(), user.getAddress(),
                user.getQq(), user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        template.update(sql, id);
    }

    @Override
    public void update(User user) {
        String sql = "update user set gender = ?, age = ?, address = ? , qq = ?, email = ? where id = ?";
        template.update(sql, user.getGender(), user.getAge(), user.getAddress(),
                user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public User findUserById(int id) {
        String sql = "select * from user where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public User login(String username, String password) {
        String sql = "select * from user where username = ? and password = ?";
        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
        } catch (Exception e) {
            return null;
        }
        return user;
    }

    @Override
    public int selectTotalCount(Map<String, String[]> map) {
        String sql = "select count(*) from user where 1 = 1 ";
        Set<String> keySet = map.keySet();
        ArrayList<Object> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql);
        for (String key : keySet) {
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            if ("name".equals(key) || "address".equals(key) || "email".equals(key)) {
                String strings = map.get(key)[0];
                if (strings != null && !"".equals(strings)) {
                    sb.append(" and " + key + " like ? ");
                    list.add("%" + strings + "%");
                }
            }
        }
        System.out.println(sb.toString());
        return template.queryForObject(sb.toString(), Integer.class, list.toArray());
    }

    @Override
    public List<User> findPageAll(int start, int row, Map<String, String[]> map) {
        String sql = "select * from user where 1 = 1 ";
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = map.keySet();
        sb.append(sql);
        ArrayList<Object> list = new ArrayList<>();
        for (String key : keySet) {
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            if ("name".equals(key) || "address".equals(key) || "email".equals(key)) {
                String strings = map.get(key)[0];
                if (strings != null && !"".equals(strings)) {
                    sb.append(" and " + key + " like ? ");
                    list.add("%" + strings + "%");
                }
            }
        }
        sb.append(" limit ? , ?");
        System.out.println(sb.toString());
        System.out.println(Arrays.toString(list.toArray()) + "" + start + row);
        list.add(start);
        list.add(row);
        return template.query(sb.toString(), new BeanPropertyRowMapper<User>(User.class), list.toArray());
    }
}
