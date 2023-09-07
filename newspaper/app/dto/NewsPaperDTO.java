package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable {
	private String lang;
	private int noOfPages;
	private double price;
	private String publisher;

	public NewsPaperDTO() {

	}

	public NewsPaperDTO(String lang, int no_of_pages, double price, String publisher) {
		super();
		this.lang = lang;
		this.noOfPages = no_of_pages;
		this.price = price;
		this.publisher = publisher;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getNo_of_pages() {
		return noOfPages;
	}

	public void setnoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "NewsPaperDTO [lang=" + lang + ", noOfPages=" + noOfPages + ", price=" + price + ", publisher="
				+ publisher + "]";
	}

}
