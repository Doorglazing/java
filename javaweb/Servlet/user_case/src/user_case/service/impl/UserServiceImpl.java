package user_case.service.impl;

import user_case.dao.UserDao;
import user_case.dao.impl.UserDaoImpl;
import user_case.domain.BeanPage;
import user_case.domain.User;
import user_case.service.UserService;

import java.util.List;
import java.util.Map;

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

    @Override
    public User login(User user) {
        return userDao.login(user.getUsername(), user.getPassword());
    }

    @Override
    public void checkedDelete(String[] values) {
        for(String id: values){
            userDao.delete(Integer.parseInt(id));
        }
    }

    @Override
    public BeanPage<User> findUserByPage(String currentPage, String row, Map<String, String[]> map) {
        BeanPage<User> beanPage = new BeanPage<>();
        int totalCount = userDao.selectTotalCount(map);
        System.out.println(totalCount);
        beanPage.setTotalCount(totalCount);
        // 获取当前页面
        int curt = Integer.parseInt(currentPage);
        if(curt <= 0){
            curt = 1;
        }
        beanPage.setCurrentPage(curt);
        // 每页显示多少条
        int rows = Integer.parseInt(row);
        if(rows <= 0){
            rows = 5;
        }
        beanPage.setRows(rows);
        // 每页的起始位置
        int start = (curt-1) * rows;
        // 查询出来的每页页数
        List<User> userList = userDao.findPageAll(start, rows, map);
        beanPage.setList(userList);
        // 总页数
        beanPage.setPageCount(totalCount % rows == 0 ? totalCount / rows : (totalCount / rows) + 1);

        return beanPage;
    }
}
