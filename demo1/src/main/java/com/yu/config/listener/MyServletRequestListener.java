package com.yu.config.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *监听ServletRequest域对象的创建与销毁：实现ServletRequestListener接口。
 *
 *
 * ServletRequest域对象的生命周期：
 * 创建：访问服务器任何资源都会发送请求(ServletRequest)出现,访问.html和.jsp和.servlet都会创建请求。
 * 销毁：服务器已经对该次请求做出了响应。
 *
 */
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }
}
