package user_case.test;

import org.junit.Test;
import user_case.dao.impl.UserDaoImpl;
import user_case.domain.User;

import java.util.List;

public class TestUserDaoImpl {
    @Test
    public void userDaoImplTest(){
        List<User> users = new UserDaoImpl().findAll();
        for(User user : users){
            System.out.println(user);
        }
    }
}
