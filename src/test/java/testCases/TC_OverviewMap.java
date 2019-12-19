package testCases;



import org.testng.annotations.Test;

import pageObjects.OverviewMap;
import pageObjects.LoginPage;

//import pageObjects.BLogin;

public class TC_OverviewMap extends BaseClass {
	
	@Test(priority=1)
	public void border() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.ClickSignInBTn();
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.ClickButton();
		
		OverviewMap hp=new OverviewMap(driver);
		hp.entergeoname("Telangana");
		hp.verifyelements();
		
		
		
	
		
		
	}

}
