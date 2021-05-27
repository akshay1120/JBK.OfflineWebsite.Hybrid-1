package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.UsersPage;
import com.jbk.testbase.TestBase;

public class UsersTest extends TestBase
{
	UsersPage up = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		up = lp.navigateToDashboardPg().navigateToUsersPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyHeadingsAl()
	{
		logT().info("*********************************************************");
		logT().info("verify Headings using Al");
		testLog = extent.createTest("verify Headings using Al");
		Assert.assertTrue(up.alTableHeadings(testLog));
	}
	
	@Test (priority=2) 
	public void verifyMobNoLength() 
	{
		logT().info("*********************************************************");
		logT().info("verify Mob No Length");
		testLog = extent.createTest("verify Mob No Length");
		Assert.assertTrue(up.mobNoLength(testLog));
	}
	
	@Test (priority=3) 
	public void verifyMaleGender() 
	{
		logT().info("*********************************************************");
		logT().info("verify for Male Gender");
		testLog = extent.createTest("verify for Male Gender");
		Assert.assertTrue(up.maleGender(testLog));
	}
	
	@Test (priority=4) 
	public void verifyStateMaharashtra() 
	{
		logT().info("*********************************************************");
		logT().info("verify for State of Maharashtra");
		testLog = extent.createTest("verify for State of Maharashtra");
		Assert.assertTrue(up.stateMaharashtra(testLog));
	}
	
	@Test (priority=5) 
	public void verifyUnameInOrder() 
	{
		logT().info("*********************************************************");
		logT().info("verify Uname In Order");
		testLog = extent.createTest("verify Uname In Order");
		Assert.assertTrue(up.unameInOrder(testLog));
	}
	
	@Test (priority=6) 
	public void verifyGmail_com() 
	{
		logT().info("*********************************************************");
		logT().info("verify Gmail.com");
		testLog = extent.createTest("verify Gmail.com");
		Assert.assertTrue(up.gmail_com(testLog));
	}
	
	@Test (priority=7) 
	public void verifyClickDeleteAlertMsg() 
	{
		logT().info("*********************************************************");
		logT().info("verify Click Delete Alert Msg");
		testLog = extent.createTest("verify Click Delete Alert Msg");
		Assert.assertTrue(up.clickDeleteAlertMsg(testLog));
	}
	
	@Test (priority=8) 
	public void verifySeleniumFaculty() 
	{
		logT().info("*********************************************************");
		logT().info("verify Selenium Faculty");
		testLog = extent.createTest("verify Selenium Faculty");
		Assert.assertTrue(up.seleniumFaculty(testLog));
	}
	
	@Test (priority=9) 
	public void verifyToolTip() 
	{
		logT().info("*********************************************************");
		logT().info("verify Tool Tip");
		testLog = extent.createTest("verify Tool Tip");
		Assert.assertTrue(up.toolTip(testLog));
	}
	
	@Test (priority=10) 
	public void verifyComplete_UsersTable() throws Exception 
	{
		logT().info("*********************************************************");
		logT().info("verify Complete Users Table");
		testLog = extent.createTest("verify Complete Users Table");
		Assert.assertTrue(up.CompleteUsersTable(testLog));
	}
}