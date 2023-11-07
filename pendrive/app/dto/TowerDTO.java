package com.xworkz.pendrive.app.dto;

public class TowerDTO implements Comparable<TowerDTO>{
	private float height;
	private boolean secure;
	private String purpose;
	private String lighting;
	public TowerDTO() {
	}
	public TowerDTO(float height, boolean secure, String purpose, String lighting) {
		super();
		this.height = height;
		this.secure = secure;
		this.purpose = purpose;
		this.lighting = lighting;
	}
	public float getHeight() {
		return height;
	}
	public boolean isSecure() {
		return secure;
	}
	public String getPurpose() {
		return purpose;
	}
	public String getLighting() {
		return lighting;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public void setLighting(String lighting) {
		this.lighting = lighting;
	}
	@Override
	public String toString() {
		return "TowerDTO [height=" + height + ", secure=" + secure + ", purpose=" + purpose + ", lighting=" + lighting
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((lighting == null) ? 0 : lighting.hashCode());
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + (secure ? 1231 : 1237);
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
		TowerDTO other = (TowerDTO) obj;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (lighting == null) {
			if (other.lighting != null)
				return false;
		} else if (!lighting.equals(other.lighting))
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (secure != other.secure)
			return false;
		return true;
	}
	@Override
	public int compareTo(TowerDTO argument) {
		TowerDTO current=this;
		return current.purpose.compareTo(argument.purpose);
	}
	

}
