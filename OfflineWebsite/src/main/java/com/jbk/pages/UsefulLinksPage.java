package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsefulLinksPgObjRepo;

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
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Live Videos | javabyKiran");
		expData.add("Page not found | javabyKiran");
	
		String parent = driver.getWindowHandle();
		
		for (WebElement element : clickCol)
		{
			element.click();
			Thread.sleep(5000);
		}
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actData.add(driver.getTitle());
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//2
	public boolean clickGoExcel() throws Exception 
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("GoLinks");
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
		String parent = driver.getWindowHandle();
		
		for (WebElement element : clickCol)
		{
			element.click();
			Thread.sleep(5000);
		}
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actData.add(driver.getTitle());
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//3
	public boolean complete_UsefulLinksTable() throws Exception 
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("UsefulLinks");
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
		
		for (WebElement element : tableHead)
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