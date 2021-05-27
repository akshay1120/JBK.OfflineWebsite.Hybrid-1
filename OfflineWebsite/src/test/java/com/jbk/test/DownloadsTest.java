package com.jbk.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadsPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;

public class DownloadsTest extends TestBase
{
	WebDriver driver ;
	DownloadsPage dpg = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws IOException
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dpg = lp.navigateToDashboardPg().navigateToDownloadsPg();
		dpg = new DownloadsPage(driver);
	}
	
	@Test (priority=1)
	public void verifyOperatingSystem_32bit()
	{
		Assert.assertTrue(dpg.operatingSystem_32bit());
	}
	
	@Test (priority=2)
	public void verifyCommon()
	{
		Assert.assertTrue(dpg.common());
	}
	
	@Test (priority=3)
	public void verifyNone()
	{
		Assert.assertTrue(dpg.none());
	}
	
	@Test (priority=4)
	public void verifyComplete_DownloadsTable() throws Exception
	{
		Assert.assertTrue(dpg.completeDownloadsTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}