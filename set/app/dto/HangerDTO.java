package com.xworkz.set.app.dto;

import java.io.Serializable;

public class HangerDTO implements Serializable{
	private String material;
    private int length;
    private int weightCapacity;
    private String color;
    public HangerDTO() {
	}
	public HangerDTO(String material, int length, int weightCapacity, String color) {
		super();
		this.material = material;
		this.length = length;
		this.weightCapacity = weightCapacity;
		this.color = color;
	}
	@Override
	public int hashCode() {
		System.out.println("running hashCode in HangerDTO");
		return 200;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in HangerDTO");
		if(obj!=null)
		{
			if(obj instanceof HangerDTO) {
				HangerDTO dto=(HangerDTO)obj;
				if(dto.getMaterial().equals(this.getMaterial())&& dto.getColor().equals(this.getColor())) {
					return true;
				}
			}
		}
		return false;
	}
	public String getMaterial() {
		return material;
	}
	public int getLength() {
		return length;
	}
	public int getWeightCapacity() {
		return weightCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
