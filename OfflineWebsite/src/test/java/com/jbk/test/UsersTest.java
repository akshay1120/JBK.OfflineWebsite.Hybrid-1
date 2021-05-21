package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.UsersPage;
import com.jbk.testbase.TestBase;

public class UsersTest extends TestBase
{
	WebDriver driver ;
	UsersPage up = null ;
	
	@BeforeSuite
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		up = navigateToLoginPg().navigateToDashboardPg().navigateToUsersPg();
		up = new UsersPage(driver);
	}
	
	@Test (priority=1)
	public void verifyHeadingsAl()
	{
		Assert.assertTrue(up.alTableHeadings());
	}
	
	@Test (priority=2) 
	public void verifyMobNoLength() 
	{
		Assert.assertTrue(up.mobNoLength());
	}
	
	@Test (priority=3) 
	public void verifyMaleGender() 
	{
		Assert.assertTrue(up.maleGender());
	}
	
	@Test (priority=4) 
	public void verifyStateMaharashtra() 
	{
		Assert.assertTrue(up.stateMaharashtra());
	}
	
	@Test (priority=5) 
	public void verifyUnameInOrder() 
	{
		Assert.assertTrue(up.unameInOrder());
	}
	
	@Test (priority=6) 
	public void verifyGmail_com() 
	{
		Assert.assertTrue(up.gmail_com());
	}
	
	@Test (priority=7) 
	public void verifyClickDeleteAlertMsg() 
	{
		Assert.assertTrue(up.clickDeleteAlertMsg());
	}
	
	@Test (priority=8) 
	public void verifySeleniumFaculty() 
	{
		Assert.assertTrue(up.seleniumFaculty());
	}
	
	@Test (priority=9) 
	public void verifyToolTip() 
	{
		Assert.assertTrue(up.toolTip());
	}
	
	@Test (priority=10) 
	public void verifyComplete_UsersTable() throws Exception 
	{
		Assert.assertTrue(up.CompleteUsersTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}