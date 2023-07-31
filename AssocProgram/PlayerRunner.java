package com.xworkz.AssocProgram;

public class PlayerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in  PlayerRunner");
		String sportName="Cricket";
		String name="Cricket";

		Floor floor=new Floor("Ground Floor",0);
		Floor floor1=new Floor("First Floor",1);
		Floor floor2=new Floor("Second Floor",2);
		Floor floor3=new Floor("Third Floor",3);
		Floor floor4=new Floor("Four Floor",4);
		Floor floor5=new Floor("Fifth Floor",5);
		Floor floor6=new Floor("Sixth Floor",6);

		Floor[] floors= {floor, floor1, floor2, floor3, floor4, floor5, floor6};

		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);

		Lift[] lifts= {lift, lift1};

		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);
		Building[] buildings= {building,building1};


		Corporator corporator=new Corporator(buildings,"aishu");
		Area area=new Area("BTM Layout", corporator);
		Area area1=new Area("Maleshwaram", corporator);
		Area area2=new Area("Rjajinagar", corporator);
		Area area3=new Area("Banashankari", corporator);
		Area area4=new Area("Chikkaballapura", corporator);
		Area[] areas= {area,area1,area2,area3,area4};
		HomeTown town=new HomeTown("Bangalore", 543500, areas );

		Player player=new Player(building,"Rohit","25years",town);
		Player player1=new Player(building,"Kohli","15years",town);
		Player player2=new Player(building,"Jadeja","7years",town);
		Player player3=new Player(building,"Dhoni","6years",town);
		Player player4=new Player(building,"Sachin","4years",town);
		Player[] players= {player,player1};

		Sport sport=new Sport(name,players);
	    sport.printInfo();
	    area1.printInfo();
	    
		

	}

}
