package com.allianz.shopping.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allianz.shopping.dao.CategoryDAO;
import com.allianz.shopping.dao.CategoryDAODatabaseImpl;
import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.dao.ProductDaoDatabaseImpl;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DateUtility;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDAO impl = new ProductDaoDatabaseImpl();
	CategoryDAO imp = new CategoryDAODatabaseImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 * 
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
		String id = request.getParameter("id");
		if (action != null && action.equals("delete")) {
			boolean flag = impl.deleteProduct(Integer.parseInt(id));
			if (flag) {
				response.sendRedirect("ProductController");
			}
		} else if (action != null && action.equals("edit")) {
			Product product = impl.getProductById(Integer.parseInt(id));
			if (product != null) {
				request.setAttribute("product", product);
				request.getRequestDispatcher("product.jsp").forward(request, response);
			}
		} else if (action != null && action.equals("getProductById")) {
			String str = request.getParameter("productid");
			Product product = impl.getProductById(Integer.parseInt(str));
			if (product != null) {
				request.setAttribute("product", product);
				request.getRequestDispatcher("subpage.jsp").forward(request, response);
			}
		} else if (action != null && action.equals("addToCart")) {
			String str = request.getParameter("productid");
			Product product = impl.getProductById(Integer.parseInt(str));
			if (product != null) {
				List<Product> productList = new ArrayList<Product>();
				if (request.getSession().getAttribute("productList") != null) {
					productList = (List<Product>) request.getSession().getAttribute("productList");
					productList.add(product);
					request.getSession().setAttribute("productList", productList);
				}
				else {
					productList.add(product);
					request.getSession().setAttribute("productList", productList);
				}

				request.setAttribute("product", product);
				request.getRequestDispatcher("addTocart.jsp").forward(request, response);
			}
		}
		else if(action !=null && action.equals("deleteFromatCart"))
		{
			String index=request.getParameter("index");
			List<Product> productList=new ArrayList<Product>();
			if(request.getSession().getAttribute("productList")!=null)
			{
				productList=(List<Product>)request.getSession().getAttribute("productList");
				productList.remove(Integer.parseInt(index));
				request.getSession().removeAttribute("productList");
				request.getSession().setAttribute("productList", productList);
				
			}
			RequestDispatcher dispatcher=request.getRequestDispatcher("addTocart.jsp");
			dispatcher.forward(request, response);
		}

		else if (action != null && action.equals("getAllProductByCategory")) {
			String category_id = request.getParameter("category_id");
			List<Product> list = impl.getAllProductByCategory(Integer.parseInt(category_id));
			List<Category> categoryList = imp.getAllCategory();
			request.setAttribute("list", list);
			request.setAttribute("categoryList", categoryList);

			request.getRequestDispatcher("index.jsp").forward(request, response);

		} else if (action != null && action.equals("new")) {

			Product product = new Product();
			if (product != null) {
				request.setAttribute("product", product);
				request.getRequestDispatcher("product.jsp").forward(request, response);
			}

		} else {
			List<Product> list = impl.getAllProduct();
			request.setAttribute("list", list);
			List<Category> list1 = imp.getAllCategory();
			request.setAttribute("list1", list1);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && (action.equals("update") || action.equals("save"))) {
			String productId = request.getParameter("productId");
			String productCode = request.getParameter("productCode");
			String productDesc = request.getParameter("productDesc");
			String productPrice = request.getParameter("productPrice");
			String munfDate = request.getParameter("munfDate");
			Product product = new Product();
			product.setProductId(Integer.parseInt(productId));
			product.setProductCode(productCode);
			product.setPrice(Float.parseFloat(productPrice));
			try {
				product.setMunfDate(DateUtility.converStringToDate(munfDate));
				product.setDescription(productDesc);
				boolean flag = false;

				if (impl.getProductById(Integer.parseInt(productId)) != null) {
					flag = impl.updateProduct(product);
				} else {
					flag = impl.addProduct(product);
				}
				if (flag)
					response.sendRedirect("ProductController");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (action != null && action.equals("save")) {
			String productId = request.getParameter("productId");
			String productCode = request.getParameter("productCode");
			String productDesc = request.getParameter("productDesc");
			String productPrice = request.getParameter("productPrice");
			String munfDate = request.getParameter("munfDate");
			Product product = new Product();
			product.setProductId(Integer.parseInt(productId));
			product.setProductCode(productCode);
			product.setPrice(Float.parseFloat(productPrice));
			try {
				product.setMunfDate(DateUtility.converStringToDate(munfDate));
				product.setDescription(productDesc);
				boolean flag = false;
				if (impl.getProductById(Integer.parseInt(productId)) != null) {
					flag = impl.updateProduct(product);
				} else {
					flag = impl.addProduct(product);
				}
				if (flag)
					response.sendRedirect("ProductController");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		List<Product> list = impl.getAllProduct();
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
