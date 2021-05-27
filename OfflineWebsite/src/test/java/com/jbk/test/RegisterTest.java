package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.RegisterPage;
import com.jbk.testbase.TestBase;

public class RegisterTest extends TestBase
{
	RegisterPage rp = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		rp = lp.navigateToRegisterPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		logT().info("*********************************************************");
		logT().info("verify Url");
		testLog = extent.createTest("verify Url");
		Assert.assertTrue(rp.url(testLog));
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		logT().info("*********************************************************");
		logT().info("verify Title");
		testLog = extent.createTest("verify Title");
		Assert.assertTrue(rp.title(testLog));
	}
	
	@Test(priority=3)
	public void verifyHeading() 
	{ 
		logT().info("*********************************************************");
		logT().info("verify Heading");
		testLog = extent.createTest("verify Heading");
		Assert.assertTrue(rp.heading(testLog));
	}
	
	@Test(priority=4)
	public void verifyAlreadyMemberText() 
	{ 
		logT().info("*********************************************************");
		logT().info("verify Already Member Text");
		testLog = extent.createTest("verify Already Member Text");
		Assert.assertTrue(rp.alreadyMemberText(testLog));
	}
	
	@Test(priority=5)
	public void verifyAlreadyMemberLink() 
	{
		logT().info("*********************************************************");
		logT().info("verify Already Member Link");
		testLog = extent.createTest("verify Already Member Link");
		Assert.assertTrue(rp.alreadyMemberLink(testLog));
	}
	
	@Test(priority=6)
	public void verifyPlaceholders() 
	{ 
		logT().info("*********************************************************");
		logT().info("verify Placeholders");
		testLog = extent.createTest("verify Placeholders");
		Assert.assertTrue(rp.placeholders(testLog));
	}
	
	@Test(priority=7)
	public void verifyBlankSignIn() 
	{
		logT().info("*********************************************************");
		logT().info("verify Blank Sign In");
		testLog = extent.createTest("verify Blank Sign In");
		Assert.assertTrue(rp.blankSignIn(testLog));
	}
	
	@Test(priority=8)
	public void verifyValidSignIn() 
	{
		logT().info("*********************************************************");
		logT().info("verify Valid Sign In");
		testLog = extent.createTest("verify Valid Sign In");
		Assert.assertTrue(rp.validSignIn(testLog));
	}
}
