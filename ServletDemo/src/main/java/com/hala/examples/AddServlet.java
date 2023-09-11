package com.hala.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException ,ServletException {
		
		
//		int i =Integer.parseInt(req.getParameter("num1"));
//		int j =Integer.parseInt(req.getParameter("num2"));
//		
//		int sum=i+j;
		
		
		
//		printing result to editor console
//		System.out.println("result is " + sum);
		
		
//		print result to response
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.println("result is " +sum);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//using request dispatcher
//		req.setAttribute("sum", sum);
//		
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		try {
//			rd.forward(req, res);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		using redirect
//		try {
////			res.sendRedirect("sq");
//			//URL rewriting
//			res.sendRedirect("sq?k="+sum);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		//sending session Attribute while using redirect
//		HttpSession session = req.getSession() ;
//		session.setAttribute("k", sum);
//		try {
//			res.sendRedirect("sq");		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		
		
		
//		//HttpSession Cookie
//		Cookie cookie = new Cookie("k",sum+"");
//		res.addCookie(cookie);
//		try {
//			res.sendRedirect("sq");		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		 Servlet Context
		
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.print("Hi ");
//			
//			ServletContext ctx = getServletContext();
//			String str = ctx.getInitParameter("name");
//			out.println(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		Servlet Configurations  
		
//		PrintWriter out;
//		try {
//			out = res.getWriter();
//			out.print("Hi ");
//			
//			ServletConfig ctx = getServletConfig();
//			String str = ctx.getInitParameter("name");
//			out.println(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//try factorial example
		//Task 1
//		int fact = 1;
//		PrintWriter out = res.getWriter();
//		out.print("<style>"+"table,th,td{"+
//		"border: 1px solid black;"
//		+"}"
//		+"</style>");
//		out.print("<table>"+"<tr>"+
//		"<td>"+"number"+"</td>"+"<td>"+"factorial"+"</td>"+  
//		  "</tr>"	 
//		);
//		
//		
//		for(int i=0;i<=10;i++)
//		{
//			if(i==0) {
//				fact =1;
//			}
//			else {
//				 fact = fact*i;
//				}
//			
//			out.print("<tr>"+
//					  "<td>"+i+"</td>"+"<td>"+fact+"</td>"+      
//					  "</tr>");
//	}
//		out.print("</table>");
	
		
		
		//Task 2
		
		LocalDate date1 =LocalDate.parse(req.getParameter("birthday"));
		
		LocalDate date2 =LocalDate.parse(req.getParameter("ageAt"));
		PrintWriter out = res.getWriter();
		out.println(date1);
		out.println(date2);
		Period period = Period.between(date1, date2);
		int years =period.getYears(); 
		period = period.minusYears(years);
		int months = period.getMonths();
		period = period.minusMonths(months);
		 int days = period.getDays();
		 period = period.minusDays(days);
		req.setAttribute("years",years);
		req.setAttribute("months",months);
		req.setAttribute("days",days);
		req.setAttribute("date1", date1);
		req.setAttribute("date2", date2);
		
		RequestDispatcher rd = req.getRequestDispatcher("task2.jsp");
		rd.forward(req, res);
		
}
}
