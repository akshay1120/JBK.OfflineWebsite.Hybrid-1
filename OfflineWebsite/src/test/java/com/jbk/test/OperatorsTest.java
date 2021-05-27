package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.testbase.TestBase;

public class OperatorsTest extends TestBase
{
	OperatorsPage op = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		driver = super.initialization();
		lp = new LoginPage(driver);
		op = lp.navigateToDashboardPg().navigateToOperatorsPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifycontactNoLength()
	{
		logT().info("*********************************************************");
		logT().info("verify contact No Length");
		testLog = extent.createTest("verify contact No Length");
		Assert.assertTrue(op.contactNoLength(testLog));
	}
	
	@Test (priority=2)
	public void verifyNamesInAlphabeticalOrder()
	{
		logT().info("*********************************************************");
		logT().info("verify Names In Alphabetical Order");
		testLog = extent.createTest("verify Names In Alphabetical Order");
		Assert.assertTrue(op.namesInAlphabeticalOrder(testLog));
	}
	
	@Test (priority=3)
	public void verifyPrefferedWayToConnect_WhatsApp()
	{
		logT().info("*********************************************************");
		logT().info("verify Preffered Way To Connect WhatsApp");
		testLog = extent.createTest("verify Preffered Way To Connect WhatsApp");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp(testLog));
	}
	
	@Test (priority=4)
	public void verifyPrefferedWayToConnect_PhoneCall()
	{
		logT().info("*********************************************************");
		logT().info("verify Preffered Way To Connect PhoneCall");
		testLog = extent.createTest("verify Preffered Way To Connect PhoneCall");
		Assert.assertTrue(op.prefferedWayToConnect_PhoneCall(testLog));
	}
	
	@Test (priority=5)
	public void verifyPrefferedWayToConnect_WhatsApp_And_PhoneCall()
	{
		logT().info("*********************************************************");
		logT().info("verify Preffered Way To Connect WhatsApp And PhoneCall");
		testLog = extent.createTest("verify Preffered Way To Connect WhatsApp And PhoneCall");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_And_PhoneCall(testLog));
	}
	
	@Test (priority=6)
	public void verifyPrefferedWayToConnect_WhatsApp_ButNot_PhoneCall()
	{
		logT().info("*********************************************************");
		logT().info("verify Preffered Way To Connect WhatsApp But Not Phone Call");
		testLog = extent.createTest("verify Preffered Way To Connect WhatsApp But Not Phone Call");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_ButNot_PhoneCall(testLog));
	}
	
	@Test (priority=7)
	public void verifyFacultiesAvailableOnMonday()
	{
		logT().info("*********************************************************");
		logT().info("verify Faculties Available On Monday");
		testLog = extent.createTest("verify Faculties Available On Monday");
		Assert.assertTrue(op.facultiesAvailableOnMonday(testLog));
	}
	
	@Test (priority=8)
	public void verifyFacultiesNotAvailableOnSunday()
	{
		logT().info("*********************************************************");
		logT().info("verify Faculties Not Available On Sunday");
		testLog = extent.createTest("verify Faculties Not Available On Sunday");
		Assert.assertTrue(op.facultiesNotAvailableOnSunday(testLog));
	}
	
	@Test (priority=9)
	public void verifyComplete_OperatorsTable() throws Exception
	{
		logT().info("*********************************************************");
		logT().info("verify Complete Operators Table");
		testLog = extent.createTest("verify Complete Operators Table");
		Assert.assertTrue(op.CompleteOperatorsTable(testLog));
	}
}
