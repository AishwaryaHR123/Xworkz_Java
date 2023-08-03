package com.xworkz.Casting;

public class BrowserUtil {
	public static void history(Browser browser)
	{
		System.out.println("invoking history in BrowserUtil");
		System.out.println(browser.speed);
		browser.search();
		if(browser instanceof ChromeBrowser)
		{
			System.out.println("Browser is a ChromeBrowser");
			ChromeBrowser chromeBrowser=(ChromeBrowser)browser;
			System.out.println(chromeBrowser.speed);
			chromeBrowser.chromeInfo();
		}
		if(browser instanceof OperaBrowser)
		{
			System.out.println("Browser is a OperaBrowser");
			OperaBrowser operaBrowser=(OperaBrowser)browser;
			System.out.println(operaBrowser.path);
			operaBrowser.operaInfo();
		}
		if(browser instanceof FireFox)
		{
			System.out.println("Browser is a FireFox");
			FireFox fireFox=(FireFox)browser;
			System.out.println(fireFox.cost);
			fireFox.fireFoxInfo();;
		}
		if(browser instanceof Edge)
		{
			System.out.println("Browser is a Edge");
			Edge edge=(Edge)browser;
			System.out.println(edge.name);
			edge.edgeInfo();
		}
	}

}
