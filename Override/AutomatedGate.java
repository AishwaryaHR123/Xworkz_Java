package com.xworkz.Override;

public class AutomatedGate extends Gate{
	@Override
	public void privacy() {
		System.out.println("Automated overrides the Gate");
		super.privacy();
	}

}
