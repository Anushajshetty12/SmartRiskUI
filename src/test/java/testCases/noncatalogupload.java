package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.UploadProduct;

public class noncatalogupload extends BaseClass
{
	@Test(priority=2)
public void uploadnoncatalog() throws InterruptedException
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
	Thread.sleep(2000);
	up.noncatalog();
	Thread.sleep(2000);
	
	
	String productname1="Test_"+randomeString();
	up.sendtitle(productname1);
	Thread.sleep(5000);
	up.selectcategory("Sarees");
	Thread.sleep(5000);
	up.photoshoot("Live Model Photoshoot");
	up.price(500);
	up.next();
	up.AddProduct();
	up.uploadimage("C:/Users/Catalog/Downloads/disable.png");
	up.work("Chicken");
	up.fabric("Brasso");
	up.style1("Anarkali");
	Thread.sleep(2000);
	up.AddProduct();
	//up.choosedesigns("C:/Users/Catalog/Downloads/disable.png");
	Thread.sleep(2000);
	up.AddProducts();
	System.out.println("Noncatalog uploaded successfully!!!!");
}
}
