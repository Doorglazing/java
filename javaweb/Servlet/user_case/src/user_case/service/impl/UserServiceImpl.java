package user_case.service.impl;

import user_case.dao.UserDao;
import user_case.dao.impl.UserDaoImpl;
import user_case.domain.User;
import user_case.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
     private UserDao user = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return user.findAll();
    }
}
