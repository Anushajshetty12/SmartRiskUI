package pageObjects;





import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.Select;


public class UploadProduct {
	WebDriver ldriver; 
	
public UploadProduct(WebDriver rdriver)
	{
		ldriver=rdriver;
	PageFactory.initElements(ldriver,this);//initializes elements mentioned in this page inside upload constructor
	}

@FindBy(xpath="/html/body/div[3]/aside[1]/div/nav/ul/li[5]/a/span")
@CacheLookup
WebElement UploadProducts;

@FindBy(xpath="/html/body/div[3]/aside[1]/div/nav/ul/li[5]/ul/li[2]/a/span")
@CacheLookup
WebElement Catalogs;


@FindBy(xpath="//*[@id=\"catalogs-datatables_wrapper\"]/div[1]/a[5]/span")
@CacheLookup
WebElement AddCatalogbutton;

@FindBy(xpath = "(//span[@class='fa fa-circle'])[2]")
@CacheLookup
WebElement noncatalogradiobtn;


@FindBy(xpath = "(//span[contains(@class,'fa fa-circle')])[3]")
@CacheLookup
WebElement setradiobtn;

@FindBy(name="title")
@CacheLookup
WebElement title;


@FindBy(xpath = "//a[@class='chosen-single'][contains(.,'Select Brand')]")
@CacheLookup	
WebElement brand;


@FindBy(xpath = "(//input[contains(@type,'text')])[14]")
@CacheLookup	
WebElement brandsearch;


@FindBy(xpath = "//a[@class='chosen-single'][contains(.,'Select Category')]")
@CacheLookup
WebElement category;

@FindBy(xpath = "(//input[contains(@type,'text')])[15]")
@CacheLookup	
WebElement categorysearch;

@FindBy(xpath = "//a[@class='chosen-single'][contains(.,'Select Photoshoot type')]")
@CacheLookup
WebElement photoshoot;

@FindBy(xpath = "(//input[contains(@type,'text')])[16]")
@CacheLookup
WebElement photoshootsearch;






@FindBy(name="price")
@CacheLookup
WebElement price;

@FindBy(xpath="//*[@id=\"step1\"]/ul/li/a")
@CacheLookup
WebElement next;

@FindBy(id = "thumbnail")
@CacheLookup
WebElement uploadimage;

@FindBy(xpath = "//input[contains(@placeholder,'Select work')]")
@CacheLookup   
WebElement work;  

@FindBy(xpath = "//input[contains(@data-parsley-id,'45')]")
@CacheLookup   
WebElement work1;

@FindBy(xpath = "(//input[@spellcheck='false'])[2]")
@CacheLookup
WebElement fabric;

@FindBy(xpath = "//input[contains(@data-parsley-id,'47')]")
@CacheLookup
WebElement fabric1;

@FindBy(xpath = "//a[contains(.,'Select style')]")
@CacheLookup
WebElement style;



@FindBy(xpath = "(//input[contains(@type,'text')])[17]")
@CacheLookup
WebElement catstylesearch;

@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
@CacheLookup
WebElement noncatstylesearch;

@FindBy(xpath = "//input[contains(@placeholder,'Select work')]")
@CacheLookup
WebElement setwork;


@FindBy(xpath = "//input[contains(@placeholder,'Select fabric')]")
@CacheLookup
WebElement setfabric;

@FindBy(xpath = "//a[@class='chosen-single'][contains(.,'Select style')]")
@CacheLookup
WebElement setstyle;

@FindBy(xpath = "(//input[contains(@type,'text')])[17]")
@CacheLookup
WebElement setstylesearch;



@FindBy(name="no_of_pcs_per_design")
@CacheLookup
WebElement noofpcs;


@FindBy(name="price_per_design")
@CacheLookup
WebElement priceperdesign;


@FindBy(className="nextbutton")
@CacheLookup
WebElement nextbtn;

@FindBy(xpath = "//input[contains(@ng-model,'set.title')]")
@CacheLookup
WebElement designname;

@FindBy(xpath = "//input[contains(@name,'color')]")
@CacheLookup
WebElement color;


@FindBy(xpath = "//input[contains(@ngf-select,'uploadSetFiles($files,$index)')]")
@CacheLookup
WebElement selectdesigns;

@FindBy(name="enable_duration")
@CacheLookup
WebElement enableduartion;

@FindBy(xpath = "//button[@type='submit'][contains(.,'Upload Set Matching')]")
@CacheLookup
WebElement setbutton;



@FindBy(xpath = "//button[@type='submit'][contains(.,'Add Product')]")
@CacheLookup
WebElement  AddProduct;

@FindBy(xpath="//*[@id=\"step3\"]/form/div[3]/div/div/input")
@CacheLookup
WebElement  choosedesigns;


@FindBy(xpath = "//button[@type='submit'][contains(.,'Add Designs')]")
@CacheLookup
WebElement  AddProducts;

@FindBy(xpath = "//span[@class='ng-binding'][contains(.,'My Products')]")
@CacheLookup
WebElement  myproducts;








public void uploadProducts()
{
	WebDriverWait wait = new WebDriverWait(ldriver,30);
    UploadProducts  = wait.until(ExpectedConditions.elementToBeClickable(UploadProducts));
	UploadProducts.click();
}

public void Catalogs()
{
		Catalogs.click();
}




public void AddCatalogbutton()
{
	WebDriverWait wait = new WebDriverWait(ldriver,30);
	AddCatalogbutton  = wait.until(ExpectedConditions.elementToBeClickable(AddCatalogbutton));
	
	AddCatalogbutton.click();
}

public void noncatalog()
{
	//WebDriverWait wait = new WebDriverWait(ldriver,30);
	//noncatalogradiobtn  = wait.until(ExpectedConditions.elementToBeClickable(noncatalogradiobtn));
	noncatalogradiobtn.click();
}

public void setmatching()
{
	
	setradiobtn.click();
}

public void sendtitle(String productname)
{
	
	
title.sendKeys(productname);
//System.out.println(title.getText());
}


public void selectBrandName(String brandname) 
{
	WebDriverWait wait = new WebDriverWait(ldriver,30);
	brand  = wait.until(ExpectedConditions.elementToBeClickable(brand));
	brand.click();
	brandsearch.sendKeys(brandname);
	brandsearch.sendKeys(Keys.ENTER);
	
	
}

public void selectcategory(String categoryname)
{
	//WebDriverWait wait = new WebDriverWait(ldriver,10);
	//category  = wait.until(ExpectedConditions.elementToBeClickable(category));
	category.click();
	categorysearch.sendKeys(categoryname);
	categorysearch.sendKeys(Keys.ENTER);
	
	
}
 
public void photoshoot(String photoshootname)
{
	
	photoshoot.click();
	photoshootsearch.sendKeys(photoshootname);
	photoshootsearch.sendKeys(Keys.ENTER);
}






public void price(int priceofcatalog)
{
	
	
	price.sendKeys(String.valueOf(priceofcatalog));
	
}

public void next()
{
	
	next.click();
	
}


public void uploadimage(String path)
{
	

	uploadimage.sendKeys(path);
	
}
public void work(String work1)
{
	
	
	work.sendKeys(work1);
	work.sendKeys(Keys.ENTER);
}


public void fabric(String fabric1)
{

	fabric.sendKeys(fabric1);
	fabric.sendKeys(Keys.ENTER);

	
}


public void works(String work2)
{
	
	
	work1.sendKeys(work2);
	work1.sendKeys(Keys.ENTER);
}


public void fabrics(String fabric2)
{

	fabric1.sendKeys(fabric2);
	fabric1.sendKeys(Keys.ENTER);

	
}
public void style(String style1)
{
		style.click();
		catstylesearch.sendKeys(style1);
	catstylesearch.sendKeys(Keys.ENTER);
	
}
public void style1(String style2)
{
		style.click();
		noncatstylesearch.sendKeys(style2);
	noncatstylesearch.sendKeys(Keys.ENTER);
	
}

public void noofpcs(String numberofpcs)
{
	
	noofpcs.sendKeys(numberofpcs);
	
}

public void setswork(String work2)
{
	
	
	setwork.sendKeys(work2);
	setwork.sendKeys(Keys.ENTER);
}
public void setsfabric(String fabric2)
{
	
	
	setfabric.sendKeys(fabric2);
	setfabric.sendKeys(Keys.ENTER);
}
public void setsstyle(String setstyles)
{
	
	setstyle.click();
	setstylesearch.sendKeys(setstyles);
setstylesearch.sendKeys(Keys.ENTER);
	
}
public void priceperpcs(String pricepcs)
{
	
	priceperdesign.sendKeys(pricepcs);
	
}

public void nextbutton()
{
	
	nextbtn.click();
}

public void designname1(String name)
{
		designname.sendKeys(name);
}

public void setcolor(String color1)
{
	WebDriverWait wait = new WebDriverWait(ldriver, 10);
	color = wait.until(ExpectedConditions.elementToBeClickable(color));
	color.sendKeys(color1);
}

public void setdesigns(String path1)
{
	
	selectdesigns.sendKeys(path1);
}

public void setenableduration(String duration)
{
	
	enableduartion.sendKeys(duration);
}

public void clicksetbutton()
{
		setbutton.click();
}

public void AddProduct()
{
	
	AddProduct.click();

	
}

public void choosedesigns(String path)
{
	

	choosedesigns.sendKeys(path);
	
	

	
}

public void AddProducts()
{
	
	AddProducts.click();

}

public void myProduct()
{
	
	myproducts.click();

}




}







