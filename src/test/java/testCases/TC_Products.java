package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Products;

public class TC_Products extends BaseClass
{
	@Test(priority = 0)
public void verifylist() throws InterruptedException
{
		LoginPage login=new LoginPage(driver);
		login.login();
		Products p=new Products(driver);
		p.verifyproducts();
}
	@Test(priority = 1)
	public void topoffers() throws InterruptedException
	{
		Products p=new Products(driver);
		p.list();
	}

}
