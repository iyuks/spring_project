package com.yu.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听ServletContext域对象的创建与销毁：实现ServletContextListener接口。
 *
 * ServletContext域对象的生命周期：
 * 创建：启动服务器时创建
 * 销毁：关闭服务器或者从服务器移除项目
 *
 *
 * 利用ServletContextListener监听器在创建ServletContext域对象时完成一些想要初始化的工作
 * 或者执行自定义任务调度。
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁");
    }
}
