package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Border {
	
		WebDriver ldriver;
		
		public Border(WebDriver rdriver)
		{
			ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath = "//div[@dir='auto'][contains(.,'Search for Brands, Seller, Work and more')]")
		@CacheLookup
		WebElement homesearchbar;
		
		@FindBy(xpath = "//input[contains(@placeholder,'Search by brand, fabric, work, style')]")
		@CacheLookup
		WebElement searchinput;
		
		@FindBy(xpath = "//img[@src='http://b2b.wishbook.io/media/catalog_image/catsingle114.jpg']")
		@CacheLookup
		WebElement image;
		
		@FindBy(xpath = "//div[contains(@aria-label,'ProductDetailScreenAddOrGoToCartButton')]")
		@CacheLookup
		WebElement cart;
		
		@FindBy(xpath = "(//div[@type='MaterialCommunityIcons'][contains(.,'')])[2]")
		@CacheLookup
		WebElement carticon;
		
		@FindBy(xpath = "//div[@dir='auto'][contains(.,'PLACE ORDER')]")
		@CacheLookup
		WebElement placeorder;
		
	/*	@FindBy(xpath = "//div[contains(@class,'rn-1oszu61 rn-cijmth rn-qpmf2f rn-rull8r rn-ndvcnb rn-mm0ijv rn-gxnn5r rn-14skgim rn-fnigne rn-dfv94e rn-1efd50x rn-13yce4e rn-deolkf rn-6koalj rn-1mlwlqe rn-eqz5dr rn-1qe8dj5 rn-p1pxzi rn-11wrixw rn-61z16t rn-1mnahxq rn-ifefl9 rn-bcqeeo rn-1mdbw0j rn-gy4na3 rn-9aemit rn-wk8lta rn-bnwqim rn-1lgpqti')]")
		@CacheLookup
		WebElement selectaddress;
		
		@FindBy(xpath = "(//div[contains(@class,'rn-1awozwy rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-1p0dtai rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1777fci rn-1d2f490 rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-u8s1d rn-zchlnj rn-ipm5af rn-1lgpqti')])[3]")
		@CacheLookup
		WebElement wbcredit;
		
		@FindBy(xpath = "//div[@aria-label='MyCartPlaceOrderButton']")
		@CacheLookup
		WebElement done;*/
		
		public void search()
		{
			homesearchbar.click();
		}
		
		public void searchinput(String product)
		{
			searchinput.sendKeys(product);
			searchinput.sendKeys(Keys.ENTER);
		}
		
		public void clickimage()
		{
			image.click();;
		}
		
		public void cart()
		{
			cart.click();;
		}
		
		public void carticon()
		{
			carticon.click();;
		}
		
		public void placeorder()
		{
			placeorder.click();;
		}
		
	/*	public void selectaddress()
		{
			selectaddress.click();;
		}
		
		public void wbcredit()
		{
			wbcredit.click();;
		}
		
		public void done()
		{
			done.click();;
		}*/
		
		
		

}
