package com.yu.test;

import org.junit.Test;

import java.util.HashMap;

public class CommonTest {
    @Test
    public void test2() {
        HashMap<String, String> map = new HashMap<>();
        String s = map.get("name");
        System.out.println(s);
    }
}
