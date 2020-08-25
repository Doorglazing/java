import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Date;


@WebServlet("/door")
public class Servlet3Demo1 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        boolean j = true;
        boolean i = true;
        if(j=i){

        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet3.0好使");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

}
