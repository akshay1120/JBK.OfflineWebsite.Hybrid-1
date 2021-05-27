package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.RegisterPage;
import com.jbk.testbase.TestBase;

public class RegisterTest extends TestBase
{
	WebDriver driver ;
	RegisterPage rp = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		rp = lp.navigateToRegisterPg();
		rp = new RegisterPage(driver);
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		Assert.assertTrue(rp.url(testLog));
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		Assert.assertTrue(rp.title(testLog));
	}
	
	@Test(priority=3)
	public void verifyHeading() 
	{ 
		Assert.assertTrue(rp.heading(testLog));
	}
	
	@Test(priority=4)
	public void verifyAlreadyMemberText() 
	{ 
		Assert.assertTrue(rp.alreadyMemberText(testLog));
	}
	
	@Test(priority=5)
	public void verifyAlreadyMemberLink() 
	{
		Assert.assertTrue(rp.alreadyMemberLink(testLog));
	}
	
	@Test(priority=6)
	public void verifyPlaceholders() 
	{ 
		Assert.assertTrue(rp.placeholders(testLog));
	}
	
	@Test(priority=7)
	public void verifyBlankSignIn() 
	{
		Assert.assertTrue(rp.blankSignIn(testLog));
	}
	
	@Test(priority=8)
	public void verifyValidSignIn() 
	{
		Assert.assertTrue(rp.validSignIn(testLog));
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
