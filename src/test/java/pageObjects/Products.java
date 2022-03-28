package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products
{
	WebDriver ldriver;
	public Products(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div[@class='xtXmba'][contains(.,'Mobiles')]")
	@CacheLookup
	WebElement Mobiles;
	@FindBy(xpath = "(//div[contains(@class,'xtXmba')])[1]")
	@CacheLookup
	WebElement TopOffers;
	
	
	
	  @FindBy(xpath = "//div[@class='xtXmba'][contains(.,'Mobiles')]")
	  @CacheLookup 
	  List<WebElement> lnb;
	  
	 


	 
	
	public void verifyproducts()
	{
		Mobiles.click();
		ldriver.navigate().back();
		
	}
	
	  public void list() throws InterruptedException
	  {
		  Thread.sleep(20000);
		  WebDriverWait wait=new WebDriverWait(ldriver,20);
	  wait.until(ExpectedConditions.visibilityOf(TopOffers));
	  System.out.println(ldriver.getTitle());
	  }
	 
	   
	

}
