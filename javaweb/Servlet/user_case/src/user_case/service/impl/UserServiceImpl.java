package user_case.service.impl;

import user_case.dao.UserDao;
import user_case.dao.impl.UserDaoImpl;
import user_case.domain.User;
import user_case.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
     private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(Integer.parseInt(id));
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findUserById(String id) {

        return userDao.findUserById(Integer.parseInt(id));
    }
}
