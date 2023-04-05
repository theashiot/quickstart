package com.example.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * A simple HTTP servlet. It returns the Hello, World!  when accessed
 */

@WebServlet("/helloworld")
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<html>");
            writer.println("  <head><title>Hello world servlet</title></head>");
            writer.println("  <body>");
            writer.println("    <h1>Hello, World!</h1>");
            writer.println("  </body>");
            writer.println("</html>");
        }
    }
    
}
