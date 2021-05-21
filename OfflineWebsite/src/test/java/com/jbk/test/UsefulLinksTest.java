package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.UsefulLinksPage;
import com.jbk.testbase.TestBase;

public class UsefulLinksTest extends TestBase
{
	WebDriver driver ;
	UsefulLinksPage ulp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		ulp = navigateToLoginPg().navigateToDashboardPg().navigateToUsefulLinksPg();
		ulp = new UsefulLinksPage(driver);
	}
	
	@Test (priority=1)
	public void verifyClickGO() throws Exception
	{
		Assert.assertTrue(ulp.clickGO());
	}
	
	@Test (priority=2)
	public void verifyClickGoExcel() throws Exception
	{
		Assert.assertTrue(ulp.clickGoExcel());
	}
	
	@Test (priority=3)
	public void verifyComplete_UsefulLinksTable() throws Exception
	{
		Assert.assertTrue(ulp.complete_UsefulLinksTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
	
}
