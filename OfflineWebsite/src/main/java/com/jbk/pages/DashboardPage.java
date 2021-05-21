package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPgObjRepo;
import com.jbk.testbase.TestBase;
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
		String actualUrl = Utility.getCurrentUrl(driver);
		
		if(actualUrl.equals(expectedUrl))
			return true ;
		else
			return false ;
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		String actualTitle = Utility.getTitle(driver);
		
		if(actualTitle.equals(expectedTitle))
			return true ;
		else 
			return false ;	
	}
	
	//3
	public boolean cornerHeading() 
	{ 	
		String actCornerHeading = Utility.getText(cornerHead);
		String expCornerHeading = "Java By Kiran" ;
		
		if(actCornerHeading.equals(expCornerHeading))
			return true ;
		else 
			return false ;
	}
	
	//4
	public boolean mainHeading() 
	{
		String actMainHeading = Utility.getText(mainHead);
		TestBase.log.info("Utility.getText(mainHead)");
		String expMainHeading = "Dashboard Courses Offered" ;
		
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
		String expUserName = "Kiran" ;
		
		if(actUserName.equals(expUserName))
			return true ;
		else 
			return false ;
	}
	
	//7
	public boolean userStatus () 
	{
		String actUserStatus  = Utility.getText(userStatus);
		String expUserStatus  = "Online" ;
		
		if(actUserStatus.equals(expUserStatus))
			return true ;
		else 
			return false ;
	}
	
	//8
	public boolean navigationMenuText() 
	{	
		ArrayList <String> actNavigationMenuText = Utility.getListOfElements(navMenu);
		
		ArrayList <String>expNavigationMenuText =  Utility.dashboardPgNavMenu();
		
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
		String expTitle = "JavaByKiran | User" ;
				
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
		String expTitle = "JavaByKiran | Operators" ;
				
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
		String expTitle = "JavaByKiran | Useful Links" ;
				
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
		String expTitle = "JavaByKiran | Downloads" ;
				
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
		String expTitle = "JavaByKiran | Log in" ;
				
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
		String expTitle = "JavaByKiran | Log in" ;
		
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
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
			return true ;
		else 
			return false ;
	}
	
	//16
	public boolean coursesSubHeading () 
	{	
		ArrayList <String>actCoursesSubHeadings  = Utility.getListOfElements(courseSubHeading);
		
		ArrayList <String>expCoursesSubHeadings = new ArrayList <String>();
		expCoursesSubHeadings.add("Automation Testing");
		expCoursesSubHeadings.add("Software Development");		
		expCoursesSubHeadings.add("Data Science");
		expCoursesSubHeadings.add("Web Development");
		
		if(actCoursesSubHeadings.equals(expCoursesSubHeadings))
			return true ;
		else 
			return false ;
	 }
	
	//17
	public boolean coursesMoreInfo() 
	{	
		ArrayList <String>actMoreInfoTags  = Utility.getListOfElements(moreInfo);
		
		ArrayList <String>expMoreInfoTags = new ArrayList <String>();
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");		
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");

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
		
		ArrayList <String> actNewWindowUrls  = WindowHandlingUtility.getWindowsUrls(moreInfo, driver);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
			return true ;
		else 
			return false ;
	}
	
	//19
	public boolean footerStatement () 
	{
		String actfooter = Utility.getText(footer);
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
	
		if(actfooter.equals(expfooter))
			return true ;
		else 
			return false ;
	}
	
	//20
	public boolean jbk_Link () throws Exception 
	{	
		String actWindowTitle = WindowHandlingUtility.getWindowTitle(jbkLink, driver);
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
				
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
		String expSequence = "Home Dashboard";
		
		if(actSequence.equals(expSequence))
			return true ;
		else 
			return false ;
	}
	
	//22
	public boolean courseHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseHeading);
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 0 , 1 );
		
		if(actData.equals(expData))
			return true ;
		else 
			return false ;
	}
	
	//23
	public boolean courseSubHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseSubHeading);
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 1 , 1 );
		
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
