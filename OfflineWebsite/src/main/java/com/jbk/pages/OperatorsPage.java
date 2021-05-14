package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorsPgObjRepo;

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
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
		
		System.out.println("Faculties having 10 digit Mobile No. : ");
	
		int i=0 ;
		
		for (WebElement element : contactCol)
		{
			String contact = element.getText();
			
			if (contact.length()==10)
			{
				String faculty = personCol.get(i).getText();
				System.out.println(faculty);
				actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean namesInAlphabeticalOrder()
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Darshit");
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		for (WebElement element : personCol)
		{
			String name = element.getText();
			
			actData.add(name);
		}
		
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
	  	ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
		
		System.out.println("Faculties available on WhatsApp : ");
	
		int i=0 ;
		
		for (WebElement element : prefferedWayToConnectCol)
		{
			String contact = element.getText();
			
			if (contact.contains("Whats App"))
			{
				String faculty = personCol.get(i).getText();
				System.out.println(faculty);
				actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//4
	public boolean prefferedWayToConnect_PhoneCall()
	{	
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		System.out.println("Faculties available on Phone Call : ");
	
		int i=0 ;
		
		for (WebElement element : prefferedWayToConnectCol)
		{
			String contact = element.getText();
			
			if (contact.contains("Phone Call"))
			{
				String faculty = personCol.get(i).getText();
				System.out.println(faculty);
				actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//5
	public boolean prefferedWayToConnect_WhatsApp_And_PhoneCall()
	{	
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		System.out.println("Faculties available on both WhatsApp & Phone Call : ");
	
		int i=0 ;
		
		for (WebElement element : prefferedWayToConnectCol)
		{
			String contact = element.getText();
			
			if (contact.contains("Whats App") && contact.contains("Phone Call"))
			{
					String faculty = personCol.get(i).getText();
					System.out.println(faculty);
					actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//6
	public boolean prefferedWayToConnect_WhatsApp_ButNot_PhoneCall ()
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Darshit");
		
		System.out.println("Faculties available on WhatsApp but not on Phone Call : ");
	
		int i=0 ;
		
		for (WebElement element : prefferedWayToConnectCol)
		{
			String contact = element.getText();
			
			if (contact.contains("Whats App"))
			{
				if (!contact.contains("Phone Call"))
				{
					String faculty = personCol.get(i).getText();
					System.out.println(faculty);
					actData.add(faculty);
				}
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//7
	public boolean facultiesAvailableOnMonday ()
	{	
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		
		System.out.println("Faculties available on Monday : ");
		
		int i=0 ;
		
		for (WebElement element : timingsCol)
		{
			String days = element.getText();
			
			if (days.contains("Monday"))
			{
				String faculty = personCol.get(i).getText();
				System.out.println(faculty);
				actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//8
	public boolean facultiesNotAvailableOnSunday ()
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		
		System.out.println("Faculties not available on Sunday : ");
		
		int i=0 ;
		
		for (WebElement element : timingsCol)
		{
			String days = element.getText();
			
			if (!days.contains("Sunday"))
			{
				String faculty = personCol.get(i).getText();
				System.out.println(faculty);
				actData.add(faculty);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//9
	public boolean CompleteOperatorsTable () throws Exception
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Operators");
		int row=sh.getPhysicalNumberOfRows();
		
		for (int i = 0; i < row; i++) 
		{
			int col=sh.getRow(i).getLastCellNum();
			for (int j = 0; j <col; j++) 
			{
				Cell cell=sh.getRow(i).getCell(j);
				DataFormatter df=new DataFormatter();
				value=df.formatCellValue(cell);
				expData.add(value);
			}
		}
		
		for (WebElement element : headings)
		{
			String data = element.getText();
			actData.add(data);
		}
		
		for (WebElement element : tableData)
		{
			String data = element.getText();
			actData.add(data);
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}
