package com.xworkz.contact.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.contact.dto.ContactDTO;

@WebServlet(urlPatterns = "/parrot",loadOnStartup = 3)
public class ContactServlet extends HttpServlet {
	public ContactServlet() { 
		System.out.println("Created ContactServlet......");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in Contactservlet.....");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobileNo=req.getParameter("mobileNo");
		String comment=req.getParameter("comment");
		ContactDTO dto=new ContactDTO(name, email, mobileNo, comment);
		req.setAttribute("laptop", dto);
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}
