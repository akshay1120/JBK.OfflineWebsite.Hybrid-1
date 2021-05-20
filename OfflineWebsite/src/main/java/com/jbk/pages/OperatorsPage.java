package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public boolean contactNoLength()
	{	
		System.out.println("Actual Faculties having 10 digit Mobile No. : ");
		
		ArrayList <String>actData = Utility.getListLengthXYZ(contactCol, personCol, 10);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean namesInAlphabeticalOrder()
	{
		ArrayList <String>actData = Utility.getListOfElements(personCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Darshit");
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		Collections.sort(actData);
		
		/*System.out.println(actData);
		
		for (String i : actData)
		{
			System.out.println(i);
		}*/
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	
	//3
	public boolean prefferedWayToConnect_WhatsApp()
	{	
		System.out.println("Actual Faculties available on WhatsApp : ");
		
	  	ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Whats App");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//4
	public boolean prefferedWayToConnect_PhoneCall()
	{	
		System.out.println("Actual Faculties available on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Phone Call");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//5
	public boolean prefferedWayToConnect_WhatsApp_And_PhoneCall()
	{	
		System.out.println("Actual Faculties available on both WhatsApp & Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_and_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//6
	public boolean prefferedWayToConnect_WhatsApp_ButNot_PhoneCall ()
	{
		System.out.println("Actual Faculties available on WhatsApp but not on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_not_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Darshit");
		
		System.out.println("Faculties available on WhatsApp but not on Phone Call : ");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//7
	public boolean facultiesAvailableOnMonday ()
	{	
		System.out.println("Actual Faculties available on Monday : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(timingsCol, personCol, "Monday");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//8
	public boolean facultiesNotAvailableOnSunday ()
	{
		System.out.println("Actual Faculties not available on Sunday : ");
		
		ArrayList <String>actData = Utility.getListNotContainingXYZ(timingsCol, personCol, "Sunday");
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//9
	public boolean CompleteOperatorsTable () throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Operators");
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}
