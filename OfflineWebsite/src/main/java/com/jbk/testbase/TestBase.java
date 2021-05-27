package com.jbk.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestBase 
{
	public static WebDriver driver ;
	public static Properties prop ;
	public static Logger logger ;
	
	// Metthod to create log4j file for pages ..
	
	public Logger logT()
	{
		logger = Logger.getLogger(this.getClass());
		String path = (System.getProperty("user.dir") + "/src/main/resources/log4jTest.properties");
		PropertyConfigurator.configure(path);
		return logger ;
	}
	
	// Metthod to create log4j file for tests ..
	
	public Logger logP()
	{
		logger = Logger.getLogger(this.getClass());
		String path = (System.getProperty("user.dir") + "/src/main/resources/log4jPage.properties");
		PropertyConfigurator.configure(path);
		return logger ;
	}
	
	// Metthod to initialize the driver ..
	
	public WebDriver initialization() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			
			logT().info("Opening the browser");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			logT().info("Inserting the Url");
			driver.get(prop.getProperty("url"));
		}
		
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			
			logT().info("Opening the browser");
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			logT().info("Inserting the Url");
			driver.get(prop.getProperty("url"));
		}
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	// Navigate to LoginPage..
	
	/*public LoginPage navigateToLoginPg()
	{
		LoginPage lp = new LoginPage(driver);
		return lp ;
	}*/
	
	// Extent Report..
	
	 public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest testLog;
	 
	 @BeforeSuite
	 public void setExtent() 
	 {
		  htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/MyReport.html");
		  
		  htmlReporter.config().setDocumentTitle("JBK");
		  htmlReporter.config().setReportName("JBK Offline Website");
		  htmlReporter.config().setTheme(Theme.STANDARD);
		  
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  
		  extent.setSystemInfo("ProjectName", "Offline Website");
		  extent.setSystemInfo("Tester", "Akshay Jain");
		  extent.setSystemInfo("OS", "Win10");
		  extent.setSystemInfo("Browser", "Chrome");
	 }
	 
	 @AfterSuite
	 public void endReport() {
	  extent.flush();
	 }
	 
	 @AfterMethod
	 public void tearDown(ITestResult result) throws IOException 
	 {
		  if(result.getStatus()==ITestResult.FAILURE) 
		  {
			  testLog.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			  testLog.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			   
			   String pathString=TestBase.screenShot(driver, result.getName());
			   testLog.addScreenCaptureFromPath(pathString);
		  } 
		  else if(result.getStatus()==ITestResult.SKIP) 
		  {
			  testLog.log(Status.SKIP, "Skipped Test case is: "+result.getName());
		  } 
		  else if(result.getStatus()==ITestResult.SUCCESS) 
		  {
			  testLog.log(Status.PASS, "Pass Test case is: "+result.getName());
		  }
	 } 
	 
	 // Method to capture ScreenShot..
	 
	 public static String screenShot(WebDriver driver,String filename) 
	 {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
		  File finalDestination= new File(destination);
		  try 
		  {
		   FileUtils.copyFile(source, finalDestination);
		  } 
		  catch (Exception e) 
		  {
		   e.getMessage();
		  }
	  return destination;
	 }
}
	
	
	
	
	

