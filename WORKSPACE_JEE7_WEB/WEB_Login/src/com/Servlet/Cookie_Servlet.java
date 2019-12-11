package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie_Servlet
 */
@WebServlet("/Cookie_Servlet")
public class Cookie_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie c1=new Cookie("username","apache");
		Cookie c2=new Cookie("password","tomcat");
		
		c1.setMaxAge(1000*60*60);
		c2.setMaxAge(1000*60*60);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD>");
	out.println("<TITLE>Cookie Test</TITLE>");
	out.println("</HEAD>");
	out.println("<BODY>");
	out.println("Please click the button to see the cookie sent to you");
	out.println("<BR>");
	out.println("<FORM METHOD=POST>");
	out.println("<INPUT TYPE=HIDDEN NAME='COMPANY' VALUE='Allianz'>");
	out.println("<INPUT TYPE=SUBMIT VALUE=Submit>");
	out.println("</FORM>");
	out.println("</BODY>");
	out.println("</HTML>");
	out.flush();
	
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>COOKIE TEST</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<h2>and, are here all the cookie.</h2>");
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			out.println("<B>Cookie Name:</B>"+ cookie.getName()+"<BR>");
			out.println("<B>Cookie Value:</B>"+ cookie.getValue()+"<BR>");
			
		}
		out.println("Hiddent Filed:"+request.getParameter("COMPANY"));
		out.println("</BODY>");
		out.println("</HTML>");
		
		
		
		//doGet(request, response);
	}

}
