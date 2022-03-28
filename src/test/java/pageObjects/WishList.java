package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList 
	{
		WebDriver ldriver;


		public WishList(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		@FindBy(xpath = "//path[contains(@class,'eX72wL')]")
		@CacheLookup
		WebElement WishList ;
		 public void addtoWishList()
		 {
			 WishList.click();
		 }
}
