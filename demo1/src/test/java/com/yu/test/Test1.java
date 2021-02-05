package com.yu.test;


import com.yu.controller.DemoController;
import com.yu.service.order.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

//测试需要servlet
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml"})
public class Test1 {

    @Autowired
    DemoController demoController;
    @Autowired
    OrderService orderService;

    @Test
    public void test1() {
        System.out.println(demoController);
        System.out.println(orderService);
    }




}
