package com.xworkz.hotel.app.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable{
	private int id;
	private String name;
	private String ownerName;
	private String gstNo;
	private String location;
	public HotelDTO() {
	}
	public HotelDTO(int id, String name, String ownerName, String gstNo, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.gstNo = gstNo;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getGstNo() {
		return gstNo;
	}
	public String getLocation() {
		return location;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gstNo=" + gstNo + ", location="
				+ location + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gstNo == null) ? 0 : gstNo.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		if (gstNo == null) {
			if (other.gstNo != null)
				return false;
		} else if (!gstNo.equals(other.gstNo))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	

}
