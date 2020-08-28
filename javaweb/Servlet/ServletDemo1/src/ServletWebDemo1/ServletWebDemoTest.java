package ServletWebDemo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo3")
public class ServletWebDemoTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  修改编码字符集
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> stringSet = parameterMap.keySet();
        for(String key: stringSet){
            System.out.println(key);
            String[] strings = parameterMap.get(key);
            for(String string : strings){
                System.out.println(string);
            }
        }
        Object msg = req.getAttribute("msg");
        System.out.println(msg);
    }
}
