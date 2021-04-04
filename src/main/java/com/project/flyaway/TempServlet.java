package com.project.flyaway;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
    Author Name : Harsh Upadhyay
    Date Create : 02-04-2021
    Project Name : flyaway
*/
public class TempServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int ans = i + j;

        PrintWriter out = resp.getWriter();
        out.println(ans);
        //System.out.println(ans);
    }
}
