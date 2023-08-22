package com.xworkz.Method;

public class SystemRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in SystemRunner");
		System system;
		String name="Aishu";
		System.out.println(System.currentTimeMillis());
		System.out.println(System.clearProperty(name));
		System.out.println(System.lineSeparator());
		System.out.println(System.nanoTime());
		System.out.println(System.setProperty(name, name));
		
	}

}
