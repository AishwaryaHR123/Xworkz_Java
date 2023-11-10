package com.xworkz.set.app.dto;

import java.io.Serializable;

public class TyreDTO implements Serializable{
	private String brand;
	private float tyreRating;
	private String color;
	private double price;
	public TyreDTO() {
	}
	public TyreDTO(String brand, float tyreRating, String color, double price) {
		super();
		this.brand = brand;
		this.tyreRating = tyreRating;
		this.color = color;
		this.price = price;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in TyreDTO");
		return 200;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in WireDTO");
		if(obj!=null)
		{
			if(obj instanceof TyreDTO)
			{
				TyreDTO dto=(TyreDTO)obj;
				if(dto.getBrand().equals(this.getBrand())&& dto.getColor().equals(this.getColor()))
				{
	
					return true;
				}
				
			}
		}
		return false;
	}
		
	
	public String getBrand() {
		return brand;
	}
	public float getTyreRating() {
		return tyreRating;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setTyreRating(float tyreRating) {
		this.tyreRating = tyreRating;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
