package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletRequest1")
public class ServletRequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取请求类型
        String method = req.getMethod();
        System.out.println(method);
        // 2. 获取虚拟路径
        String context = req.getContextPath();
        System.out.println(context);
        // 3. 获取servlet路径
        String path = req.getServletPath();
        System.out.println(path);
        // 4. 获取请求参数
        String queryString = req.getQueryString();
        System.out.println(queryString);
        // 5. 获取URI
        String uri = req.getRequestURI();
        StringBuffer url = req.getRequestURL();
        System.out.println(uri);
        System.out.println(url);
        // 6. 获取协议版本
        String pro = req.getProtocol();
        System.out.println(pro);
        // 7. 获取客户机ip协议
        String addr = req.getRemoteAddr();
        System.out.println(addr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
