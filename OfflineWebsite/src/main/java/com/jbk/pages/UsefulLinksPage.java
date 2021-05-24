package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public boolean clickGO() throws Exception
	{
		ArrayList<String>actData = WindowHandlingUtility.getWindowsTitles(clickCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Live Videos | javabyKiran");
		expData.add("Page not found | javabyKiran");
	
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//2
	public boolean clickGoExcel() throws Exception 
	{
		ArrayList <String>actData = WindowHandlingUtility.getWindowsTitles(clickCol);;
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx", "GoLinks", 0, 0);
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//3
	public boolean complete_UsefulLinksTable() throws Exception 
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(tableHead, tableData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "UsefulLinks");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}