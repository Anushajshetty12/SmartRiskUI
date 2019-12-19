package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewDashboard {
	WebDriver ldriver;
	
	public OverviewDashboard(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//div[contains(.,'Dashboard')])[4]")
	@CacheLookup
	WebElement Dashboardbtn;
	
	public void Overview_Dashboard()
	{
		Dashboardbtn.click();
		
	}
	   

}

