package com.xworkz.Associate;

public class Browser {
	public Internet internet;
	public void search()
	{
		System.out.println("invoking search in browser");
		if(this.internet!=null) {
			System.out.println("invoking search in browser");
			this.internet.speed();
		}
		else {
			System.err.println("internet is null cannot invoke the search ");
		}	
	}
	public void data()
	{
		System.out.println("invoking data in browser");
		if(this.internet!=null) {
			System.out.println("invoking data in browser");
			this.internet.access();
		}
		else {
			System.err.println("internet is null cannot invoke the data ");
		}	
	}
	

}
