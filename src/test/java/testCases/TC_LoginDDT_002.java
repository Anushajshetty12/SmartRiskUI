package testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	/*
	 * @Test(dataProvider="LoginData") public void loginDDT(String user,String pwd)
	 * throws InterruptedException { LoginPage lp=new LoginPage(driver);
	 * lp.clearMobileNumber(); lp.clearPassword(); lp.ClickSignInBTn();
	 * lp.SetUserName(user); logger.info("user name provided"); lp.SetPassword(pwd);
	 * logger.info("password provided"); lp.ClickButton();
	 */
	}
		
		
		
		
	
		
	/*       if(isAlertPresent()==true) 
	    	   
	       {
	    	   driver.switchTo().alert().accept();
	    	   driver.switchTo().defaultContent();
	    	   Assert.assertTrue(false);
	    	   logger.warn("login failed");
	       }
	       else
	       {
	    	   
	    	   Assert.assertTrue(true);
	    	   logger.info("login passed");
	    	   lp.slidebar();
	    	   lp.clickLogout();
	    	   Thread.sleep(2000);
	    	   
	       }
	}
	    	   
	    	   
	    	public  boolean isAlertPresent()
	    	   {
	    		try
	    		{
	    		driver.switchTo().alert();
	    	   return true;
	    		}
	    		catch(NoAlertPresentException e)
	    		{
	    			return false;
	    		}
	 
	    	   }*/

	/*
	 * @DataProvider(name="LoginData") String[][] getData() throws IOException {
	 * String
	 * path=System.getProperty("user.dir")+"/src/test/java/testData/Logindata.xlsx";
	 * int rownum=XLUtils.getRowCount(path,"Sheet1"); int
	 * colcount=XLUtils.getCellCount(path,"Sheet1",1); String logindata[][]=new
	 * String[rownum][colcount]; for(int i=1;i<=rownum;i++) { for(int
	 * j=0;j<colcount;j++) { logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,
	 * j);//1,0 } }
	 * 
	 * return logindata; } }
	 */