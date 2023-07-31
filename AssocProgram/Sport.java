package com.xworkz.AssocProgram;

public class Sport {
	public String sportName;
	public Player[] player;
	public Sport(String name,Player[] player)
	{
		this.sportName=sportName;
		this.player=player;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Sport");
		System.out.println("SportName is:"+this.sportName);
		for(int index=0;index<this.player.length;index++)
		{
			Player ref=player[index];
			ref.printInfo();
		}
	}
	

}
