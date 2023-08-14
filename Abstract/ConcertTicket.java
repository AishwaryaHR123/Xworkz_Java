package com.xworkz.Abstract;

public class ConcertTicket extends Ticket {
	@Override
	public String artist() {
		return "darshan";

	}

	@Override
	public int time() {
		return 10;
	}

	@Override
	public void music() {

	}

	@Override
	public int date() {
		return 20;
	}

	@Override
	public String venue() {
		return null;
	}

}
