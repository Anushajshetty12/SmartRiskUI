package testCases;

import org.testng.annotations.Test;

import pageObjects.BLogin;

public class blogin extends BaseClass{
	
	@Test(priority=0)
	public void login() throws InterruptedException
	{
	//	driver.get(bliteUrl);
		BLogin b=new BLogin(driver);
		b.loginfield(username);
		b.proceedbutton();
		Thread.sleep(2000);
		b.passwordfield(password);
		b.proceedbutton1();
		Thread.sleep(2000);
		b.clickdone();
		Thread.sleep(2000);
		b.getstarted();
		Thread.sleep(5000);
		System.out.println("login successfull!!");
		
	}

}
