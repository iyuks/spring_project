package com.yu.config.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----Filter初始化----");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("----调用service之前执行一段代码----");
        chain.doFilter(request, response); // 执行目标资源，放行
        System.out.println("----调用service之后执行一段代码----");
    }

    @Override
    public void destroy() {
        System.out.println("----Filter销毁----");
    }
}
