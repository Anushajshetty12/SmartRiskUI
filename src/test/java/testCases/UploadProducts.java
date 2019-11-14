package testCases;







import java.io.IOException;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.UploadProduct;

public class UploadProducts extends BaseClass
{
	
	
	
	@Test(priority=1)
	
	public void uploadProducts() throws InterruptedException, IOException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		Thread.sleep(2000);
		lp.SetPassword(password);
		Thread.sleep(2000);
		
		lp.ClickButton();
		Thread.sleep(2000);
		
	
		
				
		
	UploadProduct up=new UploadProduct(driver);
	up.uploadProducts();
	//Thread.sleep(2000);
	up.Catalogs();
	Thread.sleep(2000);
	up.AddCatalogbutton();
	//Thread.sleep(2000);
	String productname="Test_"+randomeString();
	up.sendtitle(productname);
	//Thread.sleep(5000);
	up.selectBrandName("5@Ree5");
	//Thread.sleep(5000);
	up.selectcategory("Sarees");
	//Thread.sleep(2000);
	up.price(500);
	//Thread.sleep(2000);
	up.next();
	//Thread.sleep(2000);
	Thread.sleep(2000);
	up.uploadimage("C:/Users/Catalog/Downloads/disable.png");
	//Thread.sleep(2000);
	up.work("Chicken");
	//Thread.sleep(2000);
	up.fabric("Brasso");   
	//Thread.sleep(2000);
	up.style("Anarkali");
	//Thread.sleep(2000);
	up.AddProduct();
	Thread.sleep(5000);
	up.choosedesigns("C:/Users/Catalog/Downloads/disable.png");
	Thread.sleep(5000);
	up.choosedesigns("C:/Users/Catalog/Downloads/anutest.png");
	Thread.sleep(5000);
	up.choosedesigns("C:/Users/Catalog/Downloads/test1.png");
	
	Thread.sleep(8000);
	up.AddProducts();
	Thread.sleep(8000);
	up.myProduct();
	up.Catalogs();
	Thread.sleep(8000);	
	
	List<WebElement> elements = driver.findElements(By.className("ng-scope"));  
    System.out.println("Number of drop downs on the page: " + elements.size());
   
    
     
	if(driver.getPageSource().contains(productname))
	{

		Assert.assertTrue(true);
		logger.info("upload passed");
		
		
		
	}
	

	
	else
	{
		
			captureScreen(driver,"upload");
		
		Assert.assertTrue(false);
		logger.info("upload failed");
		
	}
	

	
	
	
	

	
	}


	

}
