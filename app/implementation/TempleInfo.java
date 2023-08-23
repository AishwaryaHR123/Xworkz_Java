package com.xworkz.app.implementation;

import com.xworkz.app.Interface.Temple;

public class TempleInfo implements Temple {

	@Override
	public String dressCode(String name) {
		System.out.println("invoking dressCode in templeInfo");
		return "salwar";
	}

	@Override
	public int entryFee(double cost) {
		System.out.println("invoking entryFee in TempleInfo");
		return 200;
	}

	@Override
	public String templeName(String location) {
		System.out.println("invoking templeName in templeInfo");
		return "Ram Mandir";
	}

}
