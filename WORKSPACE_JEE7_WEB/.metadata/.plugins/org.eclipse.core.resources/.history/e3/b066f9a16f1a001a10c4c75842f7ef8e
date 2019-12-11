package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDAO;
import com.dao.CustomerDAOImpl;
import com.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CustomerDAO customerDAO = new CustomerDAOImpl();
       Customer customer=new Customer();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			  customer.setFirstName(request.getParameter("first_name"));
			  System.out.println(request.getParameter("first_name"));
			 
			customer.setLastName(request.getParameter("last_name"));
			customer.setContactNumber(request.getParameter("contact_no"));
			customer.setEmail(request.getParameter("email"));
			customer.setState(request.getParameter("state"));
			customer.setCity(request.getParameter("city"));
			customer.setAddressLine(request.getParameter("address"));
			customer.setPinCode(Integer.parseInt(request.getParameter("pin_code")));
			customer.setUserName(request.getParameter("username"));
			customer.setPassword(request.getParameter("password"));
			boolean res=customerDAO.registration(customer);
			if(res==true)
			{
				RequestDispatcher rs=request.getRequestDispatcher("Login.jsp");
				rs.forward(request, response);
						return;
			}
			else
			{
				RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
				rs.forward(request, response);
				return;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String uname=request.getParameter("username");
			String pass=request.getParameter("password");
			int customerId=customerDAO.validate(uname,pass);
			
			if(customerId!=0)
			{
				System.out.println("this is valid user");
				request.setAttribute("customerId",String.valueOf(customerId));
				RequestDispatcher rs=request.getRequestDispatcher("PolicyController");
				rs.forward(request, response);
				/*
				 * HttpSession session_id=request.getSession();
				 * session_id.setAttribute("username", uname);
				 */
				
			}
			else
			{
				System.out.println("Not");
				response.sendRedirect("Login.jsp");
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


