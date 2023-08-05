package com.xworkz.Chaining;

public class RouterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RouterRunner");
		Router router=new Router("Wireless",34,"LINK-56",false);
		System.out.println(router.name);
		System.out.println(router.routerModel);
		System.out.println(router.wifiSSID);
		System.out.println(router.connected);
		System.out.println(".......................................");
		WirelessRouter wirelessRouter =new WirelessRouter();
		System.out.println(wirelessRouter.name);
		System.out.println(wirelessRouter.routerModel);
		System.out.println(wirelessRouter.wifiSSID);
		System.out.println(wirelessRouter.connected);
		System.out.println(".......................................");
		WirelessRouter wirelessRouter1 =new WirelessRouter("Core",21,"EPWPN-45",true);
		System.out.println(wirelessRouter1.name);
		System.out.println(wirelessRouter1.routerModel);
		System.out.println(wirelessRouter1.wifiSSID);
		System.out.println(wirelessRouter1.connected);
		
		
		

	}

}
