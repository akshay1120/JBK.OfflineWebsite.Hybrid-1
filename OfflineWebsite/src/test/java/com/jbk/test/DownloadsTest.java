package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadsPage;

public class DownloadsTest 
{
	WebDriver driver ;
	DownloadsPage dpg = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		dpg = new DownloadsPage(driver);
		dpg.uname.sendKeys("kiran@gmail.com");
		dpg.pass.sendKeys("123456");
		dpg.lgnBtn.click();
		dpg.downloads.click();
	}
	
	@Test (priority=1)
	public void verifyOperatingSystem_32bit()
	{
		Assert.assertTrue(dpg.operatingSystem_32bit());
	}
	
	@Test (priority=2)
	public void verifyCommon()
	{
		Assert.assertTrue(dpg.common());
	}
	
	@Test (priority=3)
	public void verifyNone()
	{
		Assert.assertTrue(dpg.none());
	}
	
	@Test (priority=4)
	public void verifyComplete_DownloadsTable() throws Exception
	{
		Assert.assertTrue(dpg.completeDownloadsTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}