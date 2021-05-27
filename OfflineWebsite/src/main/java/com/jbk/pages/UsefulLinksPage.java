package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.UsefulLinksPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;
import com.utility.WindowHandlingUtility;

public class UsefulLinksPage extends UsefulLinksPgObjRepo
{
	WebDriver driver;
	
	public UsefulLinksPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean clickGO(ExtentTest test) throws Exception
	{
		ArrayList<String>actData = WindowHandlingUtility.getWindowsTitles(driver , clickCol);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Live Videos | javabyKiran");
		expData.add("Page not found | javabyKiran");
		logP().info("Expected List = " + expData);
		test.info("Expected List = " + expData);
		
		if(actData.equals(expData))
		{
			logP().info("Actual and Expected list matched");
			test.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected list not matched");
			test.info("Actual and Expected list not matched");
			return false ;
		}		
	}
	
	//2
	public boolean clickGoExcel(ExtentTest test) throws Exception 
	{
		ArrayList <String>actData = WindowHandlingUtility.getWindowsTitles(driver , clickCol);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx", "GoLinks", 0, 0);
		logP().info("Expected List = " + expData);
		test.info("Expected List = " + expData);
		
		if(actData.equals(expData))
		{
			logP().info("Actual and Expected list matched");
			test.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected list not matched");
			test.info("Actual and Expected list not matched");
			return false ;
		}		
	}
	
	//3
	public boolean complete_UsefulLinksTable(ExtentTest test) throws Exception 
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(tableHead, tableData);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "UsefulLinks");
		logP().info("Expected List = " + expData);
		test.info("Expected List = " + expData);
		
		if(actData.equals(expData))
		{
			logP().info("Actual and Expected list matched");
			test.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected list not matched");
			test.info("Actual and Expected list not matched");
			return false ;
		}		
	}
}