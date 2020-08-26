package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/request")
public class ServletRequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            System.out.println(name + "------>" + req.getHeader(name));
        }

        String bowser = req.getHeader("user-agent");
        if(bowser.contains("Chrome")){
            System.out.println("此浏览器位Chrome");
        }else if(bowser.contains("Firefox")){
            System.out.println("此浏览器位Firefox");
        }
    }
}
