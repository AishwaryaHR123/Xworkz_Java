package com.xworkz.AssocProgram;

public class Corporator {
	public Building[] buildings;
	public String corporatorName;
	public Corporator(Building[] buildings,String name)
	{
		this.buildings=buildings;
		this.corporatorName=corporatorName;
	}
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Corporator");
		System.out.println("BuildingName is:"+this.corporatorName);
		for(int index=0;index<this.buildings.length;index++)
		{
			Building ref5=buildings[index];
			ref5.printInfo();
			
		}
	}

}
