package com.xworkz.object;

public class Logo {
	private String color;
	private String shape;
	private String name;
	private String font;
	private int length;

	public Logo() {
	}

	public Logo(String color, String shape, String name, String font, int length) {
		super();
		this.color = color;
		this.shape = shape;
		this.name = name;
		this.font = font;
		this.length = length;
	}

	@Override
	public String toString() {
		return "color=" + color + ", shape=" + shape + ", name=" + name + ", font=" + font + ", length=" + length + "";
	}

}
