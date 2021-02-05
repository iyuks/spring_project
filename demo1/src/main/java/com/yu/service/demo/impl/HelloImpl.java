package com.yu.service.demo.impl;

import com.yu.service.demo.Hello;
import org.springframework.stereotype.Service;

@Service("helloImpl")
public class HelloImpl implements Hello {
    @Override
    public String returnHi() {
        return "hi jack";
    }
}
