package pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProduct
{
WebDriver ldriver;
public static Logger logger;

public SelectProduct(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	logger=Logger.getLogger("SelectProduct");
	PropertyConfigurator.configure("Log4j.properties");
}


@FindBy(xpath = "//input[contains(@title,'Search for products, brands and more')]")
 WebElement SearchProduct;
 
@FindBy(xpath = "//a[@class='_3izBDY'][contains(.,'vivo mobilesin Mobiles')]")
@CacheLookup
WebElement SearchResult;

@FindBy(xpath = "(//div[contains(@class,'_4rR01T')])")
List<WebElement> SelectProduct ;

public void selectProduct(String productName) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(ldriver,50);
	wait.until(ExpectedConditions.visibilityOf(SearchProduct));
	SearchProduct.sendKeys(productName,Keys.ENTER);
	logger.info("selected the product");
	Thread.sleep(2000);
	for(int i=0;i<SelectProduct.size();i++)
	{
	SelectProduct.get(i).click();
	break;
	}
	}
}
