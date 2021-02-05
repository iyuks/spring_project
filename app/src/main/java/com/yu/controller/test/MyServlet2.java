package com.yu.controller.test;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("wenhou", "你好");
        req.setAttribute("name", "lucy");
//        req.getRequestDispatcher("/jsp/hello.jsp").forward(req, resp);  yes
        req.getRequestDispatcher("jsp/hello.jsp").forward(req, resp); //yes
    }
}
