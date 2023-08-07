package com.xworkz.Overloading;

public class Gadget {
	public void connect()
	{
		System.out.println("invoking connect in Gadget");
		connect("SmartPhone");
		connect(30);
	}
	public void connect(String type)
	{
		System.out.println("invoking connect,type in Gadget");
		System.out.println("Gadget Type is:"+type);
	}
	public void connect(int weight)
	{
		System.out.println("invoking connect,price in Gadget");
		System.out.println("Gadget Weight:"+weight);
	}
	public void connect(String type,int weight)
	{
		System.out.println("invoking binding,String,int in Gadget");
		connect(type);
		connect(weight);
	}

}
