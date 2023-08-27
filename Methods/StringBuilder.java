package com.xworkz.app.Methods;

public class StringBuilder {
	public static void main(String[] args) {
		System.out.println("Invoking main in StringBuilder");
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.equals(args));
		System.out.println(stringBuilder.getClass());
		System.out.println(stringBuilder.hashCode());
		System.out.println(stringBuilder.toString());
		//System.out.println(stringBuilder.notifyAll());

		
	}

}
