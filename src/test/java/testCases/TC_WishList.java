package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Products;
import pageObjects.SelectProduct;
import pageObjects.UserLogin;
import pageObjects.WishList;

public class TC_WishList extends BaseClass
{
	@Test(priority =1)
public void addtowishList() throws InterruptedException
{
		UserLogin u=new UserLogin(driver);
		u.userlogin(username, password);
		SelectProduct s=new SelectProduct(driver);
		s.selectProduct();
		
		WishList w=new WishList(driver);
		w.addtoWishList();
	
		 
		
}

}
