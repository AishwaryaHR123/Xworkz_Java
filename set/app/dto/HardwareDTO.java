package com.xworkz.set.app.dto;

import java.io.Serializable;

public class HardwareDTO implements Serializable{
	private String type;
	private double price;
	private String capacity;
	private float speed;
	public HardwareDTO() {
	}
	public HardwareDTO(String type, double price, String capacity, float speed) {
		super();
		this.type = type;
		this.price = price;
		this.capacity = capacity;
		this.speed = speed;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in HardwareDTO");
		return 20;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in HardwareDTO");
		if(obj!=null) {
			if(obj instanceof HardwareDTO) {
				HardwareDTO dto=(HardwareDTO)obj;
				if(dto.getCapacity().equals(this.getCapacity())&& dto.getType().equals(this.getType())) {
					return true;
				}
			}
		}
		return false;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public String getCapacity() {
		return capacity;
	}
	public float getSpeed() {
		return speed;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
