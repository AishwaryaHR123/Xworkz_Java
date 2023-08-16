package com.xworkz.object;

public class Cave {
	private String location;
	private String name;
	private String lightSource;
	private String entranceShape;
	private String color;
	private int temperature;
	private String sound;
	private boolean ancient;
	private boolean echo;
	private String rockFormation;

	public Cave() {
	}

	public Cave(String location, String size, String lightSource, String entranceShape, String color, int temperature,
			String sound, boolean ancient, boolean echo, String rockFormation) {
		super();
		this.location = location;
		this.name = name;
		this.lightSource = lightSource;
		this.entranceShape = entranceShape;
		this.color = color;
		this.temperature = temperature;
		this.sound = sound;
		this.ancient = ancient;
		this.echo = echo;
		this.rockFormation = rockFormation;
	}

	@Override
	public String toString() {
		return "location=" + location + ", name=" + name + ", lightSource=" + lightSource + ", entranceShape="
				+ entranceShape + ", color=" + color + ", temperature=" + temperature + ", sound=" + sound
				+ ", ancient=" + ancient + ", echo=" + echo + ", rockFormation=" + rockFormation + "";
	}

}
