class CricketInfo{
	
	int noOfPlayers=11;
	String stadiumName="Chinnaswamy";
	String name="Jadeja";
	
	CricketInfo()
	{

		System.out.println("Number of players:"+this.noOfPlayers);
		System.out.println("Stadium Name:"+this.stadiumName);
		System.out.println("Name:"+this.name);
		
	}
	CricketInfo(int noOfPlayers,String stadiumName,String name)
	{
		this.noOfPlayers=noOfPlayers;
		this.stadiumName=stadiumName;
		this.name=name;
		System.out.println("Number of players:"+this.noOfPlayers);
		System.out.println("Stadium Name:"+this.stadiumName);
		System.out.println("Name:"+this.name);
		
	}
	
}