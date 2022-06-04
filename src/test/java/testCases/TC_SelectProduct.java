package testCases;

import org.testng.annotations.Test;

import pageObjects.AddtoCart;
import pageObjects.Profile;
import pageObjects.SelectProduct;
import pageObjects.UserLogin;

public class TC_SelectProduct extends BaseClass
{
	 @Test(priority=3) 
	  public void navigatetoprofilepage() throws InterruptedException 
	  { 
		String s="Vivo Mobiles";
	  UserLogin u=new UserLogin(BaseClass.driver);
	  u.userlogin(username, password);
	  SelectProduct selectProduct=new SelectProduct(BaseClass.driver);
	  selectProduct.selectProduct(s);
	  AddtoCart addToCart=new AddtoCart(BaseClass.driver);
	 addToCart.addToCart();	  
	  
	  }

}
