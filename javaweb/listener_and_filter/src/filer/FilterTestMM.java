package filer;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FilterTestMM implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    // 假设你的东西没超过18所以不行
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(servletRequest.getParameter("age") != null && servletRequest.getParameter("age").length() > 0){
            servletRequest.setCharacterEncoding("utf-8");
            String age = servletRequest.getParameter("age");
            if(Integer.valueOf(age) > 18){
                // 安全通过
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                servletResponse.setCharacterEncoding("GBK");
                servletResponse.getWriter().write("过两年再来");
            }
        }
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if(request.getParameter("uname").length() > 0 && request.getParameter("password").length() > 0){
            request.getRequestDispatcher("/ele").forward(request, servletResponse);
        }else {
            servletResponse.setCharacterEncoding("GBK");
            servletResponse.getWriter().write("你不信");
        }
    }

    @Override
    public void destroy() {

    }

}
