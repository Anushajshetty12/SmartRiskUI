package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

/**
 * 
 * @author Anusha Shetty
 *
 */
public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	/*
	 * //creating config class object where all the generic details stored*/
	public String baseURl=readconfig.getApplicationUrl();
	public String QAURL=readconfig.getApplicationQAUrl();
	public String bliteUrl=readconfig.getbliteUrl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public static WebDriver driver;//can be used throughout this page and constant value
	public static Logger logger; //prints logger info/warning on console
	
	//@SuppressWarnings("deprecation")
	@Parameters({"browser","url"})//testng.xml has parameter metioned this access from testng.xml
	@BeforeClass
	public void Setup(String br,String url1)//testng.xml>>in paramemter class value is passes(which is br here)
	{
		logger=Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");//access to log4j.properties here
		if(br.equals("chrome"))
				{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());//get the path of the chrome driver
		 driver=new ChromeDriver();
				}
		else if(br.equals("firefox"))
				{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());//get the path of the firefox driver
			driver=new FirefoxDriver();//
				}
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//waits after opening browser and before entering url
		if(url1.equals("BASE"))
		{
		driver.get(baseURl);
		}
		else if(url1.equals("QA"))
		{
		driver.get(QAURL);
		}
		driver.manage().window().maximize();//maximizes the window based on br value
	//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();//quits the browser
	}
	
	public void captureScreen(WebDriver driver,String tname)throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;//downcasting driver,creates screenshot object
		File source=ts.getScreenshotAs(OutputType.FILE);//takes the screenshot and stored in src
		File target=new File(System.getProperty("user.dir")+ "/screenshots/" +tname  + ".png");//creating target folder for storing the screenshot
		FileUtils.copyFile(source, target);//copying the screenshot from src to target
		System.out.println("Screenshot taken");
		
		
		
	}
	public String randomeString()
	{
		
		String generatedString=RandomStringUtils.randomAlphabetic(3); //this is used for iterative testing where same name is not allowed
		return(generatedString);
	}
	public String randomenumber()
	{
		
		String generatednumber=RandomStringUtils.randomAlphanumeric(3);//this is used for iterative testing where same number is not allowed
		return(generatednumber);
	}

}
