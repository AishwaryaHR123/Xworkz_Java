package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Bus;
import com.xworkz.Farmer.app.Passenger;

public class PassengerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Passenger Runner");
		int noOfPassenger=60;
		Bus bus=new Bus();
		Passenger passenger=new Passenger();
		passenger.Passenger(70);
		passenger.setBus(bus);
		passenger.travel();
	}

}
