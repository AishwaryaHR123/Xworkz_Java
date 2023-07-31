package com.xworkz.AssocProgram;

public class Player {
	public Building building;
	public String playerName;
	public String exp;
	public HomeTown town;
	public Player(Building building,String name,String exp,HomeTown town)
	{
		this.building=building;
		this.playerName=playerName;
		this.exp=exp;
		this.town=town;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Player");
		System.out.println("PlayerBuilding is :"+this.building);
		System.out.println("PlayerName is:"+this.playerName);
		System.out.println("PlayerExp is:"+this.exp);
		System.out.println("PlayerTown is:"+this.town);
	}
	

}
