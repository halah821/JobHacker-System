package com.hala;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		int fact = 1;
		
		PrintWriter out = res.getWriter();
		
		out.print("<style>"+"table,th,td{"+
		"border: 1px solid black;"
		+"}"
		+"</style>");
		out.print("<table>"+"<tr>"+
		"<td>"+"number"+"</td>"+"<td>"+"factorial"+"</td>"+  
		  "</tr>"	 
		);
		
		
		for(int i=0;i<=10;i++)
		{
			if(i==0) {
				fact =1;
			}
			else {
				 fact = fact*i;
				}
			
			out.print("<tr>"+
					  "<td>"+i+"</td>"+"<td>"+fact+"</td>"+      
					  "</tr>");
	}
		out.print("</table>");
	}

	

}
