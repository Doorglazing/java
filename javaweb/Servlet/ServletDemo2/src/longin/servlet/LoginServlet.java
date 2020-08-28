package longin.servlet;

import longin.dao.impl.UserDaoImpl;
import longin.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserDaoImpl userDao = new UserDaoImpl();
        User user1 = userDao.Login(user);
        if(user1 != null){
            System.out.println("登录成功");
            req.setAttribute("user", user);
            req.getRequestDispatcher("/SuccessServlet").forward(req, resp);
        }else {
            System.out.println("登录失败");
            req.getRequestDispatcher("/FailServlet").forward(req, resp);
        }
    }
}
