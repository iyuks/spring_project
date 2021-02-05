package com.yu.config.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听HttpSession域对象的创建与销毁：实现HttpSessionListener接口：
 *
 *
 * HttpSession域对象的生命周期：
 * 创建：只要调用了getSession()方法就会创建,一次会话只会创建一次,
 * 销毁：1.超时(默认为30分钟)2.非正常关闭，销毁3.正常关闭服务器(序列化)
 *
 * 每位用户登录网站时都会创建一个HTTPSession对象，利用这个统计在线人数。
 */
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
