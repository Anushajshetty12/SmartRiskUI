package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.UploadProduct;

public class Setmatching extends BaseClass {
	@Test(priority=3)
	public void setmatching() throws InterruptedException
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
	up.Catalogs();
	up.AddCatalogbutton();
	up.setmatching();
	String productname1="Test_"+randomeString();
	up.sendtitle(productname1);
	up.selectcategory("Sarees");
	up.photoshoot("Live Model Photoshoot");
	up.next();
	up.setswork("Chicken");
	up.setsfabric("Brasso");
	up.setsstyle("Anarkali");
	up.noofpcs("2");
	up.priceperpcs("500");
	up.nextbutton();
	String name1="Test1"+randomeString();
	up.designname1(name1);
	up.setcolor("blue");
	
	
	up.setdesigns("C:/Users/Catalog/Downloads/disable.png");
	Thread.sleep(8000);
	up.setdesigns("C:/Users/Catalog/Downloads/anutest.png");
	Thread.sleep(8000);
	up.setdesigns("C:/Users/Catalog/Downloads/test1.png");
	Thread.sleep(8000);
	up.setenableduration("30");
	Thread.sleep(3000);
	up.clicksetbutton();
	Thread.sleep(10000);
	System.out.println("Set matching uploaded successfully!!!!");
	
}
}