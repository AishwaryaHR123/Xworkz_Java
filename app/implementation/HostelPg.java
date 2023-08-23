package com.xworkz.app.implementation;

import com.xworkz.app.Interface.Pg;

public class HostelPg implements Pg {

	@Override
	public String pgName(String name) {
		System.out.println("invoking pgName in HostelPg");
		return null;
	}

	@Override
	public double fee(double cost) {
		System.out.println("invoking fee in HostelPg");
		return 0;
	}

	@Override
	public int timing(String location) {
		System.out.println("invoking timing in hostelPg");
		return 0;
	}

}
