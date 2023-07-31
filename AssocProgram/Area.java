package com.xworkz.AssocProgram;

public class Area {
	public String areaName;
	public Corporator corporator;
	public Area(String name,Corporator corporator)
	{
		this.areaName=areaName;
		this.corporator=corporator;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Area");
		System.out.println("AreaName is:"+this.areaName);
		System.out.println("CorporatorName is:"+this.corporator);
		corporator.printInfo();
	}

}
