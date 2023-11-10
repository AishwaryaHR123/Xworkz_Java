package com.xworkz.set.app.dto;

import java.io.Serializable;

public class FireDTO implements Serializable{
	private String fuelType;
	private String color;
	private float temperature;
	private String extinguishingAgent;
	public FireDTO() {
	}
	public FireDTO(String fuelType, String color, float temperature, String extinguishingAgent) {
		super();
		this.fuelType = fuelType;
		this.color = color;
		this.temperature = temperature;
		this.extinguishingAgent = extinguishingAgent;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashcode in FireDTO");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in FireDTO");
		if(obj!=null)
		{
			if(obj instanceof FireDTO)
			{
				FireDTO dto=(FireDTO)obj;
				if(dto.getFuelType().equals(this.getFuelType())&& dto.getExtinguishingAgent().equals(this.getExtinguishingAgent())) {
					return true;
				}
			}
		}
		return false;
	}
	public String getFuelType() {
		return fuelType;
	}
	public String getColor() {
		return color;
	}
	public float getTemperature() {
		return temperature;
	}
	public String getExtinguishingAgent() {
		return extinguishingAgent;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public void setExtinguishingAgent(String extinguishingAgent) {
		this.extinguishingAgent = extinguishingAgent;
	}
	

}
