package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLogin {
	WebDriver ldriver;
	public BLogin(WebDriver rdriver)
	{
		ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[contains(@maxlength,'10')]")
	@CacheLookup
	WebElement loginfield;
	
	
	@FindBy(xpath = "//div[@aria-label='LoginScreenProceedButton'][contains(.,'PROCEED')]")
	@CacheLookup
	WebElement proceedbutton;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	@CacheLookup
	WebElement passwordfield;
	
	@FindBy(xpath = "//div[@aria-label='VerifyOtpScreenProceedButton']")
	@CacheLookup
	WebElement proceed1;
	
	@FindBy(xpath = "//div[@aria-label='LanguageScreenDoneButton'][contains(.,'Done')]")
	@CacheLookup
	WebElement done;
	
	@FindBy(xpath = "//div[@dir='auto'][contains(.,'GET STARTED')]")
	@CacheLookup
	WebElement getstarted;
	
	public void loginfield(String phonenumber)
	{
		loginfield.sendKeys(phonenumber);
	}
	
	public void proceedbutton()
	{
		proceedbutton.click();
	}
	
	public void passwordfield(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void proceedbutton1()
	{
		proceed1.click();
	}
	
	public void clickdone()
	{
		done.click();
	}

	public void getstarted()
	{
		getstarted.click();
	}



	
	
	
}
