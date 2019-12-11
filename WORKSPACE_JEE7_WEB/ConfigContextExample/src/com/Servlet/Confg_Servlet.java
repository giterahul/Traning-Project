package com.Servlet;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Confg_Servlet
 */
@WebServlet(
		urlPatterns = { "/Confg_Servlet" }, 
		initParams = { 
				@WebInitParam(name = "db.driver", value = "com.mysql.jdbc.Driver"), 
				@WebInitParam(name = "db.url", value = "jdbc:mysql://localhost:3306/allianz"), 
				@WebInitParam(name = "db.username", value = "root"), 
				@WebInitParam(name = "db.password", value = "")
		})
public class Confg_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confg_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   @Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	   super.init(config);
	   String Driver=config.getInitParameter("db.driver");
	   String url=config.getInitParameter("db.url");
	   String username=config.getInitParameter("db.username");
	   String password=config.getInitParameter("db.password");
	   
	   
	 /*  getServletContext().setAttribute("db.Driver", Driver);
	   getServletContext().setAttribute("db.url", url);
	   getServletContext().setAttribute("db.username", username);
	   getServletContext().setAttribute("password", password); */
	   
	   Properties props=new Properties();
	   props.put("db.Driver", Driver);
	   props.put("db.url", url);
	   props.put("db.username", username);
	   props.put("db.password", password);
	   props.list(System.out);
	   
	   ServletContext servletcontext=getServletContext();
	   servletcontext.setAttribute("dbProperties", props);
	   
	    
	
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("context_Servlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
