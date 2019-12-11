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
@WebServlet("/PremiumController")
public class PremiumController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	float depPercentage;
	double idv;
	float netPremium;
	float Commercial;
	float roadTax;
	float gst;
	float subtotal;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PremiumController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calculateIDV(float cost, float depretation) {
		idv = cost - ((cost * depretation) / 100);
		return idv;
	}

	public float calculatePremium(double idv, int type, float tax) {
		netPremium = (float) (idv * 0.026);
		Commercial = netPremium * type / 100;
		roadTax = netPremium * tax;
		gst = netPremium * 18 / 100;
		subtotal = netPremium + (netPremium * tax) + (netPremium * type / 100);
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
		System.out.println("City....."+city);
		if (city.equalsIgnoreCase("LATUR")) {
			tax = 0.2f;
		} 
		else if (city.equalsIgnoreCase("pune")) {
			tax = 0.3f;
		} 
		else if (city.equalsIgnoreCase("Hydrabad")) {
			tax = 0.5f;
		} else if (city.equalsIgnoreCase("Aurangabad")) {
			tax = 0.3f;
		} else if (city.equalsIgnoreCase("LATUR")) {
			tax = 0.2f;
		} else if (city=="Jalgaon") {
			tax = 0.5f;
		} else if (city.equalsIgnoreCase("Banglore")) {
			tax = 0.7f;
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
		int passingYear = Integer.parseInt(request.getParameter("passingyear"));
		Float cost = Float.parseFloat(request.getParameter("cost"));
		String city = request.getParameter("city");
		String Vtype = request.getParameter("vehicletype");
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int dep = currentYear - passingYear;
		double idv = calculateIDV(cost, depTodepPercentageConversion(dep));
		int type = 0;
		if (Vtype.equalsIgnoreCase("commercial")) {
			type = 3;
		}
		double premium = calculatePremium(idv, type, cityToTaxConversion(city));

		if(idv!= 0) {
			request.setAttribute("idv", idv);
			request.setAttribute("premium", premium);
			request.setAttribute("netPremium", netPremium);
			request.setAttribute("Commercial", Commercial);
			request.setAttribute("roadTax", roadTax);
			request.setAttribute("gst", gst);
			request.setAttribute("subtotal", subtotal);
			request.getRequestDispatcher("Calculation.jsp").forward(request, response);;
		}

	}

}
