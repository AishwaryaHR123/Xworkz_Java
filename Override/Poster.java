package com.xworkz.Override;

public class Poster extends Flex{
	@Override
	public void displayInfo() {
		System.out.println("Poster overrides the Flex");
		super.displayInfo();
	}

}
