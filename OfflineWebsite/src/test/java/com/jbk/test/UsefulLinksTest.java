package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.UsefulLinksPage;

public class UsefulLinksTest 
{
	WebDriver driver ;
	UsefulLinksPage ulp = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		ulp = new UsefulLinksPage(driver);
		ulp.uname.sendKeys("kiran@gmail.com");
		ulp.pass.sendKeys("123456");
		ulp.lgnBtn.click();
		ulp.usefulLinks.click();
	}
	
	@Test (priority=1)
	public void verifyClickGO() throws Exception
	{
		Assert.assertTrue(ulp.clickGO());
	}
	
	@Test (priority=2)
	public void verifyClickGoExcel() throws Exception
	{
		Assert.assertTrue(ulp.clickGoExcel());
	}
	
	@Test (priority=3)
	public void verifyComplete_UsefulLinksTable() throws Exception
	{
		Assert.assertTrue(ulp.complete_UsefulLinksTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
	
}
