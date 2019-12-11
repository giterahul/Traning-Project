package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello_Servlet
 */
@WebServlet("/Hello_Servlet")
public class Hello_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello_Servlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Hello_Servlet->def constructor..");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello_Servlet->doGet..");
		String html="<html><head><title>Hello_Servlet</title></head>";
		html+="<body><h2>Hello_Servlet</h2></body></html>";
		response.getWriter().append(html);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("hello_Servlet->doGet..");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello_Servlet->doPost..");
		doGet(request, response);
	}

}
