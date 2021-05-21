package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.OperatorsPage;
import com.jbk.testbase.TestBase;

public class OperatorsTest extends TestBase
{
	WebDriver driver ;
	OperatorsPage op = null ;
	
	@BeforeSuite
	public void OperatorsPg () throws Exception
	{
		driver = super.initialization();
		op = navigateToLoginPg().navigateToDashboardPg().navigateToOperatorsPg();
		op = new OperatorsPage(driver);
	}
	
	@Test (priority=1)
	public void verifycontactNoLength()
	{
		Assert.assertTrue(op.contactNoLength());
	}
	
	@Test (priority=2)
	public void verifyNamesInAlphabeticalOrder()
	{
		Assert.assertTrue(op.namesInAlphabeticalOrder());
	}
	
	@Test (priority=3)
	public void verifyPrefferedWayToConnect_WhatsApp()
	{
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp());
	}
	
	@Test (priority=4)
	public void verifyPrefferedWayToConnect_PhoneCall()
	{
		Assert.assertTrue(op.prefferedWayToConnect_PhoneCall());
	}
	
	@Test (priority=5)
	public void verifyPrefferedWayToConnect_WhatsApp_And_PhoneCall()
	{
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_And_PhoneCall());
	}
	
	@Test (priority=6)
	public void verifyPrefferedWayToConnect_WhatsApp_ButNot_PhoneCall()
	{
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_ButNot_PhoneCall());
	}
	
	@Test (priority=7)
	public void verifyFacultiesAvailableOnMonday()
	{
		Assert.assertTrue(op.facultiesAvailableOnMonday());
	}
	
	@Test (priority=8)
	public void verifyFacultiesNotAvailableOnSunday()
	{
		Assert.assertTrue(op.facultiesNotAvailableOnSunday());
	}
	
	@Test (priority=9)
	public void verifyComplete_OperatorsTable() throws Exception
	{
		Assert.assertTrue(op.CompleteOperatorsTable());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
