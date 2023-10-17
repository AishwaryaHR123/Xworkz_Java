package com.xworkz.poc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.poc.servlet.dto.PocDTO;

@WebServlet(urlPatterns = "/math",loadOnStartup = 3)
public class AddressServlet extends HttpServlet{
	public AddressServlet() {
		System.out.println("Created AddressServlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in AddressServlet ");
		String no=req.getParameter("no");
		String street=req.getParameter("street");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		PocDTO dto=new PocDTO(no, street, city, state, country);
		req.setAttribute("aishwarya", dto);
		req.setAttribute("addressSuccess", "Address Saved Successfully");
		RequestDispatcher dispatcher=req.getRequestDispatcher("Address.jsp");
		dispatcher.forward(req, resp);
	}

}
