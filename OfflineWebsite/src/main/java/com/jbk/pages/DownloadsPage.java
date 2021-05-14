package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DownloadsPgObjRepo;

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
		int i=0 ;
		
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Java Development Kit (JDK)");
		expData.add("Google Chrome");
		expData.add("Mozilla Firefox");
		expData.add("Gecko Driver for Latest firefox");
		
		System.out.println("Vendors having Operating System of 32 bit : ");
		
		for (WebElement element : lowBitCol )
		{
			String low = element.getText();
			
			if (low.equals("32bit"))
			{
				String vname = vendorCol.get(i).getText();
				System.out.println(vname);
				actData.add(vname);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean common()
	{
		int i=0 ;
		
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Source Jar");
		expData.add("Google Chrome Driver");
		
		System.out.println("Vendors having Operating System common : ");
		
		for (WebElement element : commonCol )
		{
			String com = element.getText();
			
			if (com.equals("Common"))
			{
				String vname = vendorCol.get(i).getText();
				System.out.println(vname);
				actData.add(vname);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//3
	public boolean none()
	{	
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Standalon Jar");
		
		System.out.println("Vendors having none Operating System  : ");
		
		for (int i=0 ; i<lowBitCol.size() ; i++ )
		{
			if (!lowBitCol.get(i).getText().equals("32bit") && !commonCol.get(i).getText().equals("Common"))
			{
				String vname = vendorCol.get(i).getText();
				System.out.println(vname);
				actData.add(vname);
			}
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//4
	public boolean completeDownloadsTable() throws Exception
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Downloads");
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
			//System.out.println(data);
		}
		
		for (WebElement element : tableData)
		{
			String data = element.getText();
			actData.add(data);
			//System.out.println(data);
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}
