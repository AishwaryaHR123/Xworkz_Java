package com.xworkz.saloon.app.dto;

import java.io.Serializable;

public class SaloonItemDTO implements Serializable{
	private int id;
	private String name;
	private double price;
	private String usage;
	private boolean isMan;
	public SaloonItemDTO() {
	}
	public SaloonItemDTO(int id, String name, double price, String usage, boolean isMan) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.usage = usage;
		this.isMan = isMan;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getUsage() {
		return usage;
	}
	public boolean isMan() {
		return isMan;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaloonItemDTO other = (SaloonItemDTO) obj;
		if (id != other.id)
			return false;
		if (isMan != other.isMan)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (usage == null) {
			if (other.usage != null)
				return false;
		} else if (!usage.equals(other.usage))
			return false;
		return true;
	}

}
