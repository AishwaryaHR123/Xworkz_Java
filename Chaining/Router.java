package com.xworkz.Chaining;

public class Router {
	public String name;
	public int routerModel;
	public String wifiSSID;
	public boolean connected;
	public Router(String name,int routerModel,String wifiSSID, boolean connected)
	{
		System.out.println("invoking String,int,String,boolean in Router");
		this.name=name;
		this.routerModel=routerModel;
		this.wifiSSID=wifiSSID;
		this.connected=connected;
	}

}
