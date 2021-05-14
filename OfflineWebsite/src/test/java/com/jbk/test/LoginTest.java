package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;

public class LoginTest 
{
	WebDriver driver ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		lp = new LoginPage(driver);
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		Assert.assertTrue(lp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		Assert.assertTrue(lp.title());
	}
	
	@Test (priority = 3)
	public void verifyLogo()
	{
		Assert.assertTrue(lp.logo());
	}
	
	@Test (priority=4)
	public void verifyMainHeading()
	{
		Assert.assertTrue(lp.mainHeading());
	}
	
	@Test (priority=5)
	public void verifySubHeading()
	{
		Assert.assertTrue(lp.subHeading());
	}
	
	@Test (priority=6)
	public void verifySignInBoxHeading()
	{
		Assert.assertTrue(lp.signInBoxHeading());
	}
	
	@Test (priority=7)
	public void verifyPlaceholders()
	{
		Assert.assertTrue(lp.placeholders());
	}
	
	@Test (priority=8)
	public void verifyValidLogIn()
	{
		Assert.assertTrue(lp.validLogIn());
	}
	
	@Test (priority=9)
	public void verifyLogoutSuccessfullyMessage()
	{
		Assert.assertTrue(lp.logoutSuccessfullyMessage());
	}
	
	@Test (priority=10)
	public void verifyInvalidLogIn()
	{
		Assert.assertTrue(lp.invalidLogIn());
	}
	
	@Test (priority=11)
	public void verifyInvalidLogInErrorMessage()
	{
		Assert.assertTrue(lp.invalidLogInErrorMessage());
	}
	
	@Test (priority=12)
	public void verifyBlankLogInErrorMessage()
	{
		Assert.assertTrue(lp.blankLogInErrorMessage());
	}
	
	@Test (priority=13)
	public void verifyRegisterLinkText()
	{
		Assert.assertTrue(lp.registerLinkText());
	}
	
	@Test (priority=14)
	public void verifyRegisterLink()
	{
		Assert.assertTrue(lp.registerLink());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}