package com.xworkz.train.dto;

import com.xworkz.train.constants.MovieTicket;

public class MovieTicketDTO {
	private MovieTicket ticket;
	private Double price;
	private String gst;
	private Double discount;
	public MovieTicketDTO(MovieTicket ticket, Double price, String gst, Double discount) {
		super();
		this.ticket = ticket;
		this.price = price;
		this.gst = gst;
		this.discount = discount;
	}
	public MovieTicket getTicket() {
		return ticket;
	}
	public Double getPrice() {
		return price;
	}
	public String getGst() {
		return gst;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setTicket(MovieTicket ticket) {
		this.ticket = ticket;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "MovieTicketDTO [ticket=" + ticket + ", price=" + price + ", gst=" + gst + ", discount=" + discount
				+ "]";
	}
	

}
