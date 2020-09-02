package user_case.dao;

import user_case.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 用户操作dao
    List<User> findAll();

    void add(User user);

    void delete(int id);

    void update(User user);

    User findUserById(int id);

    User login(String username, String password);

    // 获取总条数
    int selectTotalCount(Map<String, String[]> map);

    // 查询的每一页的所有记录
    List<User> findPageAll(int start, int row, Map<String, String[]> map);

}
