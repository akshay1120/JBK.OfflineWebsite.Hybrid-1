package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.OperatorsPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class OperatorsPage extends OperatorsPgObjRepo
{
	WebDriver driver;
	
	public OperatorsPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean contactNoLength(ExtentTest test)
	{	
		System.out.println("Actual Faculties having 10 digit Mobile No. : ");
		
		ArrayList <String>actData = Utility.getListLengthXYZ(contactCol, personCol, 10);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	public boolean namesInAlphabeticalOrder(ExtentTest test)
	{
		ArrayList <String>actData = Utility.getListOfElements(personCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Darshit");
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		logP().info("Expected List = " + expData);
		test.info("Expected List = " + expData);
		
		Collections.sort(actData);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		/*System.out.println(actData);
		
		for (String i : actData)
		{
			System.out.println(i);
		}*/
		
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
	public boolean prefferedWayToConnect_WhatsApp(ExtentTest test)
	{	
		System.out.println("Actual Faculties available on WhatsApp : ");
		
	  	ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Whats App");
	  	logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	
	//4
	public boolean prefferedWayToConnect_PhoneCall(ExtentTest test)
	{	
		System.out.println("Actual Faculties available on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Phone Call");
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
	
	//5
	public boolean prefferedWayToConnect_WhatsApp_And_PhoneCall(ExtentTest test)
	{	
		System.out.println("Actual Faculties available on both WhatsApp & Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_and_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
	
	//6
	public boolean prefferedWayToConnect_WhatsApp_ButNot_PhoneCall (ExtentTest test)
	{
		System.out.println("Actual Faculties available on WhatsApp but not on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_not_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Darshit");
		logP().info("Expected List = " + expData);
		test.info("Expected List = " + expData);
		
		System.out.println("Faculties available on WhatsApp but not on Phone Call : ");
		
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
	
	//7
	public boolean facultiesAvailableOnMonday (ExtentTest test)
	{	
		System.out.println("Actual Faculties available on Monday : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(timingsCol, personCol, "Monday");
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
	
	//8
	public boolean facultiesNotAvailableOnSunday (ExtentTest test)
	{
		System.out.println("Actual Faculties not available on Sunday : ");
		
		ArrayList <String>actData = Utility.getListNotContainingXYZ(timingsCol, personCol, "Sunday");
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
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
	
	//9
	public boolean CompleteOperatorsTable (ExtentTest test) throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		logP().info("Actual List = " + actData);
		test.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Operators");
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
