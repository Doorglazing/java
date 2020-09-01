package user_case.service;

import user_case.domain.User;

import java.util.List;

/**
 * 用户管理业务接口
 */

public interface UserService {
    // 查询所有用户信息
    List<User> findAll();

    void add(User user);

    void delete(String id);

    void update(User user);

    User findUserById(String id);

    User login(User user);
}
