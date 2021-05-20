package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DownloadsPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class DownloadsPage extends DownloadsPgObjRepo 
{
	WebDriver driver;
	
	public DownloadsPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean operatingSystem_32bit()
	{
		System.out.println("Actual Vendors having Operating System of 32 bit : ");
		
		ArrayList <String>actData = Utility.getListEqualsXYZ(lowBitCol, vendorCol, "32bit");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Java Development Kit (JDK)");
		expData.add("Google Chrome");
		expData.add("Mozilla Firefox");
		expData.add("Gecko Driver for Latest firefox");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean common()
	{
		System.out.println("Actual Vendors having Operating System common : ");
		
		ArrayList <String>actData = Utility.getListEqualsXYZ(commonCol, vendorCol, "Common");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Source Jar");
		expData.add("Google Chrome Driver");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//3
	public boolean none()
	{	
		System.out.println("Actual Vendors having none Operating System  : ");
		
		ArrayList <String>actData = Utility.getListContainingNoABC_and_NoXYZ(lowBitCol, commonCol, vendorCol , "32bit", "Common");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Standalon Jar");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//4
	public boolean completeDownloadsTable() throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Downloads");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}
