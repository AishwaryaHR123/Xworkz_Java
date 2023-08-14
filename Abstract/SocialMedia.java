package com.xworkz.Abstract;

public abstract class SocialMedia {
	public void message()
	{
		System.out.println("invoking message in SocialMedia");
	}
	public void connect()
	{
		System.out.println("invoking connect in SocialMedia");
	}
	public void poll()
	{
		System.out.println("invoking poll in SocialMedia");
	}
	public void post()
	{
		System.out.println("invoking post in SocialMedia");
	}
	public void buy()
	{
		System.out.println("invoking buy in SocialMedia");
	}
	public abstract void call();
	public abstract void sharPhoto();
	public abstract void shareVedio();
	public abstract boolean profile();
	public abstract void sell();
	

}
