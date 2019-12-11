package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PolicyDAO;
import com.dao.PolicyDAOImpl;
import com.model.Policy;
import com.model.Vehicle;

/**
 * Servlet implementation class PolicyController
 */
@WebServlet("/PolicyController")
public class PolicyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     PolicyDAO policyDAO=new PolicyDAOImpl();
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolicyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId= (String) request.getAttribute("customerId");
		int customerID=Integer.parseInt(customerId);
		PrintWriter out=response.getWriter();
		out.print("i m in policy controller"+customerId );
		List<Policy> policyList=new ArrayList<Policy>();
		
		policyList=policyDAO.getPolicyByCustomerId(customerID);
		System.out.println(policyList);
		request.setAttribute("policyList", policyList);
		request.getRequestDispatcher("policy.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
