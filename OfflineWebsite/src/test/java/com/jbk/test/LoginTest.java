package com.jbk.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;
import com.utility.ExcelUtility;

public class LoginTest extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws IOException
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		//LogT().info("***************************");
		//LogT().info("verifying the url");
		testLog = extent.createTest("verifyUrl");
		Assert.assertTrue(lp.url(testLog));
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		logT().info("***************************");
		logT().info("verifying the title");
		testLog = extent.createTest("verifyTitle");
		Assert.assertTrue(lp.title(testLog));
	}
	
	@Test (priority = 3)
	public void verifyLogo()
	{
		logT().info("***************************");
		logT().info("verifying the logo");
		testLog = extent.createTest("verifyLogo");
		Assert.assertTrue(lp.logo(testLog));
	}
	
	@Test (priority=4)
	public void verifyMainHeading()
	{
		logT().info("***************************");
		logT().info("verifying the MainHeading");
		testLog = extent.createTest("verifyMainHeading");
		Assert.assertTrue(lp.mainHeading(testLog));
	}
	
	@Test (priority=5)
	public void verifySubHeading()
	{
		logT().info("***************************");
		logT().info("verifying the subHeading");
		testLog = extent.createTest("verifySubHeading");
		Assert.assertTrue(lp.subHeading(testLog));
	}
	
	@Test (priority=6)
	public void verifySignInBoxHeading()
	{
		logT().info("***************************");
		logT().info("verifying the signInBoxHeading");
		testLog = extent.createTest("verifySignInBoxHeading");
		Assert.assertTrue(lp.signInBoxHeading(testLog));
	}
	
	@Test (priority=7)
	public void verifyPlaceholders()
	{
		logT().info("***************************");
		logT().info("verifying the placeholders");
		testLog = extent.createTest("verifyPlaceholders");
		Assert.assertTrue(lp.placeholders(testLog));
	}
	
	@Test (priority=8)
	public void verifyValidLogIn()
	{
		logT().info("***************************");
		logT().info("verifying the valid LogIn");
		testLog = extent.createTest("verifyValidLogIn");
		Assert.assertTrue(lp.validLogIn(testLog));
	}
	
	@Test (priority=9)
	public void verifyLogoutSuccessfullyMessage()
	{
		logT().info("***************************");
		logT().info("verifying the logout Successfully Message");
		testLog = extent.createTest("verifyLogoutSuccessfullyMessage");
		Assert.assertTrue(lp.logoutSuccessfullyMessage(testLog));
	}
	
	@Test (priority=10)
	public void verifyInvalidLogIn()
	{
		logT().info("***************************");
		logT().info("verifying the invalid LogIn");
		testLog = extent.createTest("verifyInvalidLogIn");
		Assert.assertTrue(lp.invalidLogIn(testLog));
	}
	
	@Test (priority=11)
	public void verifyInvalidLogInErrorMessage()
	{
		logT().info("***************************");
		logT().info("verifying the invalid Log In Error Message");
		testLog = extent.createTest("verifyInvalidLogInErrorMessage");
		Assert.assertTrue(lp.invalidLogInErrorMessage(testLog));
	}
	
	@Test (priority=12)
	public void verifyBlankLogInErrorMessage()
	{
		logT().info("***************************");
		logT().info("verifying the blank Log In Error Message");
		testLog = extent.createTest("verifyBlankLogInErrorMessage");
		Assert.assertTrue(lp.blankLogInErrorMessage(testLog));
	}
	
	@Test (priority=13)
	public void verifyRegisterLinkText()
	{
		logT().info("***************************");
		logT().info("verifying the register Link Text");
		testLog = extent.createTest("verifyRegisterLinkText");
		Assert.assertTrue(lp.registerLinkText(testLog));
	}
	
	@Test (priority=14)
	public void verifyRegisterLink()
	{
		logT().info("***************************");
		logT().info("verifying the register Link");
		testLog = extent.createTest("verifyRegisterLink");
		Assert.assertTrue(lp.registerLink(testLog));
	}
	
	@Test (priority=15)
	public void loginWithAlldata()throws Exception
	{
		logT().info("***************************");
		logT().info("verifying the Login Without Heading Excel Data");
		testLog = extent.createTest("loginWithAlldata");
		lp.loginWithAllData(ExcelUtility.readUnameAndPass("Data.xlsx", "LoginWithoutHeading", 0, 1 , 0),testLog);
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}