package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 设置request编码
        req.setCharacterEncoding("utf-8");
        // 获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //
        HttpSession session = req.getSession();
        String check_code = (String) session.getAttribute("check_code");
        session.removeAttribute("check_code");
        if(checkCode != null && check_code.equalsIgnoreCase(checkCode)){ // TODO dao层判断是否有
            if("liji".equals(username) && "123".equals(password)){
                HttpSession session1 = req.getSession();
                session1.setAttribute("success_user", username);
                resp.sendRedirect(req.getContextPath()+"/Success.jsp");
            }else {
                req.setAttribute("user_error", "用户名或密码错误");
                req.getRequestDispatcher(req.getContextPath() + "/LoginServlet.jsp").forward(req, resp);
            }
        }else {
            req.setAttribute("check_error", "验证码错误");
            req.getRequestDispatcher(req.getContextPath() + "/LoginServlet.jsp").forward(req, resp);
        }
    }
}
