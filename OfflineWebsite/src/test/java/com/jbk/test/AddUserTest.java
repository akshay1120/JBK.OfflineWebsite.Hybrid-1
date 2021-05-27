package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;

public class AddUserTest extends TestBase
{
	AddUserPage ap = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ap = lp.navigateToDashboardPg().navigateToUsersPg().navigateToAddUserPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyPrintingDragDownOptions()
	{
		logT().info("*********************************************************");
		logT().info("verify Printing Drag Down Options using Al");
		testLog = extent.createTest("verify Printing Drag Down Options using Al");
		Assert.assertTrue(ap.printingDragDownOptions(testLog));
	}
	
	@Test (priority=2)
	public void verifyprintingDragDownOptExcel() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify Printing Drag Down Options using Excel");
		testLog = extent.createTest("verify Printing Drag Down Options using Excel");
		Assert.assertTrue(ap.printingDragDownOptExcel(testLog));
	}
	
	@Test (priority=3)
	public void verifyValidAddUser() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify Valid Add User");
		testLog = extent.createTest("verify Valid Add User");
		Assert.assertTrue(ap.validAddUser(testLog));
	}
}
