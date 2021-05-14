package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.objectRepository.AddUserPgObjRepo;

public class AddUserPage extends AddUserPgObjRepo
{
	WebDriver driver;
	
	public AddUserPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean printingDragDownOptions()
	{
		ArrayList <String> actDragDownOptions = new ArrayList <String>();
		
		ArrayList <String> expDragDownOptions  = new ArrayList <String>();
		expDragDownOptions.add("--Select State--");
		expDragDownOptions.add("Maharashtra");
		expDragDownOptions.add("Delhi");
		expDragDownOptions.add("HP");
		expDragDownOptions.add("Punjab");
		
		Select selectstate = new Select(selectState);
		
		List <WebElement> list = selectstate.getOptions();
		
		for(WebElement element : list)
		{
			actDragDownOptions.add(element.getText());
			System.out.println(element.getText());
		}
		
		if(actDragDownOptions.equals(expDragDownOptions))
			return true ;
		else
			return false ;
	}
	
	//2
	public boolean printingDragDownOptExcel() throws Exception
	{
		ArrayList <String> actDragDownOptions1 = new ArrayList <String>();
		
		ArrayList <String> expDragDownOptions1  = new ArrayList <String>();
		
		Select selectstates = new Select(selectState);
		
		List <WebElement> list = selectstates.getOptions();
		
		for(WebElement element : list)
		{
			actDragDownOptions1.add(element.getText());
			System.out.println(element.getText());
		}
		
		String value=null;
		FileInputStream fis = new FileInputStream("Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("DragDown");
		int row=sh.getPhysicalNumberOfRows();
		
		for (int i=0 ; i<row ; i++) 
		{
			int col=sh.getRow(i).getLastCellNum();
			for (int j=0; j<col ; j++) 
			{
				Cell cell=sh.getRow(i).getCell(j);
				DataFormatter df=new DataFormatter();
				value=df.formatCellValue(cell);
				expDragDownOptions1.add(value);
			}
		}
		
		if(actDragDownOptions1.equals(expDragDownOptions1))
			return true ;
		else
			return false ;
	}
	
	//3
	public boolean validAddUser()
	{
		userName.sendKeys("ASJ");
		mobile.sendKeys("94000000000");
		email.sendKeys("aj@gmail.com");
		course.sendKeys("Java");
		genderMale.click();
		maharashtra.click();;
		pass.sendKeys("asdfg");
		submitBtn.click();
		
		Alert al = driver.switchTo().alert();
		String actMsg = al.getText();
		al.accept();
		
		String expMsg = "User Added Successfully. You can not see added user.";
		
		if(actMsg.equals(expMsg))
			return true ;
		else
			return false ;
	}
}
