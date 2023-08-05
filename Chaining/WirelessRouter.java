package com.xworkz.Chaining;

public class WirelessRouter extends Router{
	public WirelessRouter()
	{
		this("VPN",32,"TPE9-F4",true);
		System.out.println("invoking no-args in WirelessRouter");
	}

	public WirelessRouter(String name, int routerModel, String wifiSSID, boolean connected) {
		super(name, routerModel, wifiSSID, connected);
		System.out.println("invoking String,int,String,boolean in WirelessRouter");
		
		
	}
	

}
