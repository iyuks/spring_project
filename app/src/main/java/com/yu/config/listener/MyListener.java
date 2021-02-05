package com.yu.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Object name = sce.getServletContext().getInitParameter("name");
        System.out.println("servletContextListener中name属性："+(String) name);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
