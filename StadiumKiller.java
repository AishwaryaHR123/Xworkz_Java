class StadiumKiller{
	public static void main(String[] values)
	{
		System.out.println("running main in the StadiumKiller");
		Stadium stadium1=new Stadium();
		System.out.println(stadium1.game);
		System.out.println(stadium1.name);
		System.out.println(stadium1.player);
		System.out.println(stadium1.people);
		System.out.println(stadium1.playerName);
		
		System.out.println("=======================");
		stadium1.game="cricket";
		stadium1.name="chinnaswamy";
		stadium1.player=11;
		stadium1.people=1000;
		stadium1.playerName="Rohit Sharma";
		System.out.println(stadium1.game);
		System.out.println(stadium1.name);
		System.out.println(stadium1.player);
		System.out.println(stadium1.people);
		System.out.println(stadium1.playerName);
		
		System.out.println("----------------Stadium2-------------------");
		Stadium stadium2=new Stadium();
		System.out.println(stadium2.game);
		System.out.println(stadium2.name);
		System.out.println(stadium2.player);
		System.out.println(stadium2.people);
		System.out.println(stadium2.playerName);
		
		System.out.println("=======================");
		stadium2.game="hockey";
		stadium2.name="Eden Gardens";
		stadium2.player=9;
		stadium2.people=1400;
		stadium2.playerName="Sreejesh";
		System.out.println(stadium2.game);
		System.out.println(stadium2.name);
		System.out.println(stadium2.player);
		System.out.println(stadium2.people);
		System.out.println(stadium2.playerName);
	}
}
		
		