package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.OperatorsPage;

public class OperatorsTest 
{
	WebDriver driver ;
	OperatorsPage op = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		op = new OperatorsPage(driver);
		op.uname.sendKeys("kiran@gmail.com");
		op.pass.sendKeys("123456");
		op.lgnBtn.click();
		op.users.click();
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
