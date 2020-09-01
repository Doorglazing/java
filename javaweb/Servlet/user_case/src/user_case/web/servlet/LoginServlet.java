package user_case.web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import user_case.domain.User;
import user_case.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        // 获取数据 封装成user对象
        HttpSession session = req.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        System.out.println(checkcode_server);
        String verifycode = req.getParameter("verifycode");
        if(verifycode!="" && checkcode_server.equalsIgnoreCase(verifycode)){
            User user = new User();
            Map<String, String[]> map = req.getParameterMap();
            try {
                BeanUtils.populate(user, map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if(user.getUsername()!="" && user.getPassword()!=""){
                user = new UserServiceImpl().login(user);
                if(user!=null){
                    session.setAttribute("adminName", user.getName());
                    resp.sendRedirect(req.getContextPath() + "/index.jsp");
                }else {
                    req.setAttribute("user_error", "账号或者密码错误");
                    req.getRequestDispatcher(req.getContextPath() + "/login.jsp").forward(req, resp);
                    return;
                }
            }else {
                req.setAttribute("user_error", "账号或者密码不能为空");
                req.getRequestDispatcher(req.getContextPath() + "/login.jsp").forward(req, resp);
                return;
            }
        }else {
            req.setAttribute("user_error", "验证码错误");
            req.getRequestDispatcher(req.getContextPath() + "/login.jsp").forward(req, resp);
        }
    }
}
