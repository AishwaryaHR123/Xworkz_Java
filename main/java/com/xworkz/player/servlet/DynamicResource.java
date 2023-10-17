package com.xworkz.player.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info", loadOnStartup = 1)
public class DynamicResource extends HttpServlet {
	public DynamicResource() {
		System.out.println("Created DynamicResource....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running Service in DyamicResource");
	}

}
