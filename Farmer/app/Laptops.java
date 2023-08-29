package com.xworkz.Farmer.app;

public class Laptops {
	private String music;
	private Processor processor;

	public void palyingGames() {
		System.out.println("Invoking palyingGames method in Laptops");
		this.processor.decode();
		this.processor.execute();
		this.processor.fetch();
		this.processor.writeBack();
	}

	public void programing() {
		System.out.println("Invoking programing method in Laptops");
	}

	public void webBrowsing() {
		System.out.println("Invoking webBrowsing method in Laptops");
	}

	public void Laptops(String music) {
		System.out.println("Invoking const  in Laptops");
		this.music = music;
	}

	public void setProcessor(Processor processor) {
		System.out.println("Invoking set method  in Laptops");
		this.processor = processor;
	}
}
