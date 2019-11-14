package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{
	@Test(priority=0)
	
	public void LoginTest() throws IOException, InterruptedException
	{
		
		
		driver.get(baseURl);
		logger.info("url is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("username is entered");
		
		lp.SetPassword(password);
		logger.info("password is entered");
		
		lp.ClickButton();
		System.out.println("Login Successfull!!");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Wishbook - Catalog B2B Application"))
		{
			Assert.assertTrue(true);
			logger.info("testlogin passed");
			
		}
		else
		{
			
				captureScreen(driver,"LoginTest");
			
			Assert.assertTrue(false);
			logger.info("testlogin failed");
			
		}
		
		
		
		
		
	
		
	}
	

}
