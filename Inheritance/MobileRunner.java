package com.xworkz.Inheritance;

public class MobileRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MobileRunner");
		Mobile mobile=new Mobile();
		Mobile mobile1=new KeyPad();
		Mobile mobile2=new Android();
		Mobile mobile3=new SmartMobile();
		mobile.mobileInfo();
		System.out.println(mobile.name);
		KeyPad keyPad=new KeyPad();
		KeyPad keyPad1=new Android();
		KeyPad keyPad2=new SmartMobile();
		keyPad.keyPadInfo();
		System.out.println(keyPad.brand);
		Android android=new Android();
		Android android1=new SmartMobile();
		android.androidInfo();
		System.out.println(android.price);
		SmartMobile smartMobile1=new SmartMobile();
		smartMobile1.mobileInfo();
		System.out.println(smartMobile1.mobileName);
		
	}

}
