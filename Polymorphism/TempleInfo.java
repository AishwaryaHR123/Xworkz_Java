package com.xworkz.Polymorphism;

public class TempleInfo extends Temple {
	@Override
	public void worship() {
		System.out.println("TempleInfo overrides Temple");
		super.worship();
	}
	@Override
	public void worship(String templeName) {
		super.worship(templeName);
	}
	@Override
	public void worship(String templeName, int yearBuilt) {
		super.worship(templeName, yearBuilt);
	}
	@Override
	public void worship(String templeName, int yearBuilt, String religion) {
		super.worship(templeName, yearBuilt, religion);
	}
	@Override
	public void worship(String templeName, int yearBuilt, String religion, String founder) {
		super.worship(templeName, yearBuilt, religion, founder);
	}
	@Override
	public void worship(String templeName, int yearBuilt, String religion, String founder, String dressCode) {
		super.worship(templeName, yearBuilt, religion, founder, dressCode);
	}

}
