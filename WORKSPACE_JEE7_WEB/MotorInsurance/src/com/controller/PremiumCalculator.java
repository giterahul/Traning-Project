package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PremiumCalculator
 */
@WebServlet("/PremiumCalculator")
public class PremiumCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	float depPercentage;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PremiumCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calculateIDV(int cost, float depretation) {
		double idv = cost - ((cost * depretation) / 100);
		return idv;
	}

	public float calculatePremium(double idv, int type, float tax) {
		float netPremium = (float) (idv * 0.021);
		float premium = netPremium + (netPremium * tax) + (netPremium * type / 100) + (netPremium * 18 / 100);
		return premium;
	}

	public float depTodepPercentageConversion(int dep) {
		
		if (dep == 0) {
			depPercentage = 0.0f;
		}
		if (dep == 1) {
			depPercentage = 8.5f;
		} else if (dep == 2) {
			depPercentage = 14.3f;
		} else if (dep == 3) {
			depPercentage = 20.7f;
		} else if (dep == 4) {
			depPercentage = 27.9f;
		} else if (dep == 5) {
			depPercentage = 39.7f;
		} else if (dep >= 6) {
			depPercentage = 49.6f;
		}
		return depPercentage;
	}

	public float cityToTaxConversion(String city) {
		float tax=0f;
		//System.out.println("City....."+city);
		if (city.equalsIgnoreCase("LATUR")) {
			tax = 0.8f;
		} 
		else if (city.equalsIgnoreCase("pune")) {
			tax = 0.6f;
		} 
		else if (city.equalsIgnoreCase("Hydrabad")) {
			tax = 0.9f;
		} else if (city.equalsIgnoreCase("Aurangabad")) {
			tax = 0.5f;
		} else if (city.equalsIgnoreCase("LATUR")) {
			tax = 1.0f;
		} else if (city.equalsIgnoreCase("JALGAON")) {
			tax = 0.75f;
		} else if (city.equalsIgnoreCase("Banglore")) {
			tax = 1.2f;
		}
		System.out.println("Tax..."+tax);
		return tax;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * LocalDate currentDate = LocalDate.now(); // 2016-06-17 int y =
		 * currentDate.getYear(); // 2016 System.out.println(y); PrintWriter
		 * out=response.getWriter(); out.print(y);
		 */

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int passingYear = Integer.parseInt(request.getParameter("passingyear"));
		int cost = Integer.parseInt(request.getParameter("cost"));
		String city = request.getParameter("city");
		String Vtype = request.getParameter("vehicletype");
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int dep = currentYear - passingYear;
		out.print("Dep" + dep);
		double idv = calculateIDV(cost, depTodepPercentageConversion(dep));
		out.println("IDV" + idv);
		//System.out.println(idv);
		int type = 0;
		if (Vtype.equalsIgnoreCase("commercial")) {
			type = 3;
		}
		out.print("\ncity" + city);
		float tax = cityToTaxConversion(city);
		out.print("\ntax" + tax);
		float premium = calculatePremium(idv, type, cityToTaxConversion(city));

		 System.out.println("premium="+premium); 
		 out.print("Premium"+premium);

	}

}
