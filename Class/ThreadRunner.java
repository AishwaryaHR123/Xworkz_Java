package com.xworkz.Main;

public class ThreadRunner {

	public static void main(String[] args) {
		System.out.println("----------------Instance--------------");
		Thread thread=new Thread("Anusha");
		String ref1=thread.toString();
		System.out.println(ref1);
		String ref2=thread.getName();
		System.out.println(ref2);
		int ref3=thread.getPriority();
		System.out.println(ref3);
		boolean ref4=thread.isDaemon();
		System.out.println(ref4);
		long ref5=thread.getId();
		System.out.println(ref5);
		System.out.println("----------------Static--------------");
		boolean ref6=thread.interrupted();
		System.out.println(ref6);
		int ref7=thread.activeCount();
		System.out.println(ref7);
		Thread ref8=thread.currentThread();
		System.out.println(ref8);
		boolean ref9=thread.holdsLock("anupama");
		System.out.println(ref9);
		boolean ref10=thread.isInterrupted();
		System.out.println(ref10);
				

		
		

	}

}
