package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	public ReadConfig() 
	{
		File src=new File("./configurations/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getApplicationUrl()
	{
		String url=pro.getProperty("baseURl");
		return url;
	
	}
	public String getbliteUrl()
	{
		String url=pro.getProperty("bliteUrl");
		return url;
	
	}
	public String getusername()
	{
		String uname=pro.getProperty("username");
		return uname;
	
	}
	public String getpassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	
	}

	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	
	}
}
