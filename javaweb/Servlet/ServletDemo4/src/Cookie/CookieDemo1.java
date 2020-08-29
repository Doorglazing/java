package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        Cookie cookie = new Cookie("id", "124");
        Cookie cookie1 = new Cookie("name", "hanpi");
        // 设置多少秒后过期
//        cookie.setMaxAge(30);
        // 复数设置是默认， 默认cookie1是绘画级别 随着浏览器的打开打开 随着浏览器关闭而关闭

//        cookie1.setMaxAge(-1);

        // 0 为删除cookie
//        cookie1.setMaxAge(0);

        // 设置一个path 让所有cookie共享
//        cookie.setPath("");
        resp.addCookie(cookie);

        resp.addCookie(cookie1);
    }
}
