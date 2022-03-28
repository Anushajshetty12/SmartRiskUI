package testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test(priority = 0)
public void login()
{
		LoginPage login=new LoginPage(driver);
		login.login();
		
				
}
	/*public void LoginTest() throws IOException, InterruptedException {

		driver.get(baseURl);
		logger.info("url is opened");

		LoginPage lp = new LoginPage(driver);
		lp.ClickSignInBTn();
		lp.SetUserName(username);
		logger.info("username is entered");

		lp.SetPassword(password);
		logger.info("password is entered");

		lp.ClickButton();
		System.out.println("Login Successfull!!");

		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='project-name']"))));

		System.out.println(driver.getTitle());

		if (driver.getTitle().equals("Maps")) {
			Assert.assertTrue(true);
			logger.info("testlogin passed");

		} else {

			captureScreen(driver, "LoginTest");

			Assert.assertTrue(false);
			logger.info("testlogin failed");
			
			


		}

	}*/

}
