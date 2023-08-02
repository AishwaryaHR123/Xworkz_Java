package com.xworkz.Inheritance;

public class ElectronicRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ElectronicRunner");
		ElectronicDevice electronicDevice=new ElectronicDevice();
		ElectronicDevice electronicDevice1=new Computer();
		ElectronicDevice electronicDevice2=new DeskTop();
		ElectronicDevice ElectronicDevice3=new Laptop();
		ElectronicDevice ElectronicDevice4=new Tab();
		electronicDevice.electronicInfo();
		System.out.println(electronicDevice.deviceName);
		Computer computer=new Computer();
		Computer computer1=new DeskTop();
		Computer computer2=new Laptop();
		Computer computer3=new Tab();
		computer.computerInfo();
		System.out.println(computer.color);
		DeskTop deskTop1=new DeskTop();
		DeskTop deskTop2=new Laptop();
		DeskTop deskTop3=new Tab();
		deskTop1.desktopInfo();
		System.out.println(deskTop1.price);
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Tab();
		laptop1.laptopInfo();
		System.out.println(laptop1.storage);
		Tab tab=new Tab();
		tab.tabInfo();
		System.out.println(tab.tabName);

	}

}
