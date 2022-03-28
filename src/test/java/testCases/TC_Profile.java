package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Profile;
import pageObjects.UserLogin;




public class TC_Profile extends BaseClass
{

	
	  @Test(priority=0) 
	  public void navigatetoprofilepage() throws InterruptedException 
	  { 
		  String s="Abc"+randomeString();
	  String q="Abc"+randomeString(); 
	  UserLogin u=new UserLogin(driver);
	  u.userlogin(username, password);
	  Profile p=new Profile(driver);
	  p.givename(s,q); 
	  
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
				Profile p=new Profile(driver);
				String a=randomeString()+"@gmail.com";
				String b=randomeString();
				String c=randomeString();
				String d=c;
				p.validategmail(a,b,c,d);
	}
		
			
	
}
