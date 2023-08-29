package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Paper;
import com.xworkz.Farmer.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in wood runner");
		String type = "Teak Wood";
		Paper paper = new Paper();
		Wood wood = new Wood();
		wood.setPaper(paper);
		wood.pulp();

	}

}
