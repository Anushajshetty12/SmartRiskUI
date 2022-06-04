package pageObjects;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Profile {
	WebDriver ldriver;
	public Profile(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "(//div[contains(@class,'exehdJ')])[1]")
	@CacheLookup
	WebElement Userdropdown;
	
	@FindBy(xpath = "//div[@class='_3vhnxf'][contains(.,'My Profile')]")
	@CacheLookup
	WebElement MyProfile;
	
	@FindBy(xpath = "//div[contains(@class,'_1ruvv2')]")
	@CacheLookup
	WebElement Username;
	
	@FindBy(xpath = "//span[@class='oKZoMV'][contains(.,'Edit')]")
	@CacheLookup
	WebElement Edit;
	
	@FindBy(xpath = "//span[@class='oKZoMV'][contains(.,'Cancel')]")
	@CacheLookup
	WebElement Cancel;
	
	@FindBy(xpath = "//input[contains(@name,'firstName')]")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(xpath = "//input[contains(@name,'lastName')]")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _3eVCfA'][contains(.,'SAVE')]")
	@CacheLookup
	WebElement Save; 
	
	@FindBy(xpath = "(//div[contains(@class,'_1XFPmK')])[1]")
	@CacheLookup
	WebElement Gender;
	
	@FindBy(xpath = "(//a[@class='_3memBI _14Me7y'][contains(.,'Edit')])[1]")
	@CacheLookup
	WebElement Edit1;
	
	@FindBy(xpath = "//a[@class='_3memBI _14Me7y'][contains(.,'Cancel')]")
	@CacheLookup
	WebElement Cancel1;
	
	@FindBy(xpath = "//input[contains(@name,'email')]")
	@CacheLookup
	WebElement EmailTxtField;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _25vsmg _1-iOO7'][contains(.,'SAVE')]")
	@CacheLookup
	WebElement SaveEmail;
		
	@FindBy(xpath = "//div[contains(@class,'_2sKwjB')]")
	@CacheLookup
	WebElement Popuptext;
		
	@FindBy(xpath = "//div[contains(@class,'_17JmIV')]")
	@CacheLookup
	WebElement OTPPopup;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1KAjNd'][contains(.,'✕')]")
	@CacheLookup
	WebElement CloseOTPPopup;
	
	@FindBy(xpath = "//a[@class='_14Me7y'][contains(.,'Change Password')]")
	@CacheLookup
	WebElement ChangePwd;
	
	@FindBy(xpath = "//input[contains(@name,'oldPassword')]")
	@CacheLookup
	WebElement OldPwd;
	
	@FindBy(xpath = "//input[contains(@name,'newPassword')]")
	@CacheLookup
	WebElement NewPwd;
	
	@FindBy(xpath = "//input[contains(@name,'retypePassword')]")
	@CacheLookup
	WebElement Retypepwd;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2UAxOt'][contains(.,'Change Password')]")
	@CacheLookup
	WebElement ChangePwdBtn;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1KAjNd'][contains(.,'✕')]")
	@CacheLookup
	WebElement CloseChangePwdpopup;
	
	@FindBy(xpath = "//a[@class='_3G5-f6 _14Me7y'][contains(.,'Resend OTP')]")
	@CacheLookup
	WebElement ResendOtp;
	
	@FindBy(xpath = "//div[contains(@class,'col-5-12')]")
	@CacheLookup
	WebElement Changepwdpopup;
	
	
	
	
public void navigateMyProfile()
	{
	ldriver.navigate().refresh();
	Actions action = new Actions(ldriver);
	action.moveToElement(Userdropdown).perform();
	MyProfile.click();
	}
public void updateProfile(String random1,String random2) throws InterruptedException
{
	Edit.click();
	Cancel.click();
	Edit.click();
	FirstName.clear();
	FirstName.sendKeys(random1);
	LastName.clear();
	LastName.sendKeys(random2);
	Gender.click();
	Save.click();
	if(Popuptext.isDisplayed())
	{
		Assert.assertTrue(true);
	}
	String a=random1+" "+random2;
	Thread.sleep(2000);
	String b=Username.getText();
	System.out.println(a+" "+b);
	Assert.assertEquals(a,b);
	}

	

public void gender()
{
	if(Gender.isSelected())
	{
Assert.assertTrue(true);	

}
	}




public void validategmail(String email,String oldpwd,String newpwd,String retypepwd) throws InterruptedException
{

	Edit1.click();
	Cancel1.click();
	Edit1.click();
	EmailTxtField.sendKeys(email);
	SaveEmail.click();
	@SuppressWarnings("deprecation")
	WebDriverWait wait=new WebDriverWait(ldriver,20);
	wait.until(ExpectedConditions.visibilityOf(Popuptext));
		CloseOTPPopup.click();
	Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(ChangePwd));
		ChangePwd.click();
		//ldriver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			//ldriver.navigate().refresh();
				try {
					wait.until(ExpectedConditions.elementToBeClickable(OldPwd));
					OldPwd.sendKeys(oldpwd);
					//ldriver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
					    while(!OldPwd.getAttribute("value").equals(oldpwd)) {
					    	wait.until(ExpectedConditions.attributeContains(OldPwd, "value", oldpwd));
					    }
					    wait.until(ExpectedConditions.elementToBeClickable(NewPwd));
					    NewPwd.sendKeys(newpwd);
					    ldriver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
					    while(!NewPwd.getAttribute("value").equals(newpwd)) {
					    	wait.until(ExpectedConditions.attributeContains(NewPwd, "value", newpwd));
					    }
					    
					    	wait.until(ExpectedConditions.elementToBeClickable(Retypepwd));
					Retypepwd.sendKeys(retypepwd);
					ldriver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
					  while(!Retypepwd.getAttribute("value").equals(retypepwd)) {
					    	wait.until(ExpectedConditions.attributeContains(Retypepwd, "value", retypepwd));
					  }
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		wait.until(ExpectedConditions.elementToBeClickable(ChangePwdBtn));
		ChangePwdBtn.click();
	CloseChangePwdpopup.click();

	}


}
