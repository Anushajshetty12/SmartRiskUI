package pageObjects;

 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage
{
WebDriver ldriver;
public LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
PageFactory.initElements(rdriver,this);
}

@FindBy(xpath = "//button[contains(.,'Sign In')]")
@CacheLookup
WebElement SignInBtn;

@FindBy(id="username")
@CacheLookup
WebElement txtUserName;

@FindBy(id="password")
@CacheLookup
WebElement txtPassword;

@FindBy(id="kc-login")
@CacheLookup
WebElement txtbtnLogin;

@FindBy(xpath="/html/body/div[3]/header/nav/div[2]/ul[2]/li[3]")
@CacheLookup
WebElement txtslidebar;

@FindBy(xpath="/html/body/div[3]/aside[2]/nav/div/div/div/div/ul/li[6]/a")
@CacheLookup
WebElement txtbtnLogout;

@FindBy(xpath = "//button[contains(.,'✕')]")
@CacheLookup
WebElement CloseButton;




public void login()
{
	CloseButton.click();
}



/*
 * public void ClickSignInBTn() { SignInBtn.click(); }
 * 
 * public void SetUserName(String uname) { txtUserName.sendKeys(uname); }
 * 
 * public void SetPassword(String pwd) {
 * 
 * txtPassword.sendKeys(pwd); }
 * 
 * public void ClickButton() {
 * 
 * txtbtnLogin.click();
 * 
 * }
 * 
 * public void slidebar() { txtslidebar.click(); }
 * 
 * 
 * public void clickLogout() { txtbtnLogout.click(); }
 * 
 * public void clearMobileNumber() { txtUserName.clear(); }
 * 
 * public void clearPassword() { txtPassword.clear(); }
 */
	
	
}
