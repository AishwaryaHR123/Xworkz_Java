package com.xworkz.match.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.match.servlet.dto.MatchServletDTO;

@WebServlet(urlPatterns = "/book" , loadOnStartup = 3)
public class MatchServlet extends HttpServlet{
	public MatchServlet() {
		System.out.println("Created MatchServlet.....");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in MatchServlet");
		String tournamentName=req.getParameter("tournamentName");
		String hostingCountry=req.getParameter("hostingCountry");
		String matchDate=req.getParameter("matchDate");
		String team1=req.getParameter("team1");
		String team2=req.getParameter("team2");
		String team1CaptainName=req.getParameter("team1CaptainName");
		String team2CaptainName=req.getParameter("team2CaptainName");
		String umpireName=req.getParameter("umpireName");
		String stadiumName=req.getParameter("stadiumName");
		String thirdUmpireName=req.getParameter("thirdUmpireName");
		String stadiumCapacity=req.getParameter("stadiumCapacity");
		MatchServletDTO dto=new MatchServletDTO(tournamentName, hostingCountry, matchDate, team1, team2, team1CaptainName, team2CaptainName, umpireName, stadiumName, thirdUmpireName, stadiumCapacity);
		req.setAttribute("pen", dto);
	    RequestDispatcher dispatcher=req.getRequestDispatcher("MatchSuccess.jsp");
	    dispatcher.forward(req, resp);


	}
	

}
