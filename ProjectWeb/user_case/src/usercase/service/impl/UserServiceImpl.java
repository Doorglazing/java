package usercase.service.impl;

import usercase.dao.UserDao;
import usercase.dao.impl.UserDaoImpl;
import usercase.domain.User;
import usercase.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao user = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return user.findAll();
    }
}
