package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class InsertData_UsingServlet
 */
@WebServlet("/InsertData_UsingServlet")
public class InsertData_UsingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData_UsingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try 
		{
			String name=request.getParameter("uname");
			String pass=request.getParameter("upass");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz","root","");
			//Statement stat=conn.createStatement();
			PreparedStatement pr=conn.prepareStatement("insert into emp1 values(?,?)");
			//int i=pr.executeUpdate();
			pr.setString(1, name);
			pr.setString(2, pass);
			int i=pr.executeUpdate();
			PrintWriter out=response.getWriter();
			if(i>0)
				
			{
				
				out.println("success full insert");
				//<a href="Registration2.jsp">Login Up</a>
			}
			else
			{
				out.println("record not insert");
			}
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
