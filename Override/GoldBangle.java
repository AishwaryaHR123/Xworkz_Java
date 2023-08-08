package com.xworkz.Override;

public class GoldBangle extends Bangle{
	@Override
	public void sound() {
		System.out.println("GoldBangle overrides the Bangle");
		super.sound();
	}

}
