package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.RegisterPgObjRepo;
import com.utility.Utility;

public class RegisterPage extends RegisterPgObjRepo
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/register.html" ; 
		String actualUrl = Utility.getCurrentUrl(driver);
		
		if(actualUrl.equals(expectedUrl))
			return true ;
		else
			return false ;
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		String actualTitle = Utility.getTitle(driver);
		
		if(actualTitle.equals(expectedTitle))
			return true ;
		else 
			return false ;	
	}
	
	//3
	public boolean heading() 
	{ 	
		String actualHeading = Utility.getText(head);
		String expectedHeading = "Java By Kiran" ;
		
		if(actualHeading.equals(expectedHeading))
			return true ;
		else 
			return false ;
	}
	
	//4
	public boolean alreadyMemberText() 
	{ 	
		String actualAlreadyMemberLinkText = Utility.getText(alreadyMember);
		String expectedAlreadyMemberLinkText = "I already have a membership" ;
		
		if(actualAlreadyMemberLinkText.equals(expectedAlreadyMemberLinkText))
			return true ;
		else 
			return false ;
	}
	
	//5
	public boolean alreadyMemberLink() 
	{ 
		Utility.click(alreadyMember);
		
		String expectedTitle = "JavaByKiran | Log in" ; 
		String actualTitle = Utility.getTitle(driver);
		
		Utility.click(registerLink);
		
		if(actualTitle.equals(expectedTitle))
			return true ;
		else 
			return false ;
	}
	
	//6
	public boolean placeholders() 
	{ 	
		ArrayList <String>actPlaceholderText = Utility.getPlaceholdersList(placeholdersList);
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Name");
		expPlaceholderText.add("Mobile");
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		
		if(actPlaceholderText.equals(expPlaceholderText))
			return true ;
		else 
			return false ;
	}
	
	//7
	public boolean blankSignIn() 
	{
		Utility.click(lgnBtn);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter Name.");
		expErrorMessage.add("Please enter Mobile.");		
		expErrorMessage.add("Please enter Email.");
		expErrorMessage.add("Please enter Password.");
		
		if(actErrorMessage.equals(expErrorMessage))
			return true ;
		else 
			return false ;
	}
	
	//8
	public boolean validSignIn() 
	{
		Utility.sendkeys(name, "Akshay");
		Utility.sendkeys(mobile, "9876543210");
		Utility.sendkeys(email, "akshay@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
		
		String alMessage = Utility.getAlertMsg_accept(driver);

		if(alMessage.equals("User registered successfully."))
			return true ;
		else 
			return false ;
	}
}
