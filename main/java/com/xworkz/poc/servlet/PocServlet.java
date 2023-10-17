package com.xworkz.poc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.poc.servlet.dto.PocDTO;

@WebServlet(urlPatterns = "/life",loadOnStartup = 3)
public class PocServlet extends HttpServlet{
	public PocServlet() {
		System.out.println("Created PocServlet....");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in PocServlet");
		String userId=req.getParameter("userId");
		String password=req.getParameter("password");
		PocDTO poc=new PocDTO(userId, password);
		req.setAttribute("aishwarya", poc);
		if(userId.equals("admin") && password.equals("secret"))
		{
		RequestDispatcher dispatcher=req.getRequestDispatcher("LoginSuccess.jsp");
		dispatcher.forward(req, resp);
		System.out.println(userId);
		System.out.println(password);
		}
		else {
			req.setAttribute("successMsg","Credentials are not matching");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
