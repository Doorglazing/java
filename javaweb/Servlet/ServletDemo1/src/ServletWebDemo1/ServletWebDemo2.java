package ServletWebDemo1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ServletWebDemo2")
public class ServletWebDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 转发
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/requestDemo5");
//        requestDispatcher.forward(req, resp);
//
        // 转发时存储数据到request域中
        req.setAttribute("msg", "什么");
        req.getRequestDispatcher("/requestDemo3").forward(req, resp);
        // 只能转发当前项目下的指定，外部的不行
        //    req.getRequestDispatcher("http://www.baidu.com").forward(req, resp);


    }
}
