package com.xworkz.Override;

public class LigniteCoal extends Coal{
	@Override
	public void burn() {
		System.out.println("LigniteCoal overrides the coal");
		super.burn();
	}
	

}
