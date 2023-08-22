package com.xworkz.Method;

public class ThreadRunner {

	public static void main(String[] args) {
		Thread thread=new Thread();
		System.out.println("invoking main in ThreadRunner");
		System.out.println(thread.getId());
		System.out.println(thread.isDaemon());
		System.out.println(thread.toString());
		System.out.println(thread.getState());
		System.out.println(thread.isInterrupted());
	}

}
