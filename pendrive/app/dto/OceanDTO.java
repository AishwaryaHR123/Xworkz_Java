package com.xworkz.pendrive.app.dto;

public class OceanDTO implements Comparable<OceanDTO>{
	private String oceanName;
	private boolean salinity;
	private float waveHeight;
	private String pollutant;
	public OceanDTO() {
	}
	public OceanDTO(String oceanName, boolean salinity, float waveHeight, String pollutant) {
		super();
		this.oceanName = oceanName;
		this.salinity = salinity;
		this.waveHeight = waveHeight;
		this.pollutant = pollutant;
	}
	public String getOceanName() {
		return oceanName;
	}
	public boolean isSalinity() {
		return salinity;
	}
	public float getWaveHeight() {
		return waveHeight;
	}
	public String getPollutant() {
		return pollutant;
	}
	public void setOceanName(String oceanName) {
		this.oceanName = oceanName;
	}
	public void setSalinity(boolean salinity) {
		this.salinity = salinity;
	}
	public void setWaveHeight(float waveHeight) {
		this.waveHeight = waveHeight;
	}
	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}
	@Override
	public String toString() {
		return "OceanDTO [oceanName=" + oceanName + ", salinity=" + salinity + ", waveHeight=" + waveHeight
				+ ", pollutant=" + pollutant + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oceanName == null) ? 0 : oceanName.hashCode());
		result = prime * result + ((pollutant == null) ? 0 : pollutant.hashCode());
		result = prime * result + (salinity ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(waveHeight);
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
		OceanDTO other = (OceanDTO) obj;
		if (oceanName == null) {
			if (other.oceanName != null)
				return false;
		} else if (!oceanName.equals(other.oceanName))
			return false;
		if (pollutant == null) {
			if (other.pollutant != null)
				return false;
		} else if (!pollutant.equals(other.pollutant))
			return false;
		if (salinity != other.salinity)
			return false;
		if (Float.floatToIntBits(waveHeight) != Float.floatToIntBits(other.waveHeight))
			return false;
		return true;
	}
	@Override
	public int compareTo(OceanDTO argument) {
		OceanDTO current=this;
		if(current.waveHeight==argument.waveHeight)
		{
			return 0;
		}
		if(current.waveHeight>argument.waveHeight)
		{
			return 754;
		}
		if(current.waveHeight<argument.waveHeight)
		{
			return -8;
		}
		throw new IllegalArgumentException("Cannot compare waveHeight");
		

	}

}
