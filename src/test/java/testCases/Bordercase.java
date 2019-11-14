package testCases;



import org.testng.annotations.Test;

import pageObjects.Border;

//import pageObjects.BLogin;

public class Bordercase extends BaseClass {
	
	@Test(priority=1)
	public void border() throws InterruptedException
	{
		blogin b=new blogin();
		b.login();
		Border b1=new Border(driver);
		Thread.sleep(2000);
		b1.search();
		b1.searchinput("Catsingle114");
		Thread.sleep(2000);
		b1.clickimage();
		b1.cart();
		Thread.sleep(2000);
		b1.carticon();
		Thread.sleep(2000);
		b1.placeorder();
		Thread.sleep(8000);
		
		System.out.println("done!!!!!!!!!!");
		
		
	}

}
