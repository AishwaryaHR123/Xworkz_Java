package com.xworkz.Associate;

public class Shop {
	public SalesMan salesMan;
	public void shopName() {
		System.out.println("invoking shopName in Shop");
		if(this.salesMan!=null)
		{
			this.salesMan.name();
		}
		else
		{
			System.err.println("salesMan is null cannot invoke shopName");
		}
	}
	public void shopAddress() {
		System.out.println("invoking shopAddress in Shop");
		if(this.salesMan!=null)
		{
			this.salesMan.address();
		}
		else
		{
			System.err.println("salesMan is null cannot invoke shopAddress");
		}
	}
	
}
