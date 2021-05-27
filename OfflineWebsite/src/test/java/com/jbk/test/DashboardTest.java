package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;

public class DashboardTest extends TestBase
{
	DashboardPage dp = null ;
	LoginPage lp = null ;
	
	@BeforeSuite
	public void openBrowser() throws Exception 
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dp = lp.navigateToDashboardPg();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		logT().info("verifying the url");
		testLog = extent.createTest("verifying the url");
		Assert.assertTrue(dp.url(testLog));
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		logT().info("verifying the Title");
		testLog = extent.createTest("verifying the Title");
		Assert.assertTrue(dp.title(testLog));
	}
	
	@Test (priority=3)
	public void verifyCornerHeading () 
	{
		logT().info("verifying the Corner Heading");
		testLog = extent.createTest("verifying the Corner Heading");
		Assert.assertTrue(dp.cornerHeading(testLog));
	}
	
	@Test (priority=4)
	public void verifyMainHeading() 
	{
		logT().info("verifying the Main Heading");
		testLog = extent.createTest("verifying the Main Heading");
		Assert.assertTrue(dp.mainHeading(testLog));
	}
	
	@Test (priority=5)
	public void verifyUserImage() 
	{
		logT().info("verifying the User Image");
		testLog = extent.createTest("verifying the User Image");
		Assert.assertTrue(dp.userImage(testLog));
	}
	
	@Test (priority=6)
	public void verifyUserName () 
	{
		logT().info("verifying the User Name");
		testLog = extent.createTest("verifying the User Name");
		Assert.assertTrue(dp.userName(testLog));
	}
	
	@Test (priority=7)
	public void verifyUserStatus () 
	{
		logT().info("verifying the User Status");
		testLog = extent.createTest("verifying the User Status");
		Assert.assertTrue(dp.userStatus(testLog));
	}
	
	@Test (priority=8)
	public void verifynavigationMenuText () 
	{
		logT().info("verifying the navigation Menu Text");
		testLog = extent.createTest("verifying the navigation Menu Text");
		Assert.assertTrue(dp.navigationMenuText(testLog));
	}
	
	@Test (priority=9)
	public void verifyUsersMenu() 
	{
		logT().info("verifying the Users Menu");
		testLog = extent.createTest("verifying the Users Menu");
		Assert.assertTrue(dp.usersMenu(testLog));
	}
	
	@Test (priority=10)
	public void verifyOperatorsMenu () 
	{
		logT().info("verifying the Operators Menu");
		testLog = extent.createTest("verifying the Operators Menu");
		Assert.assertTrue(dp.operatorsMenu(testLog));
	}
	
	@Test (priority=11)
	public void verifyUsefulLinksMenu() 
	{
		logT().info("verifying the Useful Links Menu");
		testLog = extent.createTest("verifying the Useful Links Menu");
		Assert.assertTrue(dp.usefulLinksMenu(testLog));
	}
	
	@Test (priority=12)
	public void verifyDownloadsMenu () 
	{
		logT().info("verifying the Downloads Menu");
		testLog = extent.createTest("verifying the Downloads Menu");
		Assert.assertTrue(dp.downloadsMenu(testLog));
	}
	
	@Test (priority=13)
	public void verifyLeftCornerLogOutMenu() 
	{
		logT().info("verifying the Left Corner Log Out Menu");
		testLog = extent.createTest("verifying the Left Corner Log Out Menu");
		Assert.assertTrue(dp.leftCornerLogOutMenu(testLog));
	}
	
	@Test (priority=14)
	public void verifyRightCornerLogOutLink() 
	{
		logT().info("verifying the Left Corner Log Out Link");
		testLog = extent.createTest("verifying the Left Corner Log Out Link");
		Assert.assertTrue(dp.rightCornerLogOutLink(testLog));
	}
	
	@Test (priority=15)
	public void verifyCoursesHeading () 
	{
		logT().info("verifying the Courses Headings");
		testLog = extent.createTest("verifying the Courses Headings");
		Assert.assertTrue(dp.coursesHeading(testLog));
	}
	
	@Test (priority=16)
	public void verifyCoursesSubHeading () 
	{
		logT().info("verifying the Courses Sub Headings");
		testLog = extent.createTest("verifying the Courses Sub Headings");
		Assert.assertTrue(dp.coursesSubHeading(testLog));
	}
	
	@Test (priority=17)
	public void verifyCoursesMoreInfo() 
	{
		logT().info("verifying the Courses More Info Text");
		testLog = extent.createTest("verifying the Courses More Info Text");
		Assert.assertTrue(dp.coursesMoreInfo(testLog));
	}
	
	@Test (priority=18)
	public void verifyMoreInfoNewWindow () throws Exception 
	{
		logT().info("verifying the Courses More Info Links");
		testLog = extent.createTest("verifying the Courses More Info Links");
		Assert.assertTrue(dp.moreInfoNewWindow(testLog));
	}
	
	@Test (priority=19)
	public void verifyFooterStatement () 
	{
		logT().info("verifying the Footer Statement");
		testLog = extent.createTest("verifying the Footer Statement");
		Assert.assertTrue(dp.footerStatement(testLog));
	}
	
	@Test (priority=20)
	public void verifyJBK_Link () throws Exception 
	{
		logT().info("verifying the JBK_Link present at footer");
		testLog = extent.createTest("verifying the JBK_Link present at footer");
		Assert.assertTrue(dp.jbk_Link(testLog));
	}
	
	@Test (priority=21)
	public void verifySequence () 
	{
		logT().info("verifying Sequence of Windows Text");
		testLog = extent.createTest("verifying Sequence of Windows Text");
		Assert.assertTrue(dp.sequence(testLog));
	}
	
	@Test (priority=22)
	public void verifyCourseHeading () throws Exception 
	{
		logT().info("verifying the Course Heading using Excel");
		testLog = extent.createTest("verifying the Course Heading using Excel");
		Assert.assertTrue(dp.courseHeadingExcel(testLog));
	}
	
	@Test (priority=23)
	public void verifyCourseSubHeading () throws Exception 
	{
		logT().info("verifying the Course Sub Heading using Excel");
		testLog = extent.createTest("verifying the Course Sub Heading using Excel");
		Assert.assertTrue(dp.courseSubHeadingExcel(testLog));
	}
}

