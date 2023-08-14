package com.xworkz.Abstract;

public class AllMethodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AllMethodRunner");
		Movie movie = new ActionMovie();
		System.out.println("invoking movie in main");
		movie.song();
		movie.dance();
		movie.display();
		movie.releaseDate();
		movie.entertain();
		movie.audio();
		movie.vedio();

		System.out.println("---------------------------------------");
		Phone phone = new SmartPhone();
		System.out.println("invoking Phone in main");
		phone.call();
		phone.text();
		phone.browsing();
		phone.email();
		phone.hotspot();
		phone.cameraGood();
		phone.music();

		System.out.println("---------------------------------------");
		Ticket ticket = new ConcertTicket();
		System.out.println("invoking Ticket in main");
		ticket.artist();
		ticket.time();
		ticket.music();
		ticket.date();
		ticket.venue();
		ticket.ticketNumber();
		ticket.level();

		System.out.println("---------------------------------------");
		Vehicle vehicle = new ElectricVehicle();
		System.out.println("invoking vehicle in main");
		vehicle.start();
		vehicle.stop();
		vehicle.steer();
		vehicle.voiceControl();
		vehicle.capacity();
		vehicle.accelerate();
		vehicle.light();

		System.out.println("---------------------------------------");
		SocialMedia socialMedia = new Instagram();
		System.out.println("invoking SocialMedia in main");
		socialMedia.call();
		socialMedia.sharPhoto();
		socialMedia.shareVedio();
		socialMedia.profile();
		socialMedia.sell();
		socialMedia.message();
		socialMedia.connect();

	}

}
