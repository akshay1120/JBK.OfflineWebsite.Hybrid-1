package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public boolean url()
	{	
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/dashboard.html" ; 
		logP().info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		logP().info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
			return true ;
		else
			return false ;
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		logP().info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
			return true ;
		else 
			return false ;	
	}
	
	//3
	public boolean cornerHeading() 
	{ 	
		String actCornerHeading = Utility.getText(cornerHead);
		logP().info("actual Corner Heading = " + actCornerHeading);
		
		String expCornerHeading = "Java By Kiran" ;
		logP().info("expected Corner Heading = " + expCornerHeading);
		
		if(actCornerHeading.equals(expCornerHeading))
			return true ;
		else 
			return false ;
	}
	
	//4
	public boolean mainHeading() 
	{
		String actMainHeading = Utility.getText(mainHead);
		logP().info("actual Main Heading = " + actMainHeading);
		
		String expMainHeading = "Dashboard Courses Offered" ;
		logP().info("expected Main Heading = " + expMainHeading);
		
		if(actMainHeading.equals(expMainHeading))
			return true ;
		else 
			return false ;
	}
	
	//5
	public boolean userImage() 
	{	
		if(Utility.displayed(userImg)==true)
			return true ;
		else
			return false ;
	}
	
	//6
	public boolean userName () 
	{
		String actUserName = Utility.getText(userName);
		logP().info("actual User Name = " + actUserName);
		
		String expUserName = "Kiran" ;
		logP().info("expected User Name = " + expUserName);
		
		if(actUserName.equals(expUserName))
			return true ;
		else 
			return false ;
	}
	
	//7
	public boolean userStatus () 
	{
		String actUserStatus  = Utility.getText(userStatus);
		logP().info("actual User Status = " + actUserStatus);
		
		String expUserStatus  = "Online" ;
		logP().info("expected User Status = " + expUserStatus);
		
		if(actUserStatus.equals(expUserStatus))
			return true ;
		else 
			return false ;
	}
	
	//8
	public boolean navigationMenuText() 
	{	
		ArrayList <String> actNavigationMenuText = Utility.getListOfElements(navMenu);
		logP().info("actual Navigation Menu Texts = " + actNavigationMenuText);
		
		ArrayList <String>expNavigationMenuText =  Utility.dashboardPgNavMenu();
		logP().info("expected Navigation Menu Text = " + expNavigationMenuText);
		
		if(actNavigationMenuText.equals(expNavigationMenuText))
			return true ;
		else 	
			return false ;
	}
	
	//9
	public boolean usersMenu() 
	{
		Utility.click(users);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual users Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | User" ;
		logP().info("expected users Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
			return true ;
		else 
			return false ;
	}
	
	//10
	public boolean operatorsMenu () 
	{
		Utility.click(operators);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual operators Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Operators" ;
		logP().info("expected operators Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
			return true ;
		else 
			return false ;
	}
	
	//11
	public boolean usefulLinksMenu() 
	{
		Utility.click(usefulLinks);
		
		String actTitle =  Utility.getTitle(driver);
		logP().info("actual useful Links Menu Title " + actTitle);
		
		String expTitle = "JavaByKiran | Useful Links" ;
		logP().info("expected useful Links Menu Title " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
			return true ;
		else 
			return false ;
	}
	
	
	//12
	public boolean downloadsMenu () 
	{
		Utility.click(downloads);
		
		String actTitle = Utility.getTitle(driver);
		logP().info("actual downloads Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Downloads" ;
		logP().info("expected downloads Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
			return true ;
		else
			return false ;
	}
	
	//13
	public boolean leftCornerLogOutMenu() 
	{
		Utility.click(leftLgOut);
		
		String actTitle = Utility.getTitle(driver);
		logP().info(" ");
		
		String expTitle = "JavaByKiran | Log in" ;
		logP().info(" ");
		
		Utility.sendkeys(uname, "kiran@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
		
		if(actTitle.equals(expTitle))
			return true ;
		else 
			return false ;
	}
	
	//14
	public boolean verifyRightCornerLogOutLink() 
	{
		Utility.click(rightLgOut);
		
		String actTitle = Utility.getTitle(driver);
		logP().info(" ");
		
		String expTitle = "JavaByKiran | Log in" ;
		logP().info(" ");
		
		Utility.sendkeys(uname, "kiran@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
				
		if(actTitle.equals(expTitle))
			return true ;
		else 
			return false ;
	}
	
	//15
	public boolean coursesHeading () 
	{
		ArrayList <String>actCoursesHeadings  = Utility.getListOfElements(courseHeading);
		logP().info(" ");
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		logP().info(" ");
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
			return true ;
		else 
			return false ;
	}
	
	//16
	public boolean coursesSubHeading () 
	{	
		ArrayList <String>actCoursesSubHeadings  = Utility.getListOfElements(courseSubHeading);
		logP().info(" ");
		
		ArrayList <String>expCoursesSubHeadings = new ArrayList <String>();
		expCoursesSubHeadings.add("Automation Testing");
		expCoursesSubHeadings.add("Software Development");		
		expCoursesSubHeadings.add("Data Science");
		expCoursesSubHeadings.add("Web Development");
		logP().info(" ");
		
		if(actCoursesSubHeadings.equals(expCoursesSubHeadings))
			return true ;
		else 
			return false ;
	 }
	
	//17
	public boolean coursesMoreInfo() 
	{	
		ArrayList <String>actMoreInfoTags  = Utility.getListOfElements(moreInfo);
		logP().info(" ");
		
		ArrayList <String>expMoreInfoTags = new ArrayList <String>();
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");		
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");
		logP().info(" ");
		
		if(actMoreInfoTags.equals(expMoreInfoTags))
			return true ;
		else 
			return false ;
	}
	
	//18
	public boolean moreInfoNewWindow () throws Exception 
	{	
		ArrayList <String> expNewWindowUrls = new ArrayList <String>();
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/examples/dashboard.html#");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/python-syllabus.pdf");		
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/selenium-testing-syllabus-jbk.pdf");
		logP().info(expNewWindowUrls);
		
		ArrayList <String> actNewWindowUrls  = WindowHandlingUtility.getWindowsUrls(moreInfo);
		logP().info(actNewWindowUrls);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
			return true ;
		else 
			return false ;
	}
	
	//19
	public boolean footerStatement () 
	{
		String actfooter = Utility.getText(footer);
		logP().info(" ");
		
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
		logP().info(" ");
		
		if(actfooter.equals(expfooter))
			return true ;
		else 
			return false ;
	}
	
	//20
	public boolean jbk_Link () throws Exception 
	{	
		String actWindowTitle = WindowHandlingUtility.getWindowTitle(jbkLink);
		logP().info(" ");
		
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
		logP().info(" ");
		
		if(actWindowTitle.equals(expWindowTitle))
			return true ;
		else 
			System.out.println("New window title is not matched");
			return false ;
	}
	
	//21
	public boolean sequence () 
	{
		String actSequence = Utility.getText(sequence);
		logP().info(" ");
		
		String expSequence = "Home Dashboard";
		logP().info(" ");
		
		if(actSequence.equals(expSequence))
			return true ;
		else 
			return false ;
	}
	
	//22
	public boolean courseHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseHeading);
		logP().info(" ");
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 0 , 1 );
		logP().info(" ");
		
		if(actData.equals(expData))
			return true ;
		else 
			return false ;
	}
	
	//23
	public boolean courseSubHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseSubHeading);
		logP().info(" ");
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 1 , 1 );
		logP().info(" ");
		
		if(actData.equals(expData))
			return true ;
		else 
			return false ;
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
