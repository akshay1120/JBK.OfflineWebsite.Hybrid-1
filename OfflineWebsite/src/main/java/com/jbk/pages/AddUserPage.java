package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.objectRepository.AddUserPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

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
		ArrayList <String> expDragDownOptions  = new ArrayList <String>();
		expDragDownOptions.add("--Select State--");
		expDragDownOptions.add("Maharashtra");
		expDragDownOptions.add("Delhi");
		expDragDownOptions.add("HP");
		expDragDownOptions.add("Punjab");
		
		Select selectstate = new Select(selectState);
		
		List <WebElement> list = selectstate.getOptions();
		
		ArrayList <String> actDragDownOptions = Utility.getListOfElements(list);
		
		if(actDragDownOptions.equals(expDragDownOptions))
			return true ;
		else
			return false ;
	}
	
	//2
	public boolean printingDragDownOptExcel() throws Exception
	{
		ArrayList <String> expDragDownOptions  = ExcelUtility.getTableColData("Data.xlsx", "DragDown", 0, 0);
		
		Select selectstates = new Select(selectState);
		
		List <WebElement> list = selectstates.getOptions();
		
		ArrayList <String> actDragDownOptions = Utility.getListOfElements(list);
		
		if(actDragDownOptions.equals(expDragDownOptions))
			return true ;
		else
			return false ;
	}
	
	//3
	public boolean validAddUser() throws Exception
	{
		Utility.sendkeys(userName, "Asj");
		Utility.sendkeys(mobile, "940000000000");
		Utility.sendkeys(email, "aj@gmail.com");
		Utility.sendkeys(course, "Java");
		Utility.click(genderMale);
		Utility.click(maharashtra);
		Utility.sendkeys(pass, "asdfgh");
		Utility.click(submitBtn);
		Thread.sleep(2000);
		
		String actMsg = Utility.getAlertMsg_accept(driver);
		
		String expMsg = "User Added Successfully. You can not see added user.";
		
		if(actMsg.equals(expMsg))
			return true ;
		else
			return false ;
	}
}
