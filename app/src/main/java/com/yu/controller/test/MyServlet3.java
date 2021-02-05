package com.yu.controller.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("wenhou", "hi");
        req.setAttribute("name", "lucy");

        Object name = req.getSession().getServletContext().getAttribute("name");
        System.out.println(name);
//        resp.sendRedirect("/jsp/hello.jsp");  //yes
        resp.sendRedirect("jsp/hello.jsp");  //yes
    }
}
