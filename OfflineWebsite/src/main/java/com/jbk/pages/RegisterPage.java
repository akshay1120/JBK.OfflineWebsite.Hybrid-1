package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.RegisterPgObjRepo;

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
		String actualUrl = driver.getCurrentUrl() ;
		
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is matched");
			return true ;
		}
		else
		{
			System.out.println("Url is not matched");
			return false ;
		}
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		String actualTitle = driver.getTitle() ;
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is matched");
			return true ;
		}
		else 
		{
			System.out.println("Title not matched");
			return false ;
		}		
	}
	
	//3
	public boolean heading() 
	{ 	
		String actualHeading = head.getText();
		String expectedHeading = "Java By Kiran" ;
		
		if(actualHeading.equals(expectedHeading))
		{
			System.out.println("Heading is matched");
			return true ;
		}
		else 
		{
			System.out.println("Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean alreadyMemberText() 
	{ 	
		String actualAlreadyMemberLinkText = alreadyMember.getText();
		String expectedAlreadyMemberLinkText = "I already have a membership" ;
		
		if(actualAlreadyMemberLinkText.equals(expectedAlreadyMemberLinkText))
		{
			System.out.println("Text is matched");
			return true ;
		}
		else 
		{
			System.out.println("Text not matched");
			return false ;
		}
	}
	
	//5
	public boolean alreadyMemberLink() 
	{ 
		alreadyMember.click();
		
		String expectedTitle = "JavaByKiran | Log in" ; 
		String actualTitle = driver.getTitle() ;
		
		registerLink.click();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Link is Working Properly");
			return true ;
		}
		else 
		{
			System.out.println("Link is not Working Properly");
			return false ;
		}
	}
	
	//6
	public boolean placeholders() 
	{ 	
		ArrayList <String>actPlaceholderText = new ArrayList <String>();
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Name");
		expPlaceholderText.add("Mobile");
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		
		for (WebElement element : placeholdersList)
		{
			actPlaceholderText.add(element.getAttribute("placeholder"));
		}
		
		if(actPlaceholderText.equals(expPlaceholderText))
		{
			System.out.println("Placeholders are matched");
			return true ;
		}
		else 
		{
			System.out.println("Placeholders are not matched");
			return false ;
		}
	}
	
	//7
	public boolean blankSignIn() 
	{
		lgnBtn.click();
		
		ArrayList <String>actErrorMessage = new ArrayList <String>();
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter Name.");
		expErrorMessage.add("Please enter Mobile.");		
		expErrorMessage.add("Please enter Email.");
		expErrorMessage.add("Please enter Password.");
		
		for (WebElement element : ErrorsList)
		{
			actErrorMessage.add(element.getText());
		}
		
		if(actErrorMessage.equals(expErrorMessage))
		{
			System.out.println("Error messages are matched");
			return true ;
		}
		else 
		{
			System.out.println("Error messages are not matched");
			return false ;
		}
	}
	
	//8
	public boolean validSignIn() 
	{
		name.sendKeys("Akshay");
		mobile.sendKeys("9876543210");
		email.sendKeys("akshay@gmail.com");
		pass.sendKeys("123456");
		lgnBtn.click();
		
		Alert al = driver.switchTo().alert();
		String alMessage = al.getText();
		al.accept();
		
		if(alMessage.equals("User registered successfully."))
		{
			System.out.println("Registered successfully.");
			return true ;
		}
		else 
		{
			System.out.println("Registered unsuccessfully.");
			return false ;
		}
	}
}
