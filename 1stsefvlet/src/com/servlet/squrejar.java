package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squrejar extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException  {
		
		int num = (int)req.getAttribute("k");
		
		num = num*num;
		
		
		PrintWriter out=res.getWriter();
		
		out.println(num);
		
		
		
		
	}

}
