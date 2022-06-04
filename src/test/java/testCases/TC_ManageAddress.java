package testCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.ManageAddress;
import pageObjects.Profile;
import pageObjects.UserLogin;

public class TC_ManageAddress extends BaseClass
{
	 String addr1="";
	 @Test(priority=4) 
	  public void readData() throws InterruptedException, IOException 
	  { 
		
		 File f=new File("./address.txt");
		    BufferedReader br= new BufferedReader(new FileReader(f));
			try {
			while((addr1=br.readLine())!=null)
			
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	  }
	 @Test(priority=5) 
	 public void manageAddress() throws InterruptedException
	 {
	 UserLogin u=new UserLogin(BaseClass.driver);
	  u.userlogin(username, password);
	  Profile p=new Profile(BaseClass.driver);
	  p.navigateMyProfile();
	  ManageAddress q=new ManageAddress(BaseClass.driver);
	  q.manageAddress("anu", "7676894256", "576219", "abc");
		System.out.println(addr1);
	  q.manageAddress1(addr1);
	  }
}
