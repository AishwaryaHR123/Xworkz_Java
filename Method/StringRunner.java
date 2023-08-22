package com.xworkz.Method;

public class StringRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StringRunner");
		String string = new String();
		String string1 = "punith";
		System.out.println(string1.charAt(5));
		System.out.println(string1.split("Anusha"));
		System.out.println(string1.split("Aishwarya", 4));
		System.out.println(string1.concat("Kumar"));
		System.out.println(string1.compareTo("punith"));
		System.out.println(string1.substring(1));
		System.out.println(string.isEmpty());
		System.out.println(string1.length());
		System.out.println(string1.startsWith("p"));
		System.out.println(string1.endsWith("h"));
		System.out.println(string1.equalsIgnoreCase("Aishu"));
		System.out.println(string1.equals("punith"));
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		System.out.println(string1.isBlank());
		System.out.println(string1.indexOf(5));
		System.out.println(string1.trim());
	}

}
