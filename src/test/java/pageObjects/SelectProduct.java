package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
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


public SelectProduct(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}


@FindBy(xpath = "(//img[contains(@class,'_396cs4 _3exPp9')])[1]")
  @CacheLookup
  WebElement ProductCatalog;
 

@FindBy(xpath = "(//img[contains(@class,'_396cs4 _3exPp9')])[1]")
@CacheLookup
WebElement Product ;

@FindBy(xpath = "//path[contains(@class,'eX72wL')]")
@CacheLookup
WebElement WishList ;

public void selectProduct() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)ldriver;
	// Scrolling down the page till the element is found		
	/* js.executeScript("arguments[0].scrollIntoView();", ProductCatalog); */
    js.executeScript("window.scrollBy(0,1000)", "");
	 Thread.sleep(2000); 
    WebDriverWait wait=new WebDriverWait(ldriver,200);
	wait.until(ExpectedConditions.visibilityOf(ProductCatalog));
	ProductCatalog.click();
	/* Thread.sleep(5000); */
	  Product.click();
	 }





}
