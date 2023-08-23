package com.xworkz.app.implementation;

import com.xworkz.app.Interface.Engineer;

public class ComputerEngineer implements Engineer {

	@Override
	public int attendance(String clgName) {
		System.out.println("invoking attendance in ComputerEngineer");
		return 20;
	}

	@Override
	public String exam(double cost, String location) {
		System.out.println("invoking exam in ComputerEngineer");
		return "vtu";
	}

	@Override
	public String branch() {
		System.out.println("invoking branch in ComputerEngineer");
		return "Computer Science";
	}

}
