package com.springwebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        System.out.println("In Service");
        res.getWriter().println("<h2>HelloWorld<h2>");
    }


}