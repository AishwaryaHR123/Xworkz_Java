package com.xworkz.Casting;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BrowserRunner ");
		System.out.println("...............................");
		Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		OperaBrowser operaBrowser=new OperaBrowser();
		FireFox fireFox=new FireFox();
		Edge edge=new Edge();
		BrowserUtil.history(browser);
		System.out.println("...............................");
		BrowserUtil.history(chromeBrowser);
		System.out.println("...............................");
		BrowserUtil.history(operaBrowser);
		System.out.println("................................");
		BrowserUtil.history(fireFox);
		System.out.println(".................................");
		BrowserUtil.history(edge);

	}

}
