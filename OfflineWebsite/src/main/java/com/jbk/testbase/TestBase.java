package com.jbk.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jbk.pages.LoginPage;

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
			driver.get(prop.getProperty("url"));
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public LoginPage navigateToLoginPg()
	{
		LoginPage lp = new LoginPage(driver);
		return lp ;
	}
}
