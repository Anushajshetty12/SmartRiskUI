package testCases;

import org.testng.annotations.Test;

import pageObjects.UserLogin;

public class TC_Login extends BaseClass
{
	@Test(priority=0)
	public void userLogin()
	{
		UserLogin u=new UserLogin(driver);
		u.userlogin(username, password);
		
	}

}
