package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.DashboardPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;
import com.utility.WindowHandlingUtility;

public class DashboardPage extends DashboardPgObjRepo
{
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url(ExtentTest test)
	{	
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/dashboard.html" ; 
		logP().info("Expected Url = " + expectedUrl);
		test.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		logP().info("Actual Url = " + actualUrl);
		test.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			logP().info("Actual and Expected Url matched");
			test.info("Actual and Expected Url matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Url not matched");
			test.info("Actual and Expected Url not matched");
			return false ;
		}
	}
	
	//2
	public boolean title(ExtentTest test) 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("actual Title = " + actualTitle);
		test.info("actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and Expected title matched");
			test.info("Actual and Expected title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected title not matched");
			test.info("Actual and Expected title not matched");
			return false ;
		}
	}
	
	//3
	public boolean cornerHeading(ExtentTest test) 
	{ 	
		String actCornerHeading = Utility.getText(cornerHead);
		logP().info("actual Corner Heading = " + actCornerHeading);
		test.info("actual Corner Heading = " + actCornerHeading);
		
		String expCornerHeading = "Java By Kiran" ;
		logP().info("expected Corner Heading = " + expCornerHeading);
		test.info("expected Corner Heading = " + expCornerHeading);
		
		if(actCornerHeading.equals(expCornerHeading))
		{
			logP().info("Actual and Expected Corner Heading matched");
			test.info("Actual and Expected Corner Heading matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Corner Heading not matched");
			test.info("Actual and Expected Corner Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading(ExtentTest test) 
	{
		String actMainHeading = Utility.getText(mainHead);
		logP().info("actual Main Heading = " + actMainHeading);
		test.info("actual Main Heading = " + actMainHeading);
		
		String expMainHeading = "Dashboard Courses Offered" ;
		logP().info("expected Main Heading = " + expMainHeading);
		test.info("expected Main Heading = " + expMainHeading);
		
		if(actMainHeading.equals(expMainHeading))
		{
			logP().info("Actual and Expected Main Heading matched");
			test.info("Actual and Expected Main Heading matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Main Heading not matched");
			test.info("Actual and Expected Main Heading not matched");
			return false ;
		}
	}
	
	//5
	public boolean userImage(ExtentTest test) 
	{	
		if(Utility.displayed(userImg)==true)
		{
			logP().info("User Image is displayed");
			test.info("User Image is displayed");
			return true ;
		}
		else
		{
			logP().info("User Image is not displayed");
			test.info("User Image is not displayed");
			return false ;
		}
	}
	
	//6
	public boolean userName (ExtentTest test) 
	{
		String actUserName = Utility.getText(userName);
		logP().info("actual User Name = " + actUserName);
		test.info("actual User Name = " + actUserName);
		
		String expUserName = "Kiran" ;
		logP().info("expected User Name = " + expUserName);
		test.info("expected User Name = " + expUserName);
		
		if(actUserName.equals(expUserName))
		{
			logP().info("Actual and Expected User Name matched");
			test.info("Actual and Expected User Name matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected User Name not matched");
			test.info("Actual and Expected User Name not matched");
			return false ;
		}
	}
	
	//7
	public boolean userStatus (ExtentTest test) 
	{
		String actUserStatus  = Utility.getText(userStatus);
		logP().info("actual User Status = " + actUserStatus);
		test.info("actual User Status = " + actUserStatus);
		
		String expUserStatus  = "Online" ;
		logP().info("expected User Status = " + expUserStatus);
		test.info("expected User Status = " + expUserStatus);
		
		if(actUserStatus.equals(expUserStatus))
		{
			logP().info("Actual and Expected User Status matched");
			test.info("Actual and Expected User Status matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected User Status not matched");
			test.info("Actual and Expected User Status not matched");
			return false ;
		}
	}
	
	//8
	public boolean navigationMenuText(ExtentTest test) 
	{	
		ArrayList <String> actNavigationMenuText = Utility.getListOfElements(navMenu);
		logP().info("actual Navigation Menu Texts = " + actNavigationMenuText);
		test.info("actual Navigation Menu Texts = " + actNavigationMenuText);
		
		ArrayList <String>expNavigationMenuText =  Utility.dashboardPgNavMenu();
		logP().info("expected Navigation Menu Text = " + expNavigationMenuText);
		test.info("expected Navigation Menu Text = " + expNavigationMenuText);
		
		if(actNavigationMenuText.equals(expNavigationMenuText))
		{
			logP().info("Actual and Expected Navigation Menu Text matched");
			test.info("Actual and Expected Navigation Menu Text matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Navigation Menu Text not matched");
			test.info("Actual and Expected Navigation Menu Text not matched");
			return false ;
		}
	}
	
	//9
	public boolean usersMenu(ExtentTest test) 
	{
		Utility.click(users);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual users Menu Title = " + actTitle);
		test.info("actual users Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | User" ;
		logP().info("expected users Menu Title = " + expTitle);
		test.info("expected users Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected users Menu Title matched");
			test.info("Actual and Expected users Menu Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected users Menu Title not matched");
			test.info("Actual and Expected users Menu Title not matched");
			return false ;
		}
	}
	
	//10
	public boolean operatorsMenu (ExtentTest test) 
	{
		Utility.click(operators);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual operators Menu Title = " + actTitle);
		test.info("actual operators Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Operators" ;
		logP().info("expected operators Menu Title = " + expTitle);
		test.info("expected operators Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected operators Menu Title matched");
			test.info("Actual and Expected operators Menu Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected operators Menu Title not matched");
			test.info("Actual and Expected operators Menu Title not matched");
			return false ;
		}
	}
	
	//11
	public boolean usefulLinksMenu(ExtentTest test) 
	{
		Utility.click(usefulLinks);
		
		String actTitle =  Utility.getTitle(driver);
		logP().info("actual useful Links Menu Title " + actTitle);
		test.info("actual useful Links Menu Title " + actTitle);
		
		String expTitle = "JavaByKiran | Useful Links" ;
		logP().info("expected useful Links Menu Title " + expTitle);
		test.info("expected useful Links Menu Title " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected useful Links Menu Title matched");
			test.info("Actual and Expected useful Links Menu Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected useful Links Menu Title not matched");
			test.info("Actual and Expected useful Links Menu Title not matched");
			return false ;
		}
	}
	
	
	//12
	public boolean downloadsMenu (ExtentTest test) 
	{
		Utility.click(downloads);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual downloads Menu Title = " + actTitle);
		test.info("actual downloads Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Downloads" ;
		logP().info("expected downloads Menu Title = " + expTitle);
		test.info("expected downloads Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected downloads Menu Title matched");
			test.info("Actual and Expected downloads Menu Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected downloads Menu Title not matched");
			test.info("Actual and Expected downloads Menu Title not matched");
			return false ;
		}
	}
	
	//13
	public boolean leftCornerLogOutMenu(ExtentTest test) 
	{
		Utility.click(leftLgOut);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual left Corner LogOut Menu Title = " + actTitle);
		test.info("actual left Corner LogOut Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Log in" ;
		logP().info("actual left Corner LogOut Menu Title = " + expTitle);
		test.info("actual left Corner LogOut Menu Title = " + expTitle);
		
		Utility.sendkeys(uname, "kiran@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
		
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected left Corner LogOut Menu Title matched");
			test.info("Actual and Expected left Corner LogOut Menu Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected left Corner LogOut Menu Title not matched");
			test.info("Actual and Expected left Corner LogOut Menu Title not matched");
			return false ;
		}
	}
	
	//14
	public boolean rightCornerLogOutLink(ExtentTest test) 
	{
		Utility.click(rightLgOut);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual Right Corner LogOut Link Title = " + actTitle);
		test.info("actual Right Corner LogOut Link Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Log in" ;
		logP().info("expected Right Corner LogOut Link Title = " + expTitle);
		test.info("expected Right Corner LogOut Link Title = " + expTitle);
		
		Utility.sendkeys(uname, "kiran@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
				
		if(actTitle.equals(expTitle))
		{
			logP().info("Actual and Expected Right Corner LogOut Link Title matched");
			test.info("Actual and Expected Right Corner LogOut Link Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Right Corner LogOut Link Title not matched");
			test.info("Actual and Expected Right Corner LogOut Link Title not matched");
			return false ;
		}
	}
	
	//15
	public boolean coursesHeading (ExtentTest test) 
	{
		ArrayList <String>actCoursesHeadings  = Utility.getListOfElements(courseHeading);
		logP().info("actual Courses Headings = " + actCoursesHeadings);
		test.info("actual Courses Headings = " + actCoursesHeadings);
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		logP().info("actual Courses Headings = " + expCoursesHeadings);
		test.info("actual Courses Headings = " + expCoursesHeadings);
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
		{
			logP().info("Actual and Expected Courses Headings matched");
			test.info("Actual and Expected Courses Headings matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Courses Headings not matched");
			test.info("Actual and Expected Courses Headings not matched");
			return false ;
		}
	}
	
	//16
	public boolean coursesSubHeading (ExtentTest test) 
	{	
		ArrayList <String>actCoursesSubHeadings  = Utility.getListOfElements(courseSubHeading);
		logP().info("actual Courses Sub Headings = " + actCoursesSubHeadings);
		test.info("actual Courses Sub Headings = " + actCoursesSubHeadings);
		
		ArrayList <String>expCoursesSubHeadings = new ArrayList <String>();
		expCoursesSubHeadings.add("Automation Testing");
		expCoursesSubHeadings.add("Software Development");		
		expCoursesSubHeadings.add("Data Science");
		expCoursesSubHeadings.add("Web Development");
		logP().info("expected Courses Sub Headings = " + expCoursesSubHeadings);
		test.info("expected Courses Sub Headings = " + expCoursesSubHeadings);
		
		if(actCoursesSubHeadings.equals(expCoursesSubHeadings))
		{
			logP().info("Actual and Expected Courses Sub Headings matched");
			test.info("Actual and Expected Courses Sub Headings matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Courses Sub Headings not matched");
			test.info("Actual and Expected Courses Sub Headings not matched");
			return false ;
		}
	 }
	
	//17
	public boolean coursesMoreInfo(ExtentTest test) 
	{	
		ArrayList <String>actMoreInfoTags  = Utility.getListOfElements(moreInfo);
		logP().info("actual MoreInfo Tags = " + actMoreInfoTags);
		test.info("actual MoreInfo Tags = " + actMoreInfoTags);
		
		ArrayList <String>expMoreInfoTags = new ArrayList <String>();
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");		
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");
		logP().info("actual MoreInfo Tags = " + expMoreInfoTags);
		test.info("actual MoreInfo Tags = " + expMoreInfoTags);
		
		if(actMoreInfoTags.equals(expMoreInfoTags))
		{
			logP().info("Actual and Expected MoreInfo Tags matched");
			test.info("Actual and Expected MoreInfo Tags matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected MoreInfo Tags not matched");
			test.info("Actual and Expected MoreInfo Tags not matched");
			return false ;
		}
	}
	
	//18
	public boolean moreInfoNewWindow (ExtentTest test) throws Exception 
	{	
		ArrayList <String> expNewWindowUrls = new ArrayList <String>();
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/examples/dashboard.html#");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/python-syllabus.pdf");		
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/selenium-testing-syllabus-jbk.pdf");
		logP().info("expected New Window Urls = " + expNewWindowUrls);
		test.info("expected New Window Urls = " + expNewWindowUrls);
		
		ArrayList <String> actNewWindowUrls  = WindowHandlingUtility.getWindowsUrls(driver ,moreInfo);
		logP().info("actual New Window Urls = " + actNewWindowUrls);
		test.info("actual New Window Urls = " + actNewWindowUrls);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
		{
			logP().info("Actual and Expected New Window Urls matched");
			test.info("Actual and Expected New Window Urls matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected New Window Urls not matched");
			test.info("Actual and Expected New Window Urls not matched");
			return false ;
		}
	}
	
	//19
	public boolean footerStatement (ExtentTest test) 
	{
		String actfooter = Utility.getText(footer);
		logP().info("Actual footer Statement = " + actfooter);
		test.info("Actual footer Statement = " + actfooter);
		
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
		logP().info("expected footer Statement = " + expfooter);
		test.info("expected footer Statement = " + expfooter);
		
		if(actfooter.equals(expfooter))
		{
			logP().info("Actual and Expected footer Statement matched");
			test.info("Actual and Expected footer Statement matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected footer Statement not matched");
			test.info("Actual and Expected footer Statement not matched");
			return false ;
		}
	}
	
	//20
	public boolean jbk_Link (ExtentTest test) throws Exception 
	{	
		String actWindowTitle = WindowHandlingUtility.getWindowTitle(driver , jbkLink);
		logP().info("actual Window Title = " + actWindowTitle);
		test.info("actual Window Title = " + actWindowTitle);
		
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
		logP().info("expected Window Title = " + expWindowTitle);
		test.info("expected Window Title = " + expWindowTitle);
		
		if(actWindowTitle.equals(expWindowTitle))
		{
			logP().info("Actual and Expected Window Title matched");
			test.info("Actual and Expected Window Title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Window Title not matched");
			test.info("Actual and Expected Window Title not matched");
			return false ;
		}
	}
	
	//21
	public boolean sequence (ExtentTest test) 
	{
		String actSequence = Utility.getText(sequence);
		logP().info("actual Sequence = " + actSequence);
		test.info("actual Sequence = " + actSequence);
		
		String expSequence = "Home Dashboard";
		logP().info("expected Sequence = " + expSequence);
		test.info("expected Sequence = " + expSequence);
		
		if(actSequence.equals(expSequence))
		{
			logP().info("Actual and Expected Sequence matched");
			test.info("Actual and Expected Sequence matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Sequence not matched");
			test.info("Actual and Expected Sequence not matched");
			return false ;
		}
	}
	
	//22
	public boolean courseHeadingExcel (ExtentTest test) throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseHeading);
		logP().info("Actual course Heading = " + actData);
		test.info("Actual course Heading = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 0 , 1 );
		logP().info("Expected course Heading = " + expData);
		test.info("Expected course Heading = " + expData);
		
		if(actData.equals(expData))
		{
			logP().info("Actual and Expected course Headings matched");
			test.info("Actual and Expected course Headings matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected course Headings not matched");
			test.info("Actual and Expected course Headings not matched");
			return false ;
		}
	}
	
	//23
	public boolean courseSubHeadingExcel (ExtentTest test) throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseSubHeading);
		logP().info("Actual course Sub Headings = " + actData);
		test.info("Actual course Sub Headings = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 1 , 1 );
		logP().info("Expected course Sub Headings = " + expData);
		test.info("Expected course Sub Headings = " + expData);
		
		if(actData.equals(expData))
		{
			logP().info("Actual and Expected course Sub Headings matched");
			test.info("Actual and Expected course Sub Headings matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected course Sub Headings not matched");
			test.info("Actual and Expected course Sub Headings not matched");
			return false ;
		}
	}
	
	public UsersPage navigateToUsersPg() 
	{
		Utility.click(users);
		return new UsersPage(driver);
	}
	
	public OperatorsPage navigateToOperatorsPg() 
	{
		Utility.click(operators);
		return new OperatorsPage(driver);
	}
	
	public UsefulLinksPage navigateToUsefulLinksPg() 
	{
		Utility.click(usefulLinks);
		return new UsefulLinksPage(driver);
	}
	
	public DownloadsPage navigateToDownloadsPg() 
	{
		Utility.click(downloads);
		return new DownloadsPage(driver);
	}
}
