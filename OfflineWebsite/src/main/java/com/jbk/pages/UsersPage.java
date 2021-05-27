package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.UsersPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class UsersPage extends UsersPgObjRepo
{
	WebDriver driver;
	
	public UsersPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean alTableHeadings(ExtentTest test)
	{
		ArrayList <String> actHeading = Utility.getListOfElements(headings);
		logP().info("Actual List of Headings = " + actHeading);
		test.info("Actual List of Headings = " + actHeading);
		
		ArrayList <String> expHead = Utility.usersTableheadings();
		logP().info("Expected List of Headings = " + expHead);
		test.info("Expected List of Headings = " + expHead);
		
		if(actHeading.equals(expHead))
		{
			logP().info("Actual and Expected list of Headings matched");
			test.info("Actual and Expected list of Headings matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected list of Headings not matched");
			test.info("Actual and Expected list of Headings not matched");
			return false ;
		}
	}
	
	//2
	public boolean mobNoLength(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getListLengthXYZ(mobCol, unameCol, 10);
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Monica");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}		
	}
	
	//3
	public boolean maleGender(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(genderCol, unameCol, "Male");
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Sagar");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}	
	}
	
	//4
	public boolean unameInOrder(ExtentTest test)
	{
		ArrayList <String>actData = Utility.getListOfElements(unameCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kimaya");
		expData.add("Kiran");
		expData.add("Monica");
		expData.add("Sagar");
		logP().info("");
		test.info("");
		
		Collections.sort(actData);
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	//5
	public boolean stateMaharashtra(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(stateCol, unameCol, "Maharashtra");
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Monica");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	//6
	public boolean gmail_com(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getListContainingXYZ(emailCol, unameCol, "@gmail.com");
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Sagar");
		expData.add("Monica");
		expData.add("Kimaya");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	//7
	public boolean clickDeleteAlertMsg(ExtentTest test)
	{	
		String msg1 = "You can not delete Default User" ;
		String msg2 = "Are you sure you want to delete this user" ;
		
		ArrayList <String>actData = new ArrayList <String>();
		logP().info("");
		test.info("");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add(msg1);
		expData.add(msg2);
		expData.add(msg1);
		expData.add(msg2);
		logP().info("");
		test.info("");
		
		actionCol.get(0).click();
		Alert al = driver.switchTo().alert();
        String Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.accept();
        
        actionCol.get(1).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.dismiss();
        
        actionCol.get(2).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.accept();
        
        actionCol.get(3).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.dismiss();
        
			if(actData.equals(expData))
			{
				logP().info("");
				test.info("");
				return true ;
			}
			else
			{
				logP().info("");
				test.info("");
				return false ;
			}
	}
	
	//8
	public boolean seleniumFaculty(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(courseCol, unameCol, "Selenium");
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Sagar");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	//9
	public boolean toolTip(ExtentTest test)
	{
		ArrayList<String>actData = Utility.getToolTipsList(delete);
		logP().info("");
		test.info("");
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	//10
	public boolean CompleteUsersTable(ExtentTest test) throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		logP().info("");
		test.info("");
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Users");
		logP().info("");
		test.info("");
		
		if(actData.equals(expData))
		{
			logP().info("");
			test.info("");
			return true ;
		}
		else
		{
			logP().info("");
			test.info("");
			return false ;
		}
	}
	
	public AddUserPage navigateToAddUserPg() 
	{
		Utility.click(addUserBtn);
		return new AddUserPage(driver);
	}
}