package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {
	public static WebDriver ldriver;
	public UserLogin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//input[contains(@class,'_2IX_2- VJZDxU')]")
	@CacheLookup
	WebElement MobileEmail;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL'][contains(.,'Login')]")
	@CacheLookup
	WebElement Login;
	
	
	public void userlogin(String uname,String pwd)
	{
		MobileEmail.sendKeys(uname);
		Password.sendKeys(pwd);
		Login.click();
		System.out.println(ldriver.getTitle());
		ldriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	
	

}
