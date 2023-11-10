package com.xworkz.set.app.dto;

import java.io.Serializable;

public class PinDTO implements Serializable{
	private String material;
	private double price;
	private String pointType;
	private String usage;
	public PinDTO() {
	}
	public PinDTO(String material, double price, String pointType, String usage) {
		super();
		this.material = material;
		this.price = price;
		this.pointType = pointType;
		this.usage = usage;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in PinDTO");
		return 120;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in PinDTO");
		if(obj!=null)
		{
			if(obj instanceof PinDTO)
			{
				PinDTO dto=(PinDTO)obj;
				if(dto.getMaterial().equals(this.getMaterial())&& dto.getPointType().equals(this.getPointType())) {
					return true;
				}
			}
		}
		return false;
	}
	public String getMaterial() {
		return material;
	}
	public double getPrice() {
		return price;
	}
	public String getPointType() {
		return pointType;
	}
	public String getUsage() {
		return usage;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
