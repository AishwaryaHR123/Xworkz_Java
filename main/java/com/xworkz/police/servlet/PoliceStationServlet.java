package com.xworkz.police.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save", loadOnStartup = 3)
public class PoliceStationServlet extends HttpServlet {
	public PoliceStationServlet() {
		System.out.println("Created PoliceStationServlet....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("created service in PoliceStationServlet");
		String stationName = req.getParameter("stationName");
		String location = req.getParameter("location");
		String inspectorName = req.getParameter("inspectorName");
		String siName = req.getParameter("siName");
		String headConstable = req.getParameter("headConstable");
		String assistantCommissioner = req.getParameter("assistantCommissioner");
		String noOfCells = req.getParameter("noOfCells");
		String noOfCasePending = req.getParameter("noOfCasePending");
		String painted = req.getParameter("painted");
		System.out.println("SationName is : " + stationName);
		System.out.println("Loaction : " + location);
		System.out.println("InspectorName : " + inspectorName);
		System.out.println("SI Name: " + siName);
		System.out.println("Head Constable: " + headConstable);
		System.out.println("Assistant Commissioner : " + assistantCommissioner);
		System.out.println("No Of Cells: " + noOfCells);
		System.out.println("No Of Cases Pending: " + noOfCasePending);
		System.out.println("Painted: " + painted);
		int convertedPendingCase = Integer.parseInt(noOfCasePending);
		int convertedCell = Integer.parseInt(noOfCells);
		boolean convertedPainted = Boolean.parseBoolean(painted);
		res.setContentType("Text/html");
		PrintWriter writer = res.getWriter();
		writer.print("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n" + "<meta charset=\"utf-8\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<title>x-workz</title>\r\n" + "<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "<nav class=\"navbar navbar-dark bg-dark\">\r\n" + "<h5 class=\"text-white h4\"> X-workz</h5>\r\n"
				+ "\r\n" + "<nav aria-label=\"breadcrumb\">\r\n" + "  <ol class=\"breadcrumb\">\r\n"
				+ "    <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\r\n"
				+ "    <li class=\"breadcrumb-item active\" aria-current=\"page\"><a href=\"policeStation.html\">Police</a></li>\r\n"
				+ "  </ol>\r\n" + "</nav>\r\n" + "</nav>\r\n"
				+ "	<h3>PoliceStation Info Saved Succesfully...</h3>\r\n");
		writer.print(" StationName " + stationName + " saved successfully\n<br>");
		writer.print("Location " + location + " saved successfully\n<br>");
		writer.print("InspectorName " + inspectorName + " saved successfully\n<br>");
		writer.print("SIName " + siName + " saved successfully\n<br>");
		writer.print("HeadConstable " + headConstable + " saved successfully\n<br>");
		writer.print("AssistantCommisioner  " + assistantCommissioner + " saved successfully\n<br>");
		writer.print("NoOfCells " + noOfCells + " saved successfully\n<br>");
		writer.print("noOfCasePending " + noOfCasePending + " saved successfully\n<br>");
		writer.print("Painted " + painted + " saved successfully\n<br>");

		if (convertedPendingCase > 100) {
			writer.print("<span style=color:red>Too many cases pending</span>\n<br>");
		} else {
			writer.print("<span style=color:green>Less Cases Pending</span>\n<br>");
		}

		if (convertedCell < 5) {
			writer.print("<span style=color:red>Small Station</span>\n<br>");
		} else {
			writer.print("<span style=color:green>Big Station\n<br>");
		}
		if (convertedPainted) {
			writer.print("<span style=color:green>Station is Clean</span>\n<br>");
		} else {
			writer.print("<span style=color:red>Station is Dirty</span>\n<br>");
		}

		writer.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n" + "</body>\r\n" + "</html>\r\n" + "\r\n" + "");

	}

}

