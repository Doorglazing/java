package user_case.web.servlet;

import user_case.domain.User;
import user_case.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取此id 的user对象
        User user = new UserServiceImpl().findUserById(req.getParameter("id"));
        // 存入 request 域中
        req.setAttribute("user", user);
        req.getRequestDispatcher(req.getContextPath()+"/update.jsp").forward(req, resp);
    }
}
