package com.xworkz.information.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.information.dto.InformationDTO;

@WebServlet(urlPatterns = "/gun",loadOnStartup = 1)
public class InformationServlet extends HttpServlet {
	public InformationServlet() {
		System.out.println("Created InformationServlet........");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String slNo=req.getParameter("slNo");
		 String fName=req.getParameter("fName");
		 String lName=req.getParameter("lName");
		 String mName=req.getParameter("mName");
		 String email=req.getParameter("email");
		 String gender=req.getParameter("gender");
		 String contactNo=req.getParameter("contactNo");
		 String area=req.getParameter("area");
		 String District=req.getParameter("district");
		 String state=req.getParameter("state");
		 String pinCode=req.getParameter("pinCode");
		 InformationDTO dto=new InformationDTO(slNo, fName, lName, mName, email, gender, contactNo, area, District, state, pinCode);
		 req.setAttribute("laptop", dto);
		 RequestDispatcher dispatcher=req.getRequestDispatcher("InformationSuccess.jsp");
		 dispatcher.forward(req, resp);
	}

}
