package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;

public class DashboardTest 
{
	WebDriver driver ;
	DashboardPage dp = null ;
	
	@BeforeSuite
	public void OpenBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/index.html");
		dp = new DashboardPage(driver);
		dp.uname.sendKeys("kiran@gmail.com");
		dp.pass.sendKeys("123456");
		dp.lgnBtn.click();
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		Assert.assertTrue(dp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		Assert.assertTrue(dp.title());
	}
	
	@Test (priority=3)
	public void verifyCornerHeading () 
	{
		Assert.assertTrue(dp.cornerHeading());
	}
	
	@Test (priority=4)
	public void verifyMainHeading() 
	{
		Assert.assertTrue(dp.mainHeading());
	}
	
	@Test (priority=5)
	public void verifyUserImage() 
	{
		Assert.assertTrue(dp.userImage());
	}
	
	@Test (priority=6)
	public void verifyUserName () 
	{
		Assert.assertTrue(dp.userName());
	}
	
	@Test (priority=7)
	public void verifyUserStatus () 
	{
		Assert.assertTrue(dp.userStatus());
	}
	
	@Test (priority=8)
	public void verifynavigationMenuText () 
	{
		Assert.assertTrue(dp.navigationMenuText());
	}
	
	@Test (priority=9)
	public void verifyUsersMenu() 
	{
		Assert.assertTrue(dp.usersMenu());
	}
	
	@Test (priority=10)
	public void verifyOperatorsMenu () 
	{
		Assert.assertTrue(dp.operatorsMenu());
	}
	
	@Test (priority=11)
	public void verifyUsefulLinksMenu() 
	{
		Assert.assertTrue(dp.usefulLinksMenu());
	}
	
	@Test (priority=12)
	public void verifyDownloadsMenu () 
	{
		Assert.assertTrue(dp.downloadsMenu());
	}
	
	@Test (priority=13)
	public void verifyLeftCornerLogOutMenu() 
	{
		Assert.assertTrue(dp.leftCornerLogOutMenu());
	}
	
	@Test (priority=14)
	public void verifyRightCornerLogOutLink() 
	{
		Assert.assertTrue(dp.verifyRightCornerLogOutLink());
	}
	
	@Test (priority=15)
	public void verifyCoursesHeading () 
	{
		Assert.assertTrue(dp.coursesHeading());
	}
	
	@Test (priority=16)
	public void verifyCoursesSubHeading () 
	{
		Assert.assertTrue(dp.coursesSubHeading());
	}
	
	@Test (priority=17)
	public void verifyCoursesMoreInfo() 
	{
		Assert.assertTrue(dp.coursesMoreInfo());
	}
	
	@Test (priority=18)
	public void verifyMoreInfoNewWindow () throws Exception 
	{
		Assert.assertTrue(dp.moreInfoNewWindow());
	}
	
	@Test (priority=19)
	public void verifyFooterStatement () 
	{
		Assert.assertTrue(dp.footerStatement());
	}
	
	@Test (priority=20)
	public void verifyJBK_Link () throws Exception 
	{
		Assert.assertTrue(dp.jbk_Link());
	}
	
	@Test (priority=21)
	public void verifySequence () 
	{
		Assert.assertTrue(dp.sequence());
	}
	
	@Test (priority=22)
	public void verifyCourseHeading () throws Exception 
	{
		Assert.assertTrue(dp.courseHeadingExcel());
	}
	
	@Test (priority=23)
	public void verifyCourseSubHeading () throws Exception 
	{
		Assert.assertTrue(dp.courseSubHeadingExcel());
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}

