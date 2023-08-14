package com.xworkz.Abstract;

public abstract class Ticket {
	public void event() {
		System.out.println("invoking ticketStatus in Ticket");
	}

	public void level() {
		System.out.println("invoking level in Ticket");
	}

	public double cost() {
		System.out.println("Invoking Cost in Ticket");
		return 200.00;
	}

	public int ticketNumber() {
		System.out.println("invoking ticketNumber in Ticket");
		return 20;
	}

	public void status() {
		System.out.println("invoking Status in Ticket");
	}
	public abstract String artist();
	public abstract int time();
	public abstract void music();
	public abstract int date();
	public abstract String venue();
	
	

}
