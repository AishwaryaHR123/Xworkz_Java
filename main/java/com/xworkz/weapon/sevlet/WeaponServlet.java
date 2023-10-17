package com.xworkz.weapon.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/life", loadOnStartup = 3)
public class WeaponServlet extends HttpServlet{
	public WeaponServlet() {
		System.out.println("Created WeaponServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running Service in WeaponServlet");
		String name=req.getParameter("name");
		String madeBy=req.getParameter("madeBy");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		System.out.println("Name is: " +name);
		System.out.println("Made By : " +madeBy);
		System.out.println("Price: " +price);
		System.out.println("Type: " +type);
		int convertedPrice=Integer.parseInt(price);
		res.setContentType("Text/Html");
		PrintWriter writer=res.getWriter();
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
				+ "    <li class=\"breadcrumb-item\"><a class=\"btn btn-primary\" href=\"index.html\" role=\"button\">Home</a></li>\r\n"
				+ "    <li class=\"breadcrumb-item active\" aria-current=\"page\"><a class=\"btn btn-primary\" href=\"weapon.html\" role=\"button\">weapon</a></li>\r\n"
				+ "  </ol>\r\n"
				+ "</nav>\r\n"
				+ "</nav>\r\n"
				+ "	<h3>Weapon Information Saved Successfully</h3>\r\n");
					writer.print("Name is: " + name + " saved successfully\n<br>");
					writer.print("Made By : " + madeBy + " saved successfully\n<br>");
					writer.print("Price: " + price + " saved successfully\n<br>");
					writer.print("Type: " + type + " saved successfully\n<br>");
				writer.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
