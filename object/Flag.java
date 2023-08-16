package com.xworkz.object;

public class Flag {
	private String color;
	private String country;
	private int countryCode;

	public Flag() {
	}

	public Flag(String color, String country, int countryCode) {
		super();
		this.color = color;
		this.country = country;
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "color=" + color + ", country=" + country + ", countryCode=" + countryCode + "";
	}

}
