package com.xworkz.set.app.dto;

import java.io.Serializable;

public class PlayGroundDTO implements Serializable{
	private String groundName;
	private String surfaceMaterial;
	private String location;
	private int noOfPoles;
	public PlayGroundDTO() {
	}
	public PlayGroundDTO(String groundName, String surfaceMaterial, String location, int noOfPoles) {
		super();
		this.groundName = groundName;
		this.surfaceMaterial = surfaceMaterial;
		this.location = location;
		this.noOfPoles = noOfPoles;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in PlayGroundDTO");
		return 150;
	}
	@Override
	public boolean equals(Object obj) { 
		System.out.println("Running equals in PlayGroundDTO");
		if(obj!=null)
		{
			if(obj instanceof PlayGroundDTO)
			{
				PlayGroundDTO dto=(PlayGroundDTO)obj;
				if(dto.getGroundName().equals(this.getGroundName())&& dto.getLocation().equals(this.getLocation())) {
					return true;
				}
			}
		}
		
		return false;
	}
	public String getGroundName() {
		return groundName;
	}
	public String getSurfaceMaterial() {
		return surfaceMaterial;
	}
	public String getLocation() {
		return location;
	}
	public int getNoOfPoles() {
		return noOfPoles;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public void setSurfaceMaterial(String surfaceMaterial) {
		this.surfaceMaterial = surfaceMaterial;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNoOfPoles(int noOfPoles) {
		this.noOfPoles = noOfPoles;
	}

}
