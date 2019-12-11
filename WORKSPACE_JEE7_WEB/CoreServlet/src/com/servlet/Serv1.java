package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String vaddr=request.getParameter("t3");
		request.getParameter("t3");
		//Cookie e=new Cookie("addr", vaddr);
		
	//	response.addCookie(e);
	PrintWriter pw=response.getWriter();
	pw.println("<html>");
	pw.println("<head>");
	pw.println("</head>");
	pw.println("<body>");
	pw.println("<form method=\"get\" action=\"serv2\">");
	pw.println("<pre>");
	pw.println("user  <input type=\"text\" name=\"t1\"/>");
	pw.println("password  <input type=\"password\" name=\"t2\"/>");
	pw.println("<input type=\"hidden\"name=\"t3\" value='"+vaddr+"'/>");
	pw.println("<input type=\"submit\"valule=\"submit\"/>");
	pw.println("</pre>");
	pw.println("</form></body>");
	pw.println("</html>");
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
