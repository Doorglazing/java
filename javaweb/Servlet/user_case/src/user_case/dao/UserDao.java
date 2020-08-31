package user_case.dao;

import user_case.domain.User;

import java.util.List;

public interface UserDao {
    // 用户操作dao
    List<User> findAll();
}
