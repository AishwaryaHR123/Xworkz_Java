package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable {
	private int printId;
	private String printerName;
	private String printerConnection;
	private double cost;
	public PrinterDTO() {
	}
	public PrinterDTO(int printId, String printerName, String printerConnection, double cost) {
		super();
		this.printId = printId;
		this.printerName = printerName;
		this.printerConnection = printerConnection;
		this.cost = cost;
	}
	public int getPrintId() {
		return printId;
	}
	public void setPrintId(int printId) {
		this.printId = printId;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getPrinterConnection() {
		return printerConnection;
	}
	public void setPrinterConnection(String printerConnection) {
		this.printerConnection = printerConnection;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "PrinterDTO [printId=" + printId + ", printerName=" + printerName + ", printerConnection="
				+ printerConnection + ", cost=" + cost + "]";
	}
	

}
