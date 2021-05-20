package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public boolean alTableHeadings()
	{
		ArrayList <String> actHeading = Utility.getListOfElements(headings);
		ArrayList <String> expHead = Utility.usersTableheadings();
	
		if(actHeading.equals(expHead))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean mobNoLength()
	{
		ArrayList<String>actData = Utility.getListLengthXYZ(mobCol, unameCol, 10);
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Monica");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;		
	}
	
	//3
	public boolean maleGender()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(genderCol, unameCol, "Male");
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Sagar");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;		
	}
	
	//4
	public boolean unameInOrder()
	{
		ArrayList <String>actData = Utility.getListOfElements(unameCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kimaya");
		expData.add("Kiran");
		expData.add("Monica");
		expData.add("Sagar");
		
		Collections.sort(actData);
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//5
	public boolean stateMaharashtra()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(stateCol, unameCol, "Maharashtra");
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Monica");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//6
	public boolean gmail_com()
	{
		ArrayList<String>actData = Utility.getListContainingXYZ(emailCol, unameCol, "@gmail.com");
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Sagar");
		expData.add("Monica");
		expData.add("Kimaya");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//7
	public boolean clickDeleteAlertMsg()
	{	
		String msg1 = "You can not delete Default User" ;
		String msg2 = "Are you sure you want to delete this user" ;
		
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add(msg1);
		expData.add(msg2);
		expData.add(msg1);
		expData.add(msg2);
		
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
				return true ;
			else 	
				return false ;
	}
	
	//8
	public boolean seleniumFaculty()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(courseCol, unameCol, "Selenium");
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Sagar");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//9
	public boolean toolTip()
	{
		ArrayList<String>actData = Utility.getToolTipsList(delete);
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//10
	public boolean CompleteUsersTable() throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Users");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}