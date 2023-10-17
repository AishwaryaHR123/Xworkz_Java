package com.xworkz.player.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/players", loadOnStartup = 1)
public class PlayerResource extends HttpServlet {
	public PlayerResource() {
		System.out.println("Created PlayerResource...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running service in PlayerResource");
		String playerName = req.getParameter("name");
		String sports = req.getParameter("sports");
		String place = req.getParameter("place");
		String exp = req.getParameter("exp");
		System.out.println("PlayerName: " + playerName);
		System.out.println("Sports:" + sports);
		System.out.println("Place: " + place);
		System.out.println("Exp: " + exp);
		System.out.println("URL: " + req.getRequestURI());
		System.out.println("Method: " + req.getMethod());
		System.out.println("User Agent " + req.getHeader("User-agent"));
		
		Enumeration<String> en = req.getParameterNames();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		res.setContentType("Text/plain");
		PrintWriter writer = res.getWriter();
		writer.print(playerName + "," + sports + "," + place + "," + exp + " Saved PlayerInfo Successfully ");

	}

}
