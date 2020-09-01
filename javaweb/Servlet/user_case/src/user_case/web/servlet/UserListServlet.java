package user_case.web.servlet;

import user_case.domain.User;
import user_case.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 调用查询数据库所有数据方法
        UserServiceImpl service = new UserServiceImpl();
        List<User> users = service.findAll();
        // 存入Request数据域中？
        req.setAttribute("users", users);
        // 转发到list.jsp页面中
        req.getRequestDispatcher(req.getContextPath()+"/list.jsp").forward(req, resp);
    }
}
