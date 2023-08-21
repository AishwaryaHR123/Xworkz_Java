package com.xworkz.Main;

public class StringRunner {
	public static void main(String[] args) {
		System.out.println("---------Instance-----------------");
		String string = new String("Aishwarya");
		int ref1 = string.codePointAt(5);
		System.out.println(ref1);
		int ref2 = string.codePointBefore(1);
		System.out.println(ref2);
		boolean ref3 = string.contentEquals("Anusha");
		System.out.println(ref3);
		int ref4 = string.indexOf("Rachana");
		System.out.println(ref4);
		boolean ref5=string.contentEquals("Aishu");
		System.out.println(ref5);
		
		System.out.println("--------------static--------------");
		String ref6=string.valueOf(false);
		System.out.println(ref6);
		String ref7=string.formatted(args);
		System.out.println(ref7);
		String ref8=string.valueOf("aishu");
		System.out.println(ref8);
		String name="punith";
		String ref9=name.valueOf(50l);
		System.out.println(ref9);
		String ref10=name.valueOf(100);
		System.out.println(ref10);
		

	}

}
