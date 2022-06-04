package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AddtoCart {
	WebDriver ldriver;
	public static Logger logger;
	public AddtoCart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		logger=Logger.getLogger("AddtoCart");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@FindBy(xpath = "(//div[contains(@class,'xtXmba')])")
	List<WebElement> Grids;
	
	@FindBy(xpath = "(//img[@class='_396cs4 _3exPp9'])")
	List<WebElement> DealsoftheDay;
	
	@FindBy(xpath = "(//img[contains(@class,'_2r_T1I')])")
	@CacheLookup
	List<WebElement> DealsoftheDayList;
	

	
	@FindBy(xpath = "//h2[contains(.,'Deals of the Day')]")
	WebElement Dod;
	
	@FindBy(xpath = "//button[contains(.,'ADD TO CART')]")
	WebElement AddtoCart;
	
	@FindBy(xpath = "//span[contains(.,'Cart')]")
	@CacheLookup
	WebElement Cart;
	
	@FindBy(xpath = "//span[contains(.,'Please select a Size to proceed')]")
	@CacheLookup
	WebElement SelectSizeError;
	
	@FindBy(xpath = "(//a[contains(@class,'_1fGeJ5 _2UVyXR _31hAvz')])[1]")
	@CacheLookup
	WebElement SelectSize;
	
	@FindBy(xpath = "(//div[contains(@class,'3dsJAO')])")
	@CacheLookup
	List<WebElement> cartList;
	
	@FindBy(xpath = "//div[@class='_3dsJAO'][contains(.,'Remove')]")
	WebElement removeCart;
	
	
	@FindBy(xpath = "//div[@class='_3dsJAO _24d-qY FhkMJZ'][contains(.,'Remove')]")
	WebElement remove;
	
	/*
	 * public void selectanitem() throws InterruptedException {
	 * 
	 * for(int i=0;i<Grids.size();i++) { String s="Top Offers"; String
	 * s1=Grids.get(i).getText(); System.out.println(s1); if(s.equals(s1)) {
	 * ldriver.navigate().refresh(); Grids.get(i).click(); Thread.sleep(5000); }
	 * break; } String s2="Deals of the Day"; String s3=Dod.getText();
	 * System.out.println(s3); if(s2.equals(s3)) Assert.assertTrue(true);
	 * 
	 * for(int i=0;i<DealsoftheDay.size();i++) { DealsoftheDay.get(i).click();
	 * Thread.sleep(5000); break; }
	 * 
	 * for(int i=0;i<DealsoftheDay.size();i++) { DealsoftheDay.get(i).click();
	 * Thread.sleep(5000); break; }
	 */
		// It will return the parent window name as a String
	
	public void addToCart() throws InterruptedException,NoSuchElementException
	{
		String parent=ldriver.getWindowHandle();

		Set<String>s=ldriver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		ldriver.switchTo().window(child_window);

		System.out.println(ldriver.switchTo().window(child_window).getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", AddtoCart);
		AddtoCart.click();
		logger.info("added to cart");
		Thread.sleep(2000);
		
		/*
		 * if(SelectSizeError.isDisplayed()) { SelectSize.click(); WebDriverWait
		 * wait=new WebDriverWait(ldriver,20);
		 * wait.until(ExpectedConditions.visibilityOf(AddtoCart)); JavascriptExecutor
		 * js1 = (JavascriptExecutor) ldriver;
		 * js1.executeScript("window.scrollBy(0,1000)", ""); AddtoCart.click();
		 * Thread.sleep(500); }
		 * 
		 * else {
		 */
		
		
		ldriver.close();
		}

		}
		//switch to the parent window
		ldriver.switchTo().window(parent);
		ldriver.navigate().refresh();
		Cart.click();
		for(int i=0;i<cartList.size();i++)
		{
			try
			{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", removeCart);
		js.executeScript("arguments[0].click();", removeCart);
		Thread.sleep(500);
		
			
				remove.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		
		
		
		
		
	
		
	}
		
	}

