package com.xworkz.Polymorphism;

public class AllMainMethod {

	public static void main(String[] args) {
		System.out.println("invoking main in AllMainMethod");
		Bakery bakery = new BakeryInfo();
		bakery.cake();
		bakery.cake("Chocolate Cake");
		bakery.cake("Chocolate Cake", 30);
		bakery.cake("Chocolate Cake", 30, "Chocolate");
		bakery.cake("Chocolate Cake", 30, "Chocolate", "Brown");
		bakery.cake("Chocolate Cake", 30, "Chocolate", "Brown", true);

		Bakery bakery1 = new Bakery();
		bakery1.cake();
		bakery1.cake("Chocolate Cake");
		bakery1.cake("Chocolate Cake", 30);
		bakery1.cake("Chocolate Cake", 30, "Chocolate");
		bakery1.cake("Chocolate Cake", 30, "Chocolate", "Brown");
		bakery1.cake("Chocolate Cake", 30, "Chocolate", "Brown", true);

		System.out.println("---------------------------------------");
		Hotel hotel = new HotelInfo();
		hotel.food();
		hotel.food("Anmol");
		hotel.food("Anmol", 25);
		hotel.food("Anmol", 25, 200.00);
		hotel.food("Anmol", 25, 200.00, "Rajajinagar");
		hotel.food("Anmol", 25, 200.00, "Rajajinagar", "Dosa");

		Hotel hotel1 = new Hotel();
		hotel1.food();
		hotel1.food("Anmol");
		hotel1.food("Anmol", 25);
		hotel1.food("Anmol", 25, 200.00);
		hotel1.food("Anmol", 25, 200.00, "Rajajinagar");
		hotel1.food("Anmol", 25, 200.00, "Rajajinagar", "Dosa");

		System.out.println("---------------------------------------");
		Hospital hospital = new HospitalInfo();
		hospital.treatment();
		hospital.treatment("Aster");
		hospital.treatment("Aster", 12);
		hospital.treatment("Aster", 12, "Mahantesh");
		hospital.treatment("Aster", 12, "Mahantesh", 50);
		hospital.treatment("Aster", 12, "Mahantesh", 50, true);

		Hospital hospital1 = new Hospital();
		hospital1.treatment();
		hospital1.treatment("Aster");
		hospital1.treatment("Aster", 12);
		hospital1.treatment("Aster", 12, "Mahantesh");
		hospital1.treatment("Aster", 12, "Mahantesh", 50);
		hospital1.treatment("Aster", 12, "Mahantesh", 50, true);

		System.out.println("---------------------------------------");
		Hostel hostel = new HostelInfo();
		hostel.security();
		hostel.security("Pes Hostel");
		hostel.security("Pes Hostel", "Shivamogga");
		hostel.security("Pes Hostel", "Shivamogga", 50000);
		hostel.security("Pes Hostel", "Shivamogga", 50000, 300);
		hostel.security("Pes Hostel", "Shivamogga", 50000, 300, "Chapathi");

		Hostel hostel1 = new Hostel();
		hostel1.security();
		hostel1.security("Pes Hostel");
		hostel1.security("Pes Hostel", "Shivamogga");
		hostel1.security("Pes Hostel", "Shivamogga", 50000);
		hostel1.security("Pes Hostel", "Shivamogga", 50000, 300);
		hostel1.security("Pes Hostel", "Shivamogga", 50000, 300, "Chapathi");

		System.out.println("---------------------------------------");
		Mall mall = new MallInfo();
		mall.shop();
		mall.shop("Mantri Square");
		mall.shop("Mantri Square", "Malleshwaram");
		mall.shop("Mantri Square", "Malleshwaram", true);
		mall.shop("Mantri Square", "Malleshwaram", true, 4);
		mall.shop("Mantri Square", "Malleshwaram", true, 4, 50);

		Mall mall1 = new Mall();
		mall1.shop();
		mall1.shop("Mantri Square");
		mall1.shop("Mantri Square", "Malleshwaram");
		mall1.shop("Mantri Square", "Malleshwaram", true);
		mall1.shop("Mantri Square", "Malleshwaram", true, 4);
		mall1.shop("Mantri Square", "Malleshwaram", true, 4, 50);

		System.out.println("---------------------------------------");
		Theater theater = new TheaterInfo();
		theater.movie();
		theater.movie("cinepolis");
		theater.movie("cinepolis", "Kengeri");
		theater.movie("cinepolis", "Kengeri", 300);
		theater.movie("cinepolis", "Kengeri", 300, "KGF");
		theater.movie("cinepolis", "Kengeri", 300, "KGF", "PoPCorn");

		Theater theater1 = new Theater();
		theater1.movie();
		theater1.movie("cinepolis");
		theater1.movie("cinepolis", "Kengeri");
		theater1.movie("cinepolis", "Kengeri", 300);
		theater1.movie("cinepolis", "Kengeri", 300, "KGF");
		theater1.movie("cinepolis", "Kengeri", 300, "KGF", "PoPCorn");

		System.out.println("---------------------------------------");
		Library library = new LibraryInfo();
		library.study();
		library.study("public");
		library.study("public", "Hebbal");
		library.study("public", "Hebbal", 1000);
		library.study("public", "Hebbal", 1000, 30);
		library.study("public", "Hebbal", 1000, 30, 2001);

		Library library1 = new Library();
		library1.study();
		library1.study("public");
		library1.study("public", "Hebbal");
		library1.study("public", "Hebbal", 1000);
		library1.study("public", "Hebbal", 1000, 30);
		library1.study("public", "Hebbal", 1000, 30, 2001);

		System.out.println("---------------------------------------");
		Temple temple = new TempleInfo();
		temple.worship();
		temple.worship("Ram Mandir");
		temple.worship("Ram Mandir", 2011);
		temple.worship("Ram Mandir", 2011, "Hindu");
		temple.worship("Ram Mandir", 2011, "Hindu", "Punith");
		temple.worship("Ram Mandir", 2011, "Hindu", "Punith", "Saree");

		Temple temple1 = new Temple();
		temple1.worship();
		temple1.worship("Ram Mandir");
		temple1.worship("Ram Mandir", 2011);
		temple1.worship("Ram Mandir", 2011, "Hindu");
		temple1.worship("Ram Mandir", 2011, "Hindu", "Punith");
		temple1.worship("Ram Mandir", 2011, "Hindu", "Punith", "Saree");

		System.out.println("---------------------------------------");
		Market market = new MarketInfo();
		market.sell();
		market.sell("KR Market");
		market.sell("KR Market", "indiranagar");
		market.sell("KR Market", "indiranagar", true);
		market.sell("KR Market", "indiranagar", true, "vegetables");
		market.sell("KR Market", "indiranagar", true, "vegetables", "Cash");

		Market market1 = new Market();
		market1.sell();
		market1.sell("KR Market");
		market1.sell("KR Market", "indiranagar");
		market1.sell("KR Market", "indiranagar", true);
		market1.sell("KR Market", "indiranagar", true, "vegetables");
		market1.sell("KR Market", "indiranagar", true, "vegetables", "Cash");

		System.out.println("---------------------------------------");
		Street street = new StreetInfo();
		street.transportation();
		street.transportation("BhashyamCircle");
		street.transportation("BhashyamCircle", true);
		street.transportation("BhashyamCircle", true, "Commercial");
		street.transportation("BhashyamCircle", true, "Commercial", 200);
		street.transportation("BhashyamCircle", true, "Commercial", 200, "Rajajinagar");

		Street street1 = new Street();
		street1.transportation();
		street1.transportation("BhashyamCircle");
		street1.transportation("BhashyamCircle", true);
		street1.transportation("BhashyamCircle", true, "Commercial");
		street1.transportation("BhashyamCircle", true, "Commercial", 200);
		street1.transportation("BhashyamCircle", true, "Commercial", 200, "Rajajinagar");

		System.out.println("---------------------------------------");
		Zoo zoo = new ZooInfo();
		zoo.conserve();
		zoo.conserve("Bannerghatta");
		zoo.conserve("Bannerghatta", "Electronic City");
		zoo.conserve("Bannerghatta", "Electronic City", 50);
		zoo.conserve("Bannerghatta", "Electronic City", 50, 2011);
		zoo.conserve("Bannerghatta", "Electronic City", 50, 2011, 50);

		Zoo zoo1 = new Zoo();
		zoo1.conserve();
		zoo1.conserve("Bannerghatta");
		zoo1.conserve("Bannerghatta", "Electronic City");
		zoo1.conserve("Bannerghatta", "Electronic City", 50);
		zoo1.conserve("Bannerghatta", "Electronic City", 50, 2011);
		zoo1.conserve("Bannerghatta", "Electronic City", 50, 2011, 50);

		System.out.println("---------------------------------------");
		City city = new CityInfo();
		city.living();
		city.living("Bangalore");
		city.living("Bangalore", 577221);
		city.living("Bangalore", 577221, 50000);
		city.living("Bangalore", 577221, 50000, true);
		city.living("Bangalore", 577221, 50000, true, 4);
		
		City city1 = new City();
		city1.living();
		city1.living("Bangalore");
		city1.living("Bangalore", 577221);
		city1.living("Bangalore", 577221, 50000);
		city1.living("Bangalore", 577221, 50000, true);
		city1.living("Bangalore", 577221, 50000, true, 4);
		
		System.out.println("---------------------------------------");
		Pub pub=new PubInfo();
		pub.entertainment();
		pub.entertainment("Druken Daddy");
		pub.entertainment("Druken Daddy", "kormangala");
		pub.entertainment("Druken Daddy", "kormangala", "beers");
		pub.entertainment("Druken Daddy", "kormangala", "beers",7);
		pub.entertainment("Druken Daddy", "kormangala", "beers",7, true);
		
		Pub pub1=new Pub();
		pub1.entertainment();
		pub1.entertainment("Druken Daddy");
		pub1.entertainment("Druken Daddy", "kormangala");
		pub1.entertainment("Druken Daddy", "kormangala", "beers");
		pub1.entertainment("Druken Daddy", "kormangala", "beers",7);
		pub1.entertainment("Druken Daddy", "kormangala", "beers",7, true);
		
		System.out.println("---------------------------------------");
		PoliceStation policeStation=new PoliceStationInfo();
		policeStation.security();
		policeStation.security("central policeStation");
		policeStation.security("central policeStation","Rajajinagar");
		policeStation.security("central policeStation","Rajajinagar",20);
		policeStation.security("central policeStation","Rajajinagar",20,300);
		policeStation.security("central policeStation","Rajajinagar",20,300,1997);
		
		PoliceStation policeStation1=new PoliceStation();
		policeStation1.security();
		policeStation1.security("central policeStation");
		policeStation1.security("central policeStation","Rajajinagar");
		policeStation1.security("central policeStation","Rajajinagar",20);
		policeStation1.security("central policeStation","Rajajinagar",20,300);
		policeStation1.security("central policeStation","Rajajinagar",20,300,1997);
		


	}

}
