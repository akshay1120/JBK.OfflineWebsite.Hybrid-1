package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;

public class AddUserTest extends TestBase
{
	WebDriver driver ;
	AddUserPage ap = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ap = lp.navigateToDashboardPg().navigateToUsersPg().navigateToAddUserPg();
		ap = new AddUserPage(driver);
	}
	
	@Test (priority=1)
	public void verifyPrintingDragDownOptions()
	{
		Assert.assertTrue(ap.printingDragDownOptions());
	}
	
	@Test (priority=2)
	public void verifyprintingDragDownOptExcel() throws Exception
	{
		Assert.assertTrue(ap.printingDragDownOptExcel());
	}
	
	@Test (priority=3)
	public void verifyValidAddUser() throws Exception
	{
		Assert.assertTrue(ap.validAddUser());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
