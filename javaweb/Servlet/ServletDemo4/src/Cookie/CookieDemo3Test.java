package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@WebServlet("/CookieDemo3")
public class CookieDemo3Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         *  有   不是第一次访问
         *  没有  是第一次访问
         */
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        boolean key = false;
        if(cookies != null && cookies.length > 0){
            for(Cookie cookie : cookies){
                String name = cookie.getName();
                if("lastTime".equals(name)){
                    key = true;
                    String value = cookie.getValue();
                    // 解码
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println(value);
                    resp.getWriter().write("欢迎登录，您的上次访问实际为：" + value);
                    Date date = new Date();
                    String now_date = new SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss").format(date);
                    // 编码
                    System.out.println(now_date);
                    now_date = URLEncoder.encode(now_date, "utf-8");
                    System.out.println(now_date);
                    cookie.setValue(now_date);
                    cookie.setMaxAge(3600*24*30);
                    resp.addCookie(cookie);
                    break;
                }
            }
        }
        if(cookies == null || cookies.length == 0|| key == false){
            Date date = new Date();
            String now_date = new SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss").format(date);
            now_date = URLEncoder.encode(now_date, "utf-8");
            Cookie cookie = new Cookie("lastTime", now_date);
            resp.addCookie(cookie);
            resp.getWriter().write("欢迎您首次访问");
        }


    }
}
