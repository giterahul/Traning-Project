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
import com.allianz.shopping.dao.ProductDaoImpl;
import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DateUtility;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 static ProductDAO dao=new ProductDaoImpl();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action !=null && action.equals("delete")) {
			String id=request.getParameter("id");
			boolean flag=dao.deleteProduct(Integer.parseInt(id));
			if(flag)
			{
				response.sendRedirect("ProductController");
			}
		}
		else
		{
		List<Product>productlist=dao.getAllProducts();
		RequestDispatcher dispatcher=request.getRequestDispatcher("ProductList.jsp");
		request.setAttribute("ProductList", productlist);
		dispatcher.forward(request, response);
	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		String id=request.getParameter("id");
		String code=request.getParameter("code");
		String description=request.getParameter("description");
		String price=request.getParameter("price");
		String date=request.getParameter("date");
		
		Product prodcut=new Product();
		prodcut.setCode(code);
		prodcut.setId(Integer.parseInt(id));
		prodcut.setDescription(description);
		prodcut.setPrice(Float.parseFloat(price));
		prodcut.setDate(DateUtility.convertStringToDate(date));
		
		
		boolean flag;
		if(ProductDAO.getProductById(Integer.parseInt(id))!= null) {
			flag = ProductDAO.updateProduct(prodcut);
		}
		else {
			flag = ProductDAO.addProduct(prodcut);
			
		}
		if(flag) {
			response.sendRedirect("ProductController");
		}
	}

}
