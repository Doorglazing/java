package user_case.dao;

import user_case.domain.User;

import java.util.List;

public interface UserDao {
    // 用户操作dao
    List<User> findAll();

    void add(User user);

    void delete(int id);

    void update(User user);

    User findUserById(int id);
}
