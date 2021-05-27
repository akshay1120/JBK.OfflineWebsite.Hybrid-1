package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
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
	public boolean url(ExtentTest test)
	{
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/register.html" ; 
		logP().info("Expected Url = " + expectedUrl);
		test.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		logP().info("Actual Url = " + actualUrl);
		test.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			logP().info("Actual and expected Url matched");
			test.info("Actual and expected Url matched");
			return true ;
		}
		else
		{
			logP().info("Actual and expected Url not matched");
			test.info("Actual and expected Url not matched");
			return false ;
		}
	}
	
	//2
	public boolean title(ExtentTest test) 
	{ 	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual Title = " + actualTitle);
		test.info("Actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and expected title matched");
			test.info("Actual and expected title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and expected title not matched");
			test.info("Actual and expected title not matched");
			return false ;
		}
	}
	
	//3
	public boolean heading(ExtentTest test) 
	{ 	
		String actualHeading = Utility.getText(head);
		logP().info("Actual Heading = " + actualHeading);
		test.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		logP().info("Expected Heading = " + expectedHeading);
		test.info("Expected Heading = " + expectedHeading);
		
		if(actualHeading.equals(expectedHeading))
		{
			logP().info("Actual and Expected Heading matched");
			test.info("Actual and Expected Heading matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Heading not matched");
			test.info("Actual and Expected Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean alreadyMemberText(ExtentTest test) 
	{ 	
		String actualAlreadyMemberLinkText = Utility.getText(alreadyMember);
		logP().info("Actual Already Member Link Text = " + actualAlreadyMemberLinkText);
		test.info("Actual Already Member Link Text = " + actualAlreadyMemberLinkText);
		
		String expectedAlreadyMemberLinkText = "I already have a membership" ;
		logP().info("Expected Already Member Link Text = " + expectedAlreadyMemberLinkText);
		test.info("Expected Already Member Link Text = " + expectedAlreadyMemberLinkText);
		
		if(actualAlreadyMemberLinkText.equals(expectedAlreadyMemberLinkText))
		{
			logP().info("Actual and Expected Already Member Link Text matched");
			test.info("Actual and Expected Already Member Link Text matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Already Member Link Text not matched");
			test.info("Actual and Expected Already Member Link Text not matched");
			return false ;
		}
	}
	
	//5
	public boolean alreadyMemberLink(ExtentTest test) 
	{ 
		Utility.click(alreadyMember);
		
		String expectedTitle = "JavaByKiran | Log in" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual Title = " + actualTitle);
		test.info("Actual Title = " + actualTitle);
		
		Utility.click(registerLink);
		
		if(actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and expected title matched");
			test.info("Actual and expected title matched");
			return true ;
		}
		else
		{
			logP().info("Actual and expected title not matched");
			test.info("Actual and expected title not matched");
			return false ;
		}
	}
	
	//6
	public boolean placeholders(ExtentTest test) 
	{ 	
		ArrayList <String>actPlaceholderText = Utility.getPlaceholdersList(placeholdersList);
		logP().info("Actual Placeholder Texts = " + actPlaceholderText);
		test.info("Actual Placeholder Texts = " + actPlaceholderText);
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Name");
		expPlaceholderText.add("Mobile");
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		logP().info("Expected Placeholder Texts = " + expPlaceholderText);
		test.info("Expected Placeholder Texts = " + expPlaceholderText);
		
		if(actPlaceholderText.equals(expPlaceholderText))
		{
			logP().info("Actual and Expected Placeholder texts matched");
			test.info("Actual and Expected Placeholder texts matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Placeholder texts not matched");
			test.info("Actual and Expected Placeholder texts not matched");
			return false ;
		}
	}
	
	//7
	public boolean blankSignIn(ExtentTest test) 
	{
		Utility.click(lgnBtn);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		logP().info("Actual Error Messages = " + actErrorMessage);
		test.info("Actual Error Messages = " + actErrorMessage);
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter Name.");
		expErrorMessage.add("Please enter Mobile.");		
		expErrorMessage.add("Please enter Email.");
		expErrorMessage.add("Please enter Password.");
		logP().info("Expected error Messages = " + expErrorMessage);
		test.info("Expected error Messages = " + expErrorMessage);
		
		if(actErrorMessage.equals(expErrorMessage))
		{
			logP().info("Expected and Actual error messages matched");
			test.info("Expected and Actual error messages matched");
			return true ;
		}
		else
		{
			logP().info("Expected and Actual error messages not matched");
			test.info("Expected and Actual error messages not matched");
			return false ;
		}
	}
	
	//8
	public boolean validSignIn(ExtentTest test) 
	{
		Utility.sendkeys(name, "Akshay");
		Utility.sendkeys(mobile, "9876543210");
		Utility.sendkeys(email, "akshay@gmail.com");
		Utility.sendkeys(pass, "123456");
		Utility.click(lgnBtn);
		
		String expAlMeassage = "User registered successfully." ;
		logP().info("Expected Alert Message = " + expAlMeassage);
		test.info("Expected Alert Message = " + expAlMeassage);
		
		String alMessage = Utility.getAlertMsg_accept(driver);
		logP().info("Actual Alert Message = " + alMessage);
		test.info("Actual Alert Message = " + alMessage);

		if(alMessage.equals(expAlMeassage))
		{
			logP().info("Expected and Actual alert message matched");
			test.info("Expected and Actual alert message matched");
			return true ;
		}
		else
		{
			logP().info("Expected and Actual alert message not matched");
			test.info("Expected and Actual alert message not matched");
			return false ;
		}
	}
}
