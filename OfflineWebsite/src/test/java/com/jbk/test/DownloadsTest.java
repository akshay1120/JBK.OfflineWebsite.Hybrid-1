package com.jbk.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadsPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;

public class DownloadsTest extends TestBase
{
	DownloadsPage dpg = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws IOException
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dpg = lp.navigateToDashboardPg().navigateToDownloadsPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyOperatingSystem_32bit()
	{
		logT().info("*********************************************************");
		logT().info("verify Operating System 32bit");
		testLog = extent.createTest("verify Operating System 32bit");
		Assert.assertTrue(dpg.operatingSystem_32bit(testLog));
	}
	
	@Test (priority=2)
	public void verifyCommon()
	{
		logT().info("*********************************************************");
		logT().info("verify Operating System Common");
		testLog = extent.createTest("verify Operating System Common");
		Assert.assertTrue(dpg.common(testLog));
	}
	
	@Test (priority=3)
	public void verifyNone()
	{
		logT().info("*********************************************************");
		logT().info("verify None Operating System");
		testLog = extent.createTest("verify None Operating System");
		Assert.assertTrue(dpg.none(testLog));
	}
	
	@Test (priority=4)
	public void verifyComplete_DownloadsTable() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify Complete Downloads Table");
		testLog = extent.createTest("verify Complete Downloads Table");
		Assert.assertTrue(dpg.completeDownloadsTable(testLog));
	}
}