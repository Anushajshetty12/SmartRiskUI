package testCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Profile;
import pageObjects.UserLogin;
  
/**
 * this class verifies the profile page functionality
 * @author anusshet
 *
 */



public class TC_Profile extends BaseClass
{

	
	  @Test(priority=0) 
	  public void navigatetoprofilepage() throws InterruptedException 
	  { 
		  String s="Abc"+randomeString();
	  String q="Abc"+randomeString(); 
	  UserLogin u=new UserLogin(BaseClass.driver);
	  u.userlogin(username, password);
	  Profile p=new Profile(BaseClass.driver);
	  p.selectDropdown();
	  p.navigateToMyProfile();
	  p.updateProfile(s, q);
	  
	  }
	 
	@Test(priority=1)
	public void gendervalidation() throws InterruptedException
	{
		 Profile p=new Profile(driver);
				p.gender();
	}
			
	@Test(priority=2)
	public void emailvalidation() throws InterruptedException
	{
			
				String a=randomeString()+"@gmail.com";
				String b=randomeString();
				String c=randomeString();
				String d=c;
				Profile p=new Profile(BaseClass.driver);
				p.validategmail(a,b,c,d);
	}
	
@Test(priority=3)
public void superCoinZoneValidation() throws InterruptedException
{
	 Profile p=new Profile(BaseClass.driver);
	p.selectDropdown();
	p.navigateToSuperCoinZone();
}
			
	
}
