package com.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class RequestLongging_Filter
 */
//@WebFilter("/RequestLongging_Filter")
@WebFilter(
		filterName="RequestLogging_Filter",
		urlPatterns="/*_Servlet",
		description="RequestLogging_Filter logs the request parameters.."
		)

// go4nadeem@gmail.com

public class RequestLogging_Filter implements Filter {
	

   private ServletContext context;
   
    public RequestLogging_Filter() {
        // TODO Auto-generated constructor stub
    }
    public void init(FilterConfig fConfig) throws ServletException {
    	this.context=fConfig.getServletContext();
    	this.context.log("RequestLogging_Filter->init..");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("RequestLogging_Filter->doFilter..");
		
		HttpServletRequest req=(HttpServletRequest) request;
		Enumeration<String> params=req.getParameterNames();
		while(params.hasMoreElements())
		{
			String name=params.nextElement();
			String value=request.getParameter(name);
			this.context.log("RequestLogging_Filter->"+req.getRemoteAddr()+"::Request params::{"+name+"; "+value+"}");
		}
		Cookie[] cookies=req.getCookies();
				if(cookies !=null){
					for(Cookie cookie:cookies)
					{
				
			this.context.log("RequestLogging_Filter->)"+req.getRemoteAddr()+"::cookie{"+cookie.getName()+" "+cookie.getValue()+"}");
		}
				}
		chain.doFilter(request, response);

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	
}
