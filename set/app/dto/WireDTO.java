package com.xworkz.set.app.dto;

import java.io.Serializable;

public class WireDTO implements Serializable {
	private String name;
	private float diameter;
	private double price;
	private String purpose;
	public WireDTO() {
	}
	public WireDTO(String name, float diameter, double price, String purpose) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.price = price;
		this.purpose = purpose;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in WireDTO");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in WireDTO");
		if(obj!=null)
		{
			if(obj instanceof WireDTO)
			{
				WireDTO dto=(WireDTO)obj;
				if(dto.getName().equals(this.getName()) && dto.getPurpose().equals(this.getPurpose()))
				{
					System.out.println("compared "+getName()+" and " +getPurpose());
					return true;
				}
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public float getDiameter() {
		return diameter;
	}
	public double getPrice() {
		return price;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}