package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ManageAddress {


	WebDriver ldriver;
	public static Logger logger;
	public ManageAddress(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		logger=Logger.getLogger("ManageAddress");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	@FindBy(xpath = "//div[@class='NS64GK'][contains(.,'Manage Addresses')]")
	@CacheLookup
	WebElement manageAddress;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _3lI646 _3dESVI'][contains(.,'ADD ADDRESSES')]")
	@CacheLookup
	WebElement addAddress;
	
	@FindBy(xpath = "//input[contains(@name,'name')]")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath = "//input[contains(@name,'phone')]")
	@CacheLookup
	WebElement phoneNumber;
	
	@FindBy(xpath = "//input[contains(@name,'pincode')]")
	@CacheLookup
	WebElement pin;
	
	@FindBy(xpath = "//input[contains(@name,'addressLine2')]")
	@CacheLookup
	WebElement locality;
	
	@FindBy(xpath = "//textarea[contains(@name,'addressLine1')]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "//input[contains(@name,'city')]")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath = "(//div[contains(@class,'_1XFPmK')])[1]")
	@CacheLookup
	WebElement addressType;
	
	@FindBy(xpath = "//select[contains(@name,'state')]")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL'][contains(.,'Save')]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath = "//div[@class='_3E8aIl _1UHYca'][contains(.,'EditDelete')]")
	//@FindBy(xpath = "//div[@class='_16FXBY'][contains(.,'Edit')]")
	@CacheLookup
	WebElement editdelete;
	
	//@FindBy(xpath = "//span[contains(.,'Delete')]")
	@FindBy(xpath = "//div[@class='_16FXBY'][contains(.,'Delete')]")
	@CacheLookup
	WebElement delete;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l ZRrG8H _3AWRsL'][contains(.,'YES, DELETE')]")
	@CacheLookup
	WebElement confirmDelete;
	
	public void manageAddress(String name1,String phone,String pincode,String al2) throws InterruptedException
	{
		manageAddress.click();
		addAddress.click();
		name.sendKeys(name1);
		phoneNumber.sendKeys(phone);
		pin.sendKeys(pincode);
		locality.sendKeys(al2);
	
	}
	public void manageAddress1(String addr) throws InterruptedException
	{
		address.sendKeys(addr);
		Thread.sleep(5000);
		addressType.click();
		save.click();
		Thread.sleep(5000);
		WebDriverWait wait =new WebDriverWait(ldriver,20);
		wait.until(ExpectedConditions.elementToBeClickable(editdelete));
		Actions action = new Actions(ldriver);
		action.moveToElement(editdelete).perform();
		delete.click();
		confirmDelete.click();
		Thread.sleep(5000);
		
		
	}
	
	

}
