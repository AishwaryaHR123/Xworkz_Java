package com.xworkz.object;

public class Pendant {
	private String material;
	private String shape;
	private double cost;
	private String texture;
	private String color;
	private String chainType;
	private String theme;
	private boolean gemStone;
	private boolean engraving;
	private boolean message;
	private int size;
	private String shopLocation;

	public Pendant() {
	}

	public Pendant(String material, String shape, double cost, String texture, String color, String chainType,
			String theme, boolean gemStone, boolean engraving, boolean message, int size, String shopLocation) {
		super();
		this.material = material;
		this.shape = shape;
		this.cost = cost;
		this.texture = texture;
		this.color = color;
		this.chainType = chainType;
		this.theme = theme;
		this.gemStone = gemStone;
		this.engraving = engraving;
		this.message = message;
		this.size = size;
		this.shopLocation = shopLocation;
	}

	@Override
	public String toString() {
		return "material=" + material + ", shape=" + shape + ", cost=" + cost + ", texture=" + texture + ", color="
				+ color + ", chainType=" + chainType + ", theme=" + theme + ", gemStone=" + gemStone + ", engraving="
				+ engraving + ", message=" + message + ", size=" + size + ", shopLocation=" + shopLocation
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "";
	}

}
