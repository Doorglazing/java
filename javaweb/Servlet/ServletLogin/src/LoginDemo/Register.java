package LoginDemo;


import LoginDemo.dao.daoimpl.RegisterDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/registerDemo")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        System.out.println(username);
        HttpSession session = req.getSession();
        String check_code = (String) session.getAttribute("check_code");
        session.removeAttribute("check_code");
        RegisterDaoImpl registerDao = new RegisterDaoImpl();
        if(check_code != null && check_code.equalsIgnoreCase(checkCode)){
            if(!"".equals(username) && !"".equals(password) && registerDao.select(username) == true){
                registerDao.register(username, password);
                resp.sendRedirect("/Login.jsp");
            }else {
                if("".equals(username) && "".equals(password)){
                    session.setAttribute("rg_error", "用户名和密码不能为空");
                    resp.sendRedirect(req.getContextPath()+ "/Register.jsp");
                }else{
                    session.setAttribute("rg_error", "用户名已经被占用");
                    resp.sendRedirect(req.getContextPath()+ "/Register.jsp");
                }
            }
        }else {
            req.setAttribute("check_error", "验证码错误");
            req.getRequestDispatcher(req.getContextPath()+"/Register.jsp").forward(req, resp);
        }
    }
}
