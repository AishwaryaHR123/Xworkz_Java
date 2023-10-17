package com.xworkz.day.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register",loadOnStartup = 3)
public class DayServlet extends HttpServlet{
	public DayServlet() {
		System.out.println("Created DayServlet....");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in DayServlet");
		String date=req.getParameter("date");
		String month=req.getParameter("month");
		String year=req.getParameter("year");
		String day=req.getParameter("day");
		req.setAttribute("date", date);
		req.setAttribute("month", month);
		req.setAttribute("year", year);
		req.setAttribute("day", day);
		RequestDispatcher dispatcher=req.getRequestDispatcher("DayDisplay.jsp");
		dispatcher.forward(req, resp);
		

	}

}
