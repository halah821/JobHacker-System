package com.hala.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sqrServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res ) {
		
		
		//print out result sent in request from AddServlet
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.println("Hello to sqr   "+req.getAttribute("sum"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		print to console
//		System.out.println("sq called");
		
		
		
//		try getting attribute after send redirect
//		int k = Integer.parseInt(req.getParameter("k"));
//		k=k*k;
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.println("Hello to sqr   "+k);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		using sessions to get attributes from previous servlet
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		k=k*k;
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.println("Result is   "+k);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//HttpSession Cookie
		int k =0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		PrintWriter out;
		try {
			out = res.getWriter();
			out.println("Result is :::   "+k);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
