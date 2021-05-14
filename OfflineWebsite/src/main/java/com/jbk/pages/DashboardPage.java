package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPgObjRepo;

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
		String actualUrl = driver.getCurrentUrl() ;
		
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is matched");
			return true ;
		}
		else
		{
			System.out.println("Url is not matched");
			return false ;
		}
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		String actualTitle = driver.getTitle() ;
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is matched");
			return true ;
		}
		else 
		{
			System.out.println("Title not matched");
			return false ;
		}		
	}
	
	//3
	public boolean cornerHeading() 
	{ 	
		String actCornerHeading = cornerHead.getText();
		String expCornerHeading = "Java By Kiran" ;
		
		if(actCornerHeading.equals(expCornerHeading))
		{
			System.out.println("Corner Heading is matched");
			return true ;
		}
		else 
		{
			System.out.println("Corner Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading() 
	{
		String actMainHeading = mainHead.getText();
		String expMainHeading = "Dashboard Courses Offered" ;
		
		if(actMainHeading.equals(expMainHeading))
		{
			System.out.println("Main Heading is matched");
			return true ;
		}
		else 
		{
			System.out.println("Main Heading not matched");
			return false ;
		}
	}
	
	//5
	public boolean userImage() 
	{	
		if(userImg.isDisplayed()==true)
		{
			System.out.println("User Image is displayed");
			return true ;
		}
		else
		{
			System.out.println("User Image is not displayed");
			return false ;
		}
	}
	
	//6
	public boolean userName () 
	{
		String actUserName = userName.getText();
		String expUserName = "Kiran" ;
		
		if(actUserName.equals(expUserName))
		{
			System.out.println("User Name is matched");
			return true ;
		}
		else 
		{
			System.out.println("User Name not matched");
			return false ;
		}
	}
	
	//7
	public boolean userStatus () 
	{
		String actUserStatus  = userStatus.getText();
		String expUserStatus  = "Online" ;
		
		if(actUserStatus.equals(expUserStatus))
		{
			System.out.println("User Status is matched");
			return true ;
		}
		else 
		{
			System.out.println("User Status not matched");
			return false ;
		}
	}
	
	//8
	public boolean verifyNavigationMenuText() 
	{	
		ArrayList <String> actNavigationMenuText = new ArrayList <String>();
		
		ArrayList <String> expNavigationMenuText = new ArrayList <String>();
		expNavigationMenuText.add("Dashboard");
		expNavigationMenuText.add("Users"); 
		expNavigationMenuText.add("Operators");
		expNavigationMenuText.add("Useful Links");
		expNavigationMenuText.add("Downloads");
		expNavigationMenuText.add("Logout");
		
		for (WebElement element : navMenu)
		{
			actNavigationMenuText.add(element.getText());
		}
		
		if(actNavigationMenuText.equals(expNavigationMenuText))
		{
			System.out.println("User Status is matched");
			return true ;
		}
		else 
		{
			System.out.println("User Status not matched");
			return false ;
		}
	}
	
	//9
	public boolean usersMenu() 
	{
		users.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | User" ;
				
		dashboard.click();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Users Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("Users Menu is not working properly");
			return false ;
		}
	}
	
	//10
	public boolean operatorsMenu () 
	{
		operators.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Operators" ;
				
		dashboard.click();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Operators Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("Operators Menu is not working properly");
			return false ;
		}
	}
	
	//11
	public boolean usefulLinksMenu() 
	{
		usefulLinks.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Useful Links" ;
				
		dashboard.click();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("UsefulLinks Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("UsefulLinks Menu is not working properly");
			return false ;
		}
	}
	
	
	//12
	public boolean downloadsMenu () 
	{
		downloads.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Downloads" ;
				
		dashboard.click();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Downloads Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("Downloads Menu is not working properly");
			return false ;
		}
	}
	
	//13
	public boolean leftCornerLogOutMenu() 
	{
		leftLgOut.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log in" ;
				
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		lgnBtn.click();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Left Corner LogOut Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("Left Corner LogOut Menu is not working properly");
			return false ;
		}
	}
	
	//14
	public boolean verifyRightCornerLogOutLink() 
	{
		rightLgOut.click();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log in" ;
		
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		lgnBtn.click();
				
		if(actTitle.equals(expTitle))
		{
			System.out.println("Right Corner LogOut Menu is working properly");
			return true ;
		}
		else 
		{
			System.out.println("Right Corner LogOut Menu is not working properly");
			return false ;
		}
	}
	
	//15
	public boolean coursesHeading () 
	{
		ArrayList <String>actCoursesHeadings  = new ArrayList <String>();
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		
		for (WebElement element : courseHeading)
		{
			actCoursesHeadings.add(element.getText());
		}
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
		{
			System.out.println("All course headings are matched");
			return true ;
		}
		else 
		{
			System.out.println("Course headings are not matched");
			return false ;
		}
	}
	
	//16
	public boolean coursesSubHeading () 
	{	
		ArrayList <String>actCoursesSubHeadings  = new ArrayList <String>();
		
		ArrayList <String>expCoursesSubHeadings = new ArrayList <String>();
		expCoursesSubHeadings.add("Automation Testing");
		expCoursesSubHeadings.add("Software Development");		
		expCoursesSubHeadings.add("Data Science");
		expCoursesSubHeadings.add("Web Development");
		
		for (WebElement element : courseSubHeading)
		{
			actCoursesSubHeadings.add(element.getText());
		}
		
		if(actCoursesSubHeadings.equals(expCoursesSubHeadings))
		{
			System.out.println("All course subheadings are matched");
			return true ;
		}
		else 
		{
			System.out.println("Course subheadings are not matched");
			return false ;
		}
	 }
	
	//17
	public boolean coursesMoreInfo() 
	{	
		ArrayList <String>actMoreInfoTags  = new ArrayList <String>();
		
		ArrayList <String>expMoreInfoTags = new ArrayList <String>();
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");		
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");
		
		for (WebElement element : moreInfo)
		{
			actMoreInfoTags.add(element.getText());
		}

		if(actMoreInfoTags.equals(expMoreInfoTags))
		{
			System.out.println("All MoreInfoTags text are matched");
			return true ;
		}
		else 
		{
			System.out.println("All MoreInfoTags text are not matched");
			return false ;
		}
	}
	
	//18
	public boolean moreInfoNewWindow () throws Exception 
	{	
		Set <String> actNewWindowUrls  = new HashSet <String>();
		
		Set <String> expNewWindowUrls = new HashSet <String>();
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/examples/dashboard.html#");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/python-syllabus.pdf");		
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/selenium-testing-syllabus-jbk.pdf");
		
		String parent = driver.getWindowHandle();
		
		for (WebElement element : moreInfo)
		{
			element.click();
		}
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actNewWindowUrls.add(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
		{
			System.out.println("All New Windows url are matched");
			return true ;
		}
		else 
		{
			System.out.println("All New Windows url are not matched");
			return false ;
		}
	}
	
	//19
	public boolean footerStatement () 
	{
		String actfooter = footer.getText();
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
	
		if(actfooter.equals(expfooter))
		{
			System.out.println("Footer Statement is matched");
			return true ;
		}
		else 
		{
			System.out.println("Footer Statement is not matched");
			return false ;
		}
	}
	
	//20
	public boolean jbk_Link () throws InterruptedException 
	{
		String parent = driver.getWindowHandle();
		
		jbkLink.click();
		Thread.sleep(10000);
		
		Set <String> allWindows = driver.getWindowHandles();
		
		String actWindowTitle = null ;
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actWindowTitle = driver.getTitle();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		if(actWindowTitle.equals(expWindowTitle))
		{
			System.out.println("New window title is matched");
			return true ;
		}
		else 
		{
			System.out.println("New window title is not matched");
			return false ;
		}
	}
	
	//21
	public boolean sequence () 
	{
		String actSequence = sequence.getText();
		String expSequence = "Home Dashboard";
		
		if(actSequence.equals(expSequence))
		{
			System.out.println("Sequence text is matched");
			return true ;
		}
		else 
		{
			System.out.println("Sequence text is not matched");
			return false ;
		}
	}
	
	//22
	public boolean courseHeadingExcel () throws Exception
	{
		ArrayList <String>actData = new ArrayList <String>();
		ArrayList <String>expData = new ArrayList <String>();
		
		for (WebElement element : courseHeading)
		{
			actData.add(element.getText());
		}
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Dashboard");
		int row=sh.getPhysicalNumberOfRows();
		
		for (int i=1 ; i<row ; i++) 
		{
			int col=sh.getRow(i).getLastCellNum();
			for (int j=0; j<col-2 ; j++) 
			{
				Cell cell=sh.getRow(i).getCell(j);
				DataFormatter df=new DataFormatter();
				value=df.formatCellValue(cell);
				expData.add(value);
			}
		}
		
		if(actData.equals(expData))
			return true ;
		else 
			return false ;
	}
	
	//23
	public boolean courseSubHeadingExcel () throws Exception
	{
		ArrayList <String>actData = new ArrayList <String>();
		ArrayList <String>expData = new ArrayList <String>();
		
		for (WebElement element : courseSubHeading)
		{
			actData.add(element.getText());
		}
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Dashboard");
		int row=sh.getPhysicalNumberOfRows();
		
		for (int i=1 ; i<row ; i++) 
		{
			int col=sh.getRow(i).getLastCellNum();
			for (int j=1; j<col-1 ; j++) 
			{
				Cell cell=sh.getRow(i).getCell(j);
				DataFormatter df=new DataFormatter();
				value=df.formatCellValue(cell);
				expData.add(value);
			}
		}
		
		if(actData.equals(expData))
			return true ;
		else 
			return false ;
	}
}
