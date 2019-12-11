package com.allianz.shopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.allianz.shopping.dao.LoginDAO;
import com.allianz.shopping.dao.LoginDAOImpl;
import com.allianz.shopping.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDAO logindao = new LoginDAOImpl();
	Customer customer = new Customer();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerController() {
		super();
// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			customer.setUsername(request.getParameter("username"));
			customer.setPassword(request.getParameter("password"));
			customer.setFirstname(request.getParameter("firstname"));
			customer.setLastname(request.getParameter("lastname"));
			customer.setMobno(request.getParameter("mobno"));
//customer.setMobno(Integer.parseInt(request.getParameter("mobno")));
			boolean state = logindao.registerUser(customer);

			if (state == true) {
				RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
				rs.forward(request, response);
			} else {
				RequestDispatcher rs = request.getRequestDispatcher("Register.jsp");
				rs.forward(request, response);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			customer.setUsername(request.getParameter("username"));
			customer.setPassword(request.getParameter("password"));
			boolean state = logindao.validate(customer);
			if (state == true) {
				HttpSession sessionid = request.getSession();
				sessionid.setAttribute("usernamesession", request.getParameter("username"));
				response.sendRedirect("ProductController");
			} else {
				response.sendRedirect("login.jsp");

			}
		} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}