package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.RegisterPage;
import com.jbk.testbase.TestBase;

public class RegisterTest extends TestBase
{
	WebDriver driver ;
	RegisterPage rp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		rp = navigateToLoginPg().navigateToRegisterPg();
		rp = new RegisterPage(driver);
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		Assert.assertTrue(rp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		Assert.assertTrue(rp.title());
	}
	
	@Test(priority=3)
	public void verifyHeading() 
	{ 
		Assert.assertTrue(rp.heading());
	}
	
	@Test(priority=4)
	public void verifyAlreadyMemberText() 
	{ 
		Assert.assertTrue(rp.alreadyMemberText());
	}
	
	@Test(priority=5)
	public void verifyAlreadyMemberLink() 
	{
		Assert.assertTrue(rp.alreadyMemberLink());
	}
	
	@Test(priority=6)
	public void verifyPlaceholders() 
	{ 
		Assert.assertTrue(rp.placeholders());
	}
	
	@Test(priority=7)
	public void verifyBlankSignIn() 
	{
		Assert.assertTrue(rp.blankSignIn());
	}
	
	@Test(priority=8)
	public void verifyValidSignIn() 
	{
		Assert.assertTrue(rp.validSignIn());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
