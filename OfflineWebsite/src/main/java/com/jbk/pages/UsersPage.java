package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsersPgObjRepo;

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
		ArrayList <String> actHead = new ArrayList <String>();
		
		ArrayList <String> expHead = new ArrayList <String>();
		expHead.add("#");
		expHead.add("Username"); 
		expHead.add("Email");
		expHead.add("Mobile");
		expHead.add("Course");
		expHead.add("Gender");
		expHead.add("State");
		expHead.add("Action");
		
		for (WebElement element : headings)
		{
			actHead.add(element.getText());
		}
		
		if(actHead.equals(expHead))
			return true ;
		else 	
			return false ;
	}
	
	//2
	public boolean mobNoLength()
	{
		int i=0 ;
		
		ArrayList<String>actData = new ArrayList<>();
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Monica");
		
		for(WebElement element : mobCol) 
		{
			String name = unameCol.get(i).getText();
			String number = element.getText();
			int mob = number.length();
			
			if (mob==10)
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;		
	}
	
	//3
	public boolean maleGender()
	{
		int i=0 ;
		
		ArrayList<String>actData = new ArrayList<>();
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Sagar");
		
		for(WebElement element : genderCol) 
		{
			String name = unameCol.get(i).getText();
			
			if (element.getText().equals("Male"))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;		
	}
	
	//4
	public boolean unameInOrder()
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kimaya");
		expData.add("Kiran");
		expData.add("Monica");
		expData.add("Sagar");
		
		for (WebElement element : unameCol)
		{
			String name = element.getText();
			
			actData.add(name);
		}
		
		Collections.sort(actData);
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//5
	public boolean stateMaharashtra()
	{
		int i=0 ;
		
		ArrayList<String>actData = new ArrayList<String>();
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Monica");
		
		for(WebElement element : stateCol)
		{
			String name = unameCol.get(i).getText();
		
			if (element.getText().equals("Maharashtra"))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;	
	}
	
	//6
	public boolean gmail_com()
	{
		int i=0 ;
		
		ArrayList<String>actData = new ArrayList<String>();
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Sagar");
		expData.add("Monica");
		expData.add("Kimaya");
		
		for(WebElement element : emailCol)
		{
			String name = unameCol.get(i).getText();
		
			if (element.getText().contains("@gmail.com"))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		
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
		int i=0 ;
		
		String expectedFaculty = "Sagar" ;
		String actualFaculty = null ;
		
		for(WebElement element : courseCol)
		{	
			String name = unameCol.get(i).getText();
			
			if (element.getText().equals("Selenium"))
			{
				System.out.println(name); 
				actualFaculty = name ;
			}
			i++ ;
		}
		
		if(actualFaculty.equals(expectedFaculty))
			return true ;
		else 	
			return false ;
	}
	
	//9
	public boolean toolTip()
	{
		List<WebElement> delete =driver.findElements(By.xpath("//span[text()='Delete']"));
		
		ArrayList<String>actData = new ArrayList<String>();
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		
		for(WebElement element : delete)
		{
			String msg = element.getAttribute("title");
			actData.add(msg);
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
	
	//10
	public boolean CompleteUsersTable() throws Exception
	{
		ArrayList <String>actData = new ArrayList <String>();
		
		ArrayList <String>expData = new ArrayList <String>();
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Users");
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
			String Data = element.getText();
			actData.add(Data);
		}
		
		for (WebElement element : tableData)
		{
			String Data = element.getText();
			actData.add(Data);
		}
		
		if(actData.equals(expData))
			return true ;
		else 	
			return false ;
	}
}