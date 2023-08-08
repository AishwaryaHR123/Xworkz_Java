package com.xworkz.Override;

public class TrainTicket extends Ticket{
	@Override
	public void record() {
		System.out.println("TrainTicket overrides the Ticket");
		super.record();
	}

}
