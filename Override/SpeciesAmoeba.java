package com.xworkz.Override;

public class SpeciesAmoeba extends Amoeba{
	@Override
	public void feeding() {
		System.out.println("SpeciesAmoeba overrides the Amoeba");
		super.feeding();
	}

}
