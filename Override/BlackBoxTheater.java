package com.xworkz.Override;

public class BlackBoxTheater extends Theater {
	@Override
	public void entertainment() {
		System.out.println("BlackBoxTheater overrides the Theater");
		super.entertainment();
	}

}
