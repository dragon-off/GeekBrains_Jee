package ru.gb.javaee.lesson2.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class Charset  implements Filter {
    private ServletContext context;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
       // response.setContentType("text/html; charset=UTF-8");
    }

    @Override
    public void destroy() {

    }
}
