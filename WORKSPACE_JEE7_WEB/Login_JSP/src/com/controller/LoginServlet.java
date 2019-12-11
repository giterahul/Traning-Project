package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspLogin","root","");
			String uname=request.getParameter("uname");
			String upass=request.getParameter("passw");
			String query="select * from jsptable";
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(query);
			while(rs.next())
			{
				String name=rs.getString(1);
				String pass=rs.getString(2);
				if((name.equals(uname))&&(pass.equals(upass)))
				{
					try
					{
						 RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
						 if(rd!=null)
						 {
							 rd.forward(request, response);
						 }
						
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
			}
			
			try
			{
				RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp");
				if(rd!=null)
				{
					rd.forward(request, response);
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
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
