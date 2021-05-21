package com.jbk.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jbk.pages.LoginPage;
import com.utility.WaitUtility;

public class TestBase  
{
	public static WebDriver driver ;
	public static Properties prop ;
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public WebDriver initialization() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Offline%20Website/index.html");
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Offline%20Website/index.html");
		}
		
		WaitUtility.implicitWait(10);
		WaitUtility.waitForPageLoad(10);
		return driver;
	}
	
	public LoginPage navigateToLoginPg()
	{
		LoginPage lp = new LoginPage(driver);
		return lp ;
	}
}
