package com.yu.controller;

import com.yu.service.demo.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demoController")
public class DemoController {
    @Autowired
    private Hello hello;

    //只需要一个包扫描即可访问
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(defaultValue = "suyanchao") String name) {
        return String.format("hello %s", name);
    }


    @GetMapping("/getHiJack")
    public String getHiJack() {
        return hello.returnHi();
    }
}
