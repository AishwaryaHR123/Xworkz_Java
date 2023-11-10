package com.xworkz.set.app.dto;

import java.io.Serializable;

public class CrackerDTO implements Serializable{
	private String type;
	private String chemicalComposition;
	private String countryOfOrigin;
	private int soundLevel;
	public CrackerDTO() {
	}
	public CrackerDTO(String type, String chemicalComposition, String countryOfOrigin, int soundLevel) {
		super();
		this.type = type;
		this.chemicalComposition = chemicalComposition;
		this.countryOfOrigin = countryOfOrigin;
		this.soundLevel = soundLevel;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in CrackerDTO");
		return 35;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in FireDTO");
		if(obj!=null)
		{
			if(obj instanceof CrackerDTO)
			{
				CrackerDTO dto=(CrackerDTO)obj;
				if(dto.getChemicalComposition().equals(this.getChemicalComposition())&& dto.getType().equals(this.getType())) {
					return true;
				}
			}
		}
		return false;
	}
		
	
	public String getType() {
		return type;
	}
	public String getChemicalComposition() {
		return chemicalComposition;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public int getSoundLevel() {
		return soundLevel;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setChemicalComposition(String chemicalComposition) {
		this.chemicalComposition = chemicalComposition;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setSoundLevel(int soundLevel) {
		this.soundLevel = soundLevel;
	}

}
