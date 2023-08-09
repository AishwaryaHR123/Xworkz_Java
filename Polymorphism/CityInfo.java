package com.xworkz.Polymorphism;

public class CityInfo extends City{
	@Override
	public void living() {
		System.out.println("CityInfo overrides City");
		super.living();
	}
	@Override
	public void living(String cityName) {
		super.living(cityName);
	}
	@Override
	public void living(String cityName, int pincode) {
		super.living(cityName, pincode);
	}
	@Override
	public void living(String cityName, int pincode, int population) {
		super.living(cityName, pincode, population);
	}
	@Override
	public void living(String cityName, int pincode, int population, boolean education) {
		super.living(cityName, pincode, population, education);
	}
	@Override
	public void living(String cityName, int pincode, int population, boolean education, int rating) {
		super.living(cityName, pincode, population, education, rating);
	}

}
