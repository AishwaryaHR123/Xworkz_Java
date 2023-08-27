package com.xworkz.app.Methods;

public class LocalDateTime {
	public static void main(String[] args) {
		System.out.println("Invoking main in LocalDateTime");
		LocalDateTime localDateTime=new LocalDateTime();
		System.out.println(localDateTime.getClass());
		System.out.println(localDateTime.hashCode());
		System.out.println(localDateTime.toString());
		System.out.println(localDateTime.equals(localDateTime));
		//System.out.println(localDateTime.notifyAll());
	}

}
