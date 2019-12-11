package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleInsert
 */
@WebServlet("/ExampleInsert")
public class ExampleInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExampleInsert() {
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
			String id=request.getParameter("userid");
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			String name=request.getParameter("uname");
			String pass=request.getParameter("upass");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz","root","");
			PreparedStatement pr=conn.prepareStatement("insert into tbl_user values(?,?,?,?,?)");
			//PreparedStatement pr=conn.prepareStatement("delete form emp1 where id=?");
			pr.setString(1, id);
			pr.setString(2, firstname);
			pr.setString(3, lastname);
			pr.setString(4, name);
			pr.setString(5, pass);
			int i=pr.executeUpdate();     //delete form emp1 where id=?
			PrintWriter out=response.getWriter();
			if(i>0)
			{
				//System.out.println("success full login");
				out.print("success full insert");
			}
			else
			{
				//System.out.println("data not insert");
				out.print("not insert data");
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
