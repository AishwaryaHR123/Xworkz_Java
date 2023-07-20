class BadmintonKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in the BadmintonKiller");
		Badminton badminton1=new Badminton();
		System.out.println(badminton1.noOfPlayer);
		System.out.println(badminton1.playerName);
		System.out.println(badminton1.stadiumName);
		System.out.println(badminton1.brand);
		System.out.println(badminton1.people);
		
		System.out.println("=======================");
		badminton1.noOfPlayer=2;
		badminton1.playerName="saina";
		badminton1.stadiumName="Bangalore";
		badminton1.brand="victor";
		badminton1.people=2000;
		System.out.println(badminton1.noOfPlayer);
		System.out.println(badminton1.playerName);
		System.out.println(badminton1.stadiumName);
		System.out.println(badminton1.brand);
		System.out.println(badminton1.people);
		
		
		System.out.println("===========Badminton2============");
		Badminton badminton2=new Badminton();
		System.out.println(badminton2.noOfPlayer);
		System.out.println(badminton2.playerName);
		System.out.println(badminton2.stadiumName);
		System.out.println(badminton2.brand);
		System.out.println(badminton2.people);
		
		System.out.println("=======================");
		badminton2.noOfPlayer=2;
		badminton2.playerName="sindhu";
		badminton2.stadiumName="chinnaswamy";
		badminton2.brand="yonex";
		badminton2.people=5000;
		System.out.println(badminton2.noOfPlayer);
		System.out.println(badminton2.playerName);
		System.out.println(badminton2.stadiumName);
		System.out.println(badminton2.brand);
		System.out.println(badminton2.people);
	}
}