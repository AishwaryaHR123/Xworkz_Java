package com.xworkz.Override;

public class Sintex extends Drum{
	@Override
	public void store() {
		System.out.println("Sintex overrides the Drum");
		super.store();
	}

}
