package pageObjects;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OverviewMap {
	WebDriver ldriver;

	public OverviewMap(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//button[contains(.,'Sign In')]")
	@CacheLookup
	WebElement SignInBtn;

	@FindBy(id = "username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='dropdownManual']")
	@CacheLookup
	WebElement geoname;

	@FindBy(xpath = "//button[contains(.,'TELANGANA')]")
	@CacheLookup
	WebElement geonamedropdown;

	@FindBy(xpath = "//span[@class='touch-link font-bold ng-star-inserted']")
	@CacheLookup
	
	WebElement linktext;
	
	
	@FindBy(xpath = "(//div[@class='sub-heading'])[1]")
	@CacheLookup
	WebElement mostcultivatedcrop;
	
	
	@FindBy(xpath = "//canvas[@class='chartjs-render-monitor']")
	@CacheLookup
	WebElement  doghnutchart;
	
	@FindBy(xpath = "(//div[@class='sub-heading'])[1]")
	@CacheLookup
	WebElement MostCultivatedCrop;
	
	@FindBy(xpath = "(//div[@class='sub-heading'])[2]")
	@CacheLookup
	WebElement HighestAvgyield;
	
	@FindBy(xpath = "(//div[@class='main-heading'])[1]")
	@CacheLookup
	WebElement MostCultivatedCropValue;
	
	@FindBy(xpath = "(//div[@class='main-heading'])[2]")
	@CacheLookup
	WebElement HighestAvgyieldValue;
	
	@FindBy(xpath = "(//div[@class='area-heading'])[1]")
	@CacheLookup
	WebElement Area;
	
	@FindBy(xpath = "(//div[@class='area-heading'])[3]")
	@CacheLookup
	WebElement NetSownArea;
	
	
	
	@FindBy(xpath = "//span[contains(.,'view dashboard')]")
	@CacheLookup
	WebElement ViewDashboard;
	
	
	
	
	
	

	public void entergeoname(String geoname1) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 200);
		Thread.sleep(5000);

		//wait.until(ExpectedConditions.visibilityOf(geoname));
		geoname.clear();
		geoname.sendKeys(geoname1);
		Thread.sleep(5000);
		geonamedropdown.click();
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(geonamedropdown));
		 * wait.until(ExpectedConditions.elementToBeClickable(geonamedropdown));
		 * wait.until(ExpectedConditions.visibilityOf(linktext));
		 */
		Thread.sleep(10000);
		System.out.println(linktext.getText());
		Assert.assertEquals(linktext.getText(),"- Telangana", "Not found" );
	}
		
		
	public void verifyelements()
	{
		System.out.println(MostCultivatedCrop.getText());
		System.out.println(HighestAvgyield.getText());
		System.out.println(MostCultivatedCropValue.getText());
		System.out.println(HighestAvgyieldValue.getText());
		System.out.println(Area.getText());
		Assert.assertEquals(MostCultivatedCrop.getText(),"Most cultivated crop", "Not found" );
		Assert.assertEquals(HighestAvgyield.getText(),"Highest average yield", "Not found" );
		Assert.assertEquals(Area.getText(),"AREA", "Not found" );
		Assert.assertEquals(NetSownArea.getText(),"Net Sown Area (%)", "Not found" );
		
		if(doghnutchart.isDisplayed()&&ViewDashboard.isDisplayed())
		{
			System.out.println("doughnut chart and View Dashboard buttons are displaying");
		}
		else
			 
		{
			System.out.println("doghnutchart or View Dashboard button is not displaying");
		}
		
		ViewDashboard.click();
		
		}
	
	
	

	

}
