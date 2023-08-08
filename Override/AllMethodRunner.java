package com.xworkz.Override;

public class AllMethodRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in AllMethodRunner");
		Coal coal=new LigniteCoal();
		coal.burn();
		System.out.println("---------------------------------");
		Amoeba amoeba = new SpeciesAmoeba(); 
		amoeba.feeding();
		System.out.println("---------------------------------");
		Bangle bangle=new GoldBangle();
		bangle.sound();
		System.out.println("---------------------------------");
		Gate gate=new AutomatedGate();
		gate.privacy();
		System.out.println("---------------------------------");
		Dinosaur dinosaur=new LizardDinosaur();
		dinosaur.eat();
		System.out.println("---------------------------------");
		Flex flex=new Poster();
		flex.displayInfo();
		System.out.println("---------------------------------");
		Mic mic=new Speaker();
		mic.sound();
		System.out.println("---------------------------------");
		Drum drum=new Sintex();
		drum.store();
		System.out.println("---------------------------------");
		Theater theater=new BlackBoxTheater();
		theater.entertainment();
		System.out.println("---------------------------------");
		Ticket ticket=new TrainTicket();
		ticket.record();
		
		

		
	}

}
