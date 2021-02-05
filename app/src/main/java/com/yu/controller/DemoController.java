package com.yu.controller;

import com.yu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

@RestController
@RequestMapping("/demoController")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.hello2();
    }


}
