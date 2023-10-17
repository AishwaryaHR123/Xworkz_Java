package com.xworkz.farmerr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save",loadOnStartup = 2)
public class FarmerServlet extends HttpServlet {
	public FarmerServlet() {
		System.out.println("Created FarmerServlet......");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running Service in FarmerServlet...");
		String farmerName = req.getParameter("farmerName");
		String area = req.getParameter("area");
		String soilType = req.getParameter("soilType");
		String cropType = req.getParameter("cropType");
		String fertilizer = req.getParameter("fertilizer");
		String season = req.getParameter("season");
		String investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String recordNo = req.getParameter("recordNo");
		System.out.println("FarmerName is : " + farmerName);
		System.out.println("Area : " + area);
		System.out.println("SoilType : " + soilType);
		System.out.println("CropType: " + cropType);
		System.out.println("Fertilizer: " + fertilizer);
		System.out.println("Season : " + season);
		System.out.println("Investment: " + investment);
		System.out.println("Profit: " + profit);
		System.out.println("RecordNo: " + recordNo);
		res.setContentType("Text/html");
		PrintWriter writer = res.getWriter();
		double convertedInvestment=Double.parseDouble(investment);
		float convertedProfit=Float.parseFloat(profit);
		writer.print("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"utf-8\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<title>x-workz</title>\r\n"
				+ "<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar navbar-dark bg-dark\">\r\n"
				+ "<h5 class=\"text-white h4\"> X-workz</h5>\r\n"
				+ "\r\n"
				+ "<nav aria-label=\"breadcrumb\">\r\n"
				+ "  <ol class=\"breadcrumb\">\r\n"
				+ "    <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\r\n"
				+ "    <li class=\"breadcrumb-item active\" aria-current=\"page\"><a href=\"farmer.html\">Farmer</a></li>\r\n"
				+ "  </ol>\r\n"
				+ "</nav>\r\n"
				+ "</nav>\r\n"
				
				+ "	<h3>FarmerInfo Saved Successfully...</h3>\r\n");
		writer.print(farmerName + " saved successfully\n<br>");
		writer.print(area + " saved successfully\n<br>");
		writer.print(soilType + " saved successfully\n<br>");
		writer.print(cropType + " saved successfully\n<br>");
		writer.print(fertilizer + " saved successfully\n<br>");
		writer.print(season + " saved successfully\n<br>");
		writer.print(investment + " saved successfully\n<br>");
		writer.print(profit + " saved successfully\n<br>");
		writer.print(recordNo + " saved successfully\n<br>");	
		if(convertedProfit>convertedInvestment)
		{
			writer.print("<span style=color:green>This is good year</span>");
		}
		else {
			writer.print("<span style=color:red>This is not good year</span>");
		}
				 writer.print("	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "\r\n"
				+ "");
		
		

	}

}
