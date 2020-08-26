import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/demo4")
//@WebServlet({"/de4","de44","de444"})
//@WebServlet("/demo4/hh")
//@WebServlet("/start/*")
//@WebServlet("*.start")
public class servletDemo4 extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("httpServlet");
    }
}
