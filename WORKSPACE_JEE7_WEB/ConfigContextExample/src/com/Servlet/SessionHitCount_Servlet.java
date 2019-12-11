package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.BatchUpdateException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class SessionHitCount_Servlet
 */
@WebServlet("/SessionHitCount_Servlet")
public class SessionHitCount_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionHitCount_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer count=new Integer(0);
		String head;
		if(session.isNew()) {
			head="this is the new session";
		}else {
			head="this is the old session";
			Integer oldcount=(Integer)session.getAttribute("count");
			if(oldcount !=null) {
				count=new Integer(oldcount.intValue()+1);
			}
		}
		session.setAttribute("count", count);
		StringBuffer buffer=new StringBuffer();
		buffer.append("<!DOCTYPE html><html><head><title></titel></head><body>");
		buffer.append("<h2> align='center'>"+head+"</h2>\n");
		buffer.append("<table border=1 align='center'>\n");
		buffer.append("<tr><td>total session accesses</td></td>"+count+"</td><tr>\n");
		
		buffer.append("<tr><td>session Id</td><td>"+session.getId()+"</td><tr>\n");
		buffer.append("<tr><td>session Cretation Time</td><td>"+new Date(session.getLastAccessedTime()));
		buffer.append("<tr><td>session Lat Accesed Time</td><td>"+new Date(session.getLastAccessedTime()));
		
		buffer.append("</table></body></html>");
		out.print(buffer.toString());
		out.flush();
		
	}
		
	}

