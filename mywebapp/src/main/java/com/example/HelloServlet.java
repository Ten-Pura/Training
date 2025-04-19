package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<h1>Hello from Servlet!<h1>");
            out.println("<p><a href='hello.jsp'>Go to JSP</a></p>");
        }
}