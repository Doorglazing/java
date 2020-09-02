package user_case.web.servlet;

import user_case.domain.BeanPage;
import user_case.domain.User;
import user_case.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/UserListPageServlet")
public class UserListPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        HttpSession session = req.getSession();
        Map<String, String[]> map = req.getParameterMap();
        String currentPage = req.getParameter("currentPage");
        if (currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        String rows = req.getParameter("rows");
        if (rows == null || "".equals(rows)){
            rows = "5";
        }

        BeanPage<User> beanPage = new UserServiceImpl().findUserByPage(currentPage, rows, map);
        req.setAttribute("map", map);
        req.setAttribute("bp", beanPage);
        req.getRequestDispatcher(req.getContextPath()+"/list.jsp").forward(req, resp);
    }
}
