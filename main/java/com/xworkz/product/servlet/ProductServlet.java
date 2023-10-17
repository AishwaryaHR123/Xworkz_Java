package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.product.servlet.dto.ProductDTO;

@WebServlet(urlPatterns = "/laptop", loadOnStartup = 3)
public class ProductServlet extends HttpServlet {
	public ProductServlet() {
		System.out.println("Created ProductServlet....");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in ProductServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		String desc = req.getParameter("desc");
		//double convertedPrice = Double.parseDouble(price);
		// int convertedQuantity = Integer.parseInt(quantity);
		ProductDTO dto = new ProductDTO(name, type, price, brand, quantity, desc);
		req.setAttribute("dog", dto);

		if (price!=null && !price.isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
			dispatcher.forward(req, resp);
			System.out.println(price);
		} else {
			req.setAttribute("successMsg", "Price is mandatory ");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Product.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
