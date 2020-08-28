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
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 转发  只能转发到当前项目下的地址 外部不行
        //        RequestDispatcher requestDemo3 = req.getRequestDispatcher("/requestDemo3");
        //        requestDemo3.forward(req, resp);
        // 转发时存储数据到request域中
        req.setCharacterEncoding("utf-8");
        req.setAttribute("msg", "你是个憨批");
        req.getRequestDispatcher("/requestDemo3");
    }
}
