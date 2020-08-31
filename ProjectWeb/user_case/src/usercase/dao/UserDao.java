package usercase.dao;

import usercase.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
