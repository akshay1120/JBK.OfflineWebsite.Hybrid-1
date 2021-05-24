package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.jbk.testbase.TestBase;

public class ExtentReportUtility extends TestBase
{
	 public WebDriver driver;
	 
	 public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest logger;
	 
	 @BeforeClass
	 public void setExtent() 
	 {
		  htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		  
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  
		  htmlReporter.config().setDocumentTitle("JBK Offline Website");
	 }
	 
	 @AfterSuite
	 public void endReport() 
	 {
		  extent.flush();
	 }
	 
	/* @AfterMethod
	 public void tearDown(ITestResult result) throws IOException 
	 { 
		  if(result.getStatus()==ITestResult.FAILURE) 
		  {
			  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			  String screenshotPath = ExtentReportUtility.getScreenShot(driver, result.getName());
			  logger.addScreenCaptureFromPath(screenshotPath);
		  } 
		  
		  else if(result.getStatus()==ITestResult.SKIP) 
		  {
			  logger.log(Status.SKIP, "Skipped Test case is: "+result.getName());
		  } 
		  
		  else if(result.getStatus()==ITestResult.SUCCESS) 
		  {
			  logger.log(Status.PASS, "Pass Test case is: "+result.getName());
		  }
	 } 
	 
	 public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException 
	 {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".jpg";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	 }*/
}
