package com.xworkz.AssocProgram;

public class HomeTown {
	public String homeTownName;
	public int pinCode;
	public Area[] area;
	public HomeTown(String name,int pinCode,Area[] area)
	{
		this.homeTownName=homeTownName;
		this.pinCode=pinCode;
		this.area=area;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in HomeTown");
		System.out.println("TownName is:"+this.homeTownName);
		System.out.println("TownPinCode is:"+this.pinCode);
		for(int index=0;index<this.area.length;index++) {
			Area ref1=area[index];
			ref1.printInfo();
		}
	}
	

}
