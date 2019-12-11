package com.allianz.shopping.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.dao.ProductDAODatabaseImpl;
import com.allianz.shopping.dao.ProductDAOImpl;
import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DateUtility;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static ProductDAO productDAO = new ProductDAOImpl();
	static ProductDAO productDAO=new ProductDAODatabaseImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action != null && action.equals("delete")) {
			String id = request.getParameter("id");
			boolean flag = productDAO.deleteProduct(Integer.parseInt(id));
			if (flag) {
				response.sendRedirect("ProductController");
			}
		} 
		else if (action != null && action.equals("edit")) {
			String id = request.getParameter("id");
			Product product = productDAO.getProductById(Integer.parseInt(id));
			if (product != null) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
				request.setAttribute("product", product);
				requestDispatcher.forward(request, response);
			}
		} 
			List<Product> productList = productDAO.getAllProducts();
			RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
			request.setAttribute("productList", productList);
			dispatcher.forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String id = request.getParameter("id");
		String code = request.getParameter("code");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String date = request.getParameter("date");
		
		Product product = new Product();
		product.setCode(code);
		product.setId(Integer.parseInt(id));
		product.setDescription(description);
		product.setPrice(Float.parseFloat(price));
		product.setDate(DateUtility.convertStringToDate(date));
		
		boolean flag;
		if(productDAO.getProductById(Integer.parseInt(id))!= null) {
			flag = productDAO.updateProduct(product);
		}
		else {
			flag = productDAO.addProduct(product);
			
		}
		if(flag) {
			response.sendRedirect("ProductController");
		}
		List<Product> productList = productDAO.getAllProducts();
		RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
		request.setAttribute("productList", productList);
		dispatcher.forward(request, response);
	}

}
