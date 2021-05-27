package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.UsefulLinksPage;
import com.jbk.testbase.TestBase;

public class UsefulLinksTest extends TestBase
{
	UsefulLinksPage ulp = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ulp = lp.navigateToDashboardPg().navigateToUsefulLinksPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyClickGO() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify GO Links using Al");
		testLog = extent.createTest("verify GO Links using Al");
		Assert.assertTrue(ulp.clickGO(testLog));
	}
	
	@Test (priority=2)
	public void verifyClickGoExcel() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify GO Links using Excel");
		testLog = extent.createTest("verify GO Links using Excel");
		Assert.assertTrue(ulp.clickGoExcel(testLog));
	}
	
	@Test (priority=3)
	public void verifyComplete_UsefulLinksTable() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify Complete Useful Links Table");
		testLog = extent.createTest("verify Complete Useful Links Table");
		Assert.assertTrue(ulp.complete_UsefulLinksTable(testLog));
	}
}
