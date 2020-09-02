package user_case.service;

import user_case.domain.BeanPage;
import user_case.domain.User;

import java.util.List;
import java.util.Map;

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

    void checkedDelete(String[] values);

    BeanPage<User>  findUserByPage(String start, String row, Map<String, String[]> map);

}
