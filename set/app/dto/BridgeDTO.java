package com.xworkz.set.app.dto;

import java.io.Serializable;

public class BridgeDTO implements Serializable{
	private String bridgeName;
	private int length;
	private String type;
	private int yearOfConstruction;
	public BridgeDTO() {
	}
	public BridgeDTO(String bridgeName, int length, String type, int yearOfConstruction) {
		super();
		this.bridgeName = bridgeName;
		this.length = length;
		this.type = type;
		this.yearOfConstruction = yearOfConstruction;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashcode in BridgeDTO..");
		return 25;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in BridgeDTO");
		if(obj!=null)
		{
			if(obj instanceof BridgeDTO)
			{
				BridgeDTO dto=(BridgeDTO)obj;
				if(dto.getBridgeName().equals(this.getBridgeName())&& dto.getYearOfConstruction()==this.getYearOfConstruction()) {
					return true;
				}
			}
		}
		return false;
	}
	public String getBridgeName() {
		return bridgeName;
	}
	public int getLength() {
		return length;
	}
	public String getType() {
		return type;
	}
	public int getYearOfConstruction() {
		return yearOfConstruction;
	}
	public void setBridgeName(String bridgeName) {
		this.bridgeName = bridgeName;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

}
