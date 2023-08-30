
package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Browser;
import com.xworkz.Abstraction.implementation.Chrome;
import com.xworkz.Abstraction.rule.Internet;

public class InternetRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in InternetRunner");
		Internet internet=new Chrome();
		Browser browser=new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
