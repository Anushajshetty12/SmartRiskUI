package testCases;

import org.testng.annotations.Test;

import pageObjects.AddtoCart;
import pageObjects.Profile;
import pageObjects.UserLogin;

public class TC_AddtoCart extends BaseClass
{
@Test(priority=3)
public void selectanItem() throws InterruptedException
{
	 UserLogin u=new UserLogin(driver);
	  u.userlogin(username, password);
	  Thread.sleep(5000);
	  AddtoCart a=new AddtoCart(driver);
	 a.addToCart();
	 
	
}
}
