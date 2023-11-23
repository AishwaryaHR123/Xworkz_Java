package com.xworkz.train.dto;

import com.xworkz.train.constants.CitizenType;

public class CitizenTypeDTO {
	private CitizenType citizenType;
	private Integer lowerAgeLimit;
	private Integer upperAgeLimit;
	private String name;
	public CitizenTypeDTO(CitizenType citizenType, Integer lowerAgeLimit, Integer upperAgeLimit, String name) {
		super();
		this.citizenType = citizenType;
		this.lowerAgeLimit = lowerAgeLimit;
		this.upperAgeLimit = upperAgeLimit;
		this.name = name;
	}
	public CitizenType getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(CitizenType citizenType) {
		this.citizenType = citizenType;
	}
	public void setLowerAgeLimit(Integer lowerAgeLimit) {
		this.lowerAgeLimit = lowerAgeLimit;
	}
	public void setUpperAgeLimit(Integer upperAgeLimit) {
		this.upperAgeLimit = upperAgeLimit;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CitizenTypeDTO [citizenType=" + citizenType + ", lowerAgeLimit=" + lowerAgeLimit + ", upperAgeLimit="
				+ upperAgeLimit + ", name=" + name + "]";
	}
	

}
