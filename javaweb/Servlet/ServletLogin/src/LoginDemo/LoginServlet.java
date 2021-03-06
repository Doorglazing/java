package LoginDemo;

import LoginDemo.dao.daoimpl.LoginDaoImpl;
import LoginDemo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("utf-8");
        // 获取数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        HttpSession session = req.getSession();
        String check_code = (String) session.getAttribute("check_code");
        session.removeAttribute("check_code");

        if(check_code != null && check_code.equalsIgnoreCase(checkCode)){
            User user1 = new User();
            user1.setUsername(username);
            user1.setPassword(password);
            user1 = new LoginDaoImpl().loginServlet(user1);
            if(user1 != null){
                req.getSession().setAttribute("user", username);
                resp.sendRedirect(req.getContextPath()+"/Success1.jsp");
            }else {
                req.setAttribute("login_error", "账号或密码错误");
                req.getRequestDispatcher(req.getContextPath()+"/Login.jsp").forward(req, resp);
            }
        }else{
            req.setAttribute("check_error", "验证码错误");
            req.getRequestDispatcher(req.getContextPath()+"/Login.jsp").forward(req, resp);
        }
    }
}
