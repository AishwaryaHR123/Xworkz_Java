package com.xworkz.farmerr.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mobile" ,loadOnStartup = 3)
public class CookieServlet extends HttpServlet {
	public CookieServlet() {
		System.out.println("Created CookieServlet.....");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in CookieServlet");
		Random random =new Random();
		Cookie cookie=new Cookie("xworkz",String.valueOf(random.nextLong()) );
		resp.addCookie(cookie);
		resp.sendRedirect("index.html");
	}

}
