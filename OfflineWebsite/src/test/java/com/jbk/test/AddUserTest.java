package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;

public class AddUserTest 
{
	WebDriver driver ;
	AddUserPage ap = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		ap = new AddUserPage(driver);
		ap.uname.sendKeys("kiran@gmail.com");
		ap.pass.sendKeys("123456");
		ap.lgnBtn.click();
		ap.users.click();
		ap.addUser.click();
	}
	
	@Test (priority=1)
	public void verifyPrintingDragDownOptions()
	{
		Assert.assertTrue(ap.printingDragDownOptions());
	}
	
	@Test (priority=2)
	public void verifyprintingDragDownOptExcel() throws Exception
	{
		Assert.assertTrue(ap.printingDragDownOptExcel());
	}
	
	@Test (priority=3)
	public void verifyValidAddUser() throws Exception
	{
		Assert.assertTrue(ap.validAddUser());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
