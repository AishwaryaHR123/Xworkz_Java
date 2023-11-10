package com.xworkz.set.app.dto;

import java.io.Serializable;

public class KnifeDTO implements Serializable{
	private String bladeMaterial;
	private double price;
	private float weight;
	private String handleMaterial;
	public KnifeDTO() {
	}
	public KnifeDTO(String bladeMaterial, double price, float weight, String handleMaterial) {
		super();
		this.bladeMaterial = bladeMaterial;
		this.price = price;
		this.weight = weight;
		this.handleMaterial = handleMaterial;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in KnifeDTO");
		return 44;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in HardwareDTO");
		if(obj!=null) {
			if(obj instanceof KnifeDTO) {
				KnifeDTO dto=(KnifeDTO)obj;
				if(dto.getBladeMaterial().equals(this.getBladeMaterial())&& dto.getBladeMaterial().equals(this.getBladeMaterial())) {
					return true;
				}
			}
		}
		return false;
	}
	public String getBladeMaterial() {
		return bladeMaterial;
	}
	public double getPrice() {
		return price;
	}
	public float getWeight() {
		return weight;
	}
	public String getHandleMaterial() {
		return handleMaterial;
	}
	public void setBladeMaterial(String bladeMaterial) {
		this.bladeMaterial = bladeMaterial;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setHandleMaterial(String handleMaterial) {
		this.handleMaterial = handleMaterial;
	}
	

}
