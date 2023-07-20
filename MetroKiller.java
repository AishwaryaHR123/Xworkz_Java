class MetroKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in the MetroKiller");
		Metro metro1=new Metro();
		System.out.println(metro1.name);
		System.out.println(metro1.line1);
		System.out.println(metro1.line2);
		System.out.println(metro1.ticket);
		System.out.println(metro1.stationName);
		metro1.name="Vande mataram";
		metro1.line1="Green";
		metro1.line2="purple";
		metro1.ticket="QR";
		metro1.stationName="Rajajinagar";
		
		System.out.println("=======================");
		System.out.println(metro1.name);
		System.out.println(metro1.line1);
		System.out.println(metro1.line2);
		System.out.println(metro1.ticket);
		System.out.println(metro1.stationName);
		
		System.out.println("==========Metro2============");
		Metro metro2=new Metro();
		System.out.println(metro2.name);
		System.out.println(metro2.line1);
		System.out.println(metro2.line2);
		System.out.println(metro2.ticket);
		System.out.println(metro2.stationName);
		metro2.name="Vande mataram";
		metro2.line1="purple";
		metro2.line2="Green";
		metro2.ticket="coin";
		metro2.stationName="vijayanagar";
		
		System.out.println("=======================");
		System.out.println(metro2.name);
		System.out.println(metro2.line1);
		System.out.println(metro2.line2);
		System.out.println(metro2.ticket);
		System.out.println(metro2.stationName);
	}
}