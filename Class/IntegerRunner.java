package com.xworkz.Main;

public class IntegerRunner {

	public static void main(String[] args) {
		System.out.println("-------------------instance-----------------");
		Integer integer=new Integer(5000);
		int ref1=integer.intValue();
		System.out.println(ref1);
		float ref2=integer.floatValue();
		System.out.println(ref2);
		int ref3=integer.compareTo(5000);
		System.out.println(ref3);
		byte ref4=integer.byteValue();
		System.out.println(ref4);
		double ref5=integer.doubleValue();
		System.out.println(ref5);
		
		System.out.println("-------------------Static-------------------");
		String ref6=integer.toBinaryString(40);
		System.out.println(ref6);
		Integer ref7=integer.valueOf(300);
		System.out.println(ref7);
		String ref8=integer.toHexString(700);
		System.out.println(ref8);
		long ref9=integer.toUnsignedLong(650);
		System.out.println(ref9);
		int ref10=integer.sum(5, 7);
		System.out.println(ref10);
	}

}
