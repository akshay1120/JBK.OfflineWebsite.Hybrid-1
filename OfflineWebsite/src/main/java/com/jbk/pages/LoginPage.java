package com.jbk.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.LginPgObjRepo;
import com.utility.Utility;

public class LoginPage extends LginPgObjRepo
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url(ExtentTest test)
	{
		logP().info("*************************************************************");
		
		String expectedUrl = "file:///C:/Offline%20Website/index.html" ; 
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
		logP().info("*************************************************************");
		
		String expectedTitle = "JavaByKiran | Log in" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual and expected Url not matched");
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
	public boolean logo(ExtentTest test) 
	{ 	
		logP().info("*************************************************************");
		
		if(Utility.displayed(logo)==true)
		{
			logP().info("Logo is displayed");
			test.info("Logo is displayed");
			return true ;
		}
		else
		{
			logP().info("Logo is not displayed");
			test.info("Logo is not displayed");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading(ExtentTest test) 
	{ 	
		logP().info("*************************************************************");
		
		String actualHeading = Utility.getText(mainHeading);
		logP().info("Actual Heading = " + actualHeading);
		test.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		logP().info("Expected Heading = " + expectedHeading);
		test.info("Expected Heading = " + expectedHeading);
		
		if (actualHeading.equals(expectedHeading))
		{
			logP().info("Actual and Expected Headings are matched");
			test.info("Actual and Expected Headings are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Headings are matched");
			test.info("Actual and Expected Headings are matched");
			return false ;
		}
	}
	
	//5
	public boolean subHeading(ExtentTest test)
	{
		logP().info("*************************************************************");
		
		String actualSubHeading = Utility.getText(subHeading);
		logP().info("Actual Subheading = " + actualSubHeading);
		test.info("Actual Subheading = " + actualSubHeading);
		
		String expectedSubHeading = "JAVA | SELENIUM | PYTHON" ;
		logP().info("Expected Subheading = " + expectedSubHeading);
		test.info("Expected Subheading = " + expectedSubHeading);
		
		if (actualSubHeading.equals(expectedSubHeading))
		{
			logP().info("Actual and expected Subheadings are matched");
			test.info("Actual and expected Subheadings are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and expected Subheadings are not matched");
			test.info("Actual and expected Subheadings are not matched");
			return false ;
		}
	}
	
	//6
	public boolean signInBoxHeading(ExtentTest test)
	{
		logP().info("*************************************************************");
		
		String actualSignInBoxHeading = Utility.getText(signInBoxHeading);
		logP().info("Actual Sign-in box heading = " + actualSignInBoxHeading);
		test.info("Actual Sign-in box heading = " + actualSignInBoxHeading);
		
		String expectedSignInBoxHeading = "Sign in to start your session" ;
		logP().info("Expected Sign-in box heading = " + expectedSignInBoxHeading);
		test.info("Expected Sign-in box heading = " + expectedSignInBoxHeading);
		
		if (actualSignInBoxHeading.equals(expectedSignInBoxHeading))
		{
			logP().info("Actual and Expected Sign-in box headings are matched");
			test.info("Actual and Expected Sign-in box headings are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Sign-in box headings are not matched");
			test.info("Actual and Expected Sign-in box headings are not matched");
			return false ;
		}
	}
	
	//7
	public boolean placeholders(ExtentTest test)
	{	
		logP().info("*************************************************************");
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		logP().info("List of Expected Placeholders = " + expPlaceholderText);
		test.info("List of Expected Placeholders = " + expPlaceholderText);
		
		ArrayList <String>actPlaceholderText = Utility.getPlaceholdersList(placeholdersList);
		logP().info("List of Actual Placeholders = " + actPlaceholderText);
		test.info("List of Actual Placeholders = " + actPlaceholderText);
		
		if (actPlaceholderText.equals(expPlaceholderText))
		{
			logP().info("List of Actual and Expected Placeholders are matched");
			test.info("List of Actual and Expected Placeholders are matched");
			return true ;
		}
		else
		{
			logP().info("List of Actual and Expected Placeholders are not matched");
			test.info("List of Actual and Expected Placeholders are not matched");
			return false ;
		}
	}
	
	//8
	public boolean validLogIn(ExtentTest test) 
	{
		logP().info("*************************************************************");
		
		Utility.sendkeys(uname, prop.getProperty("uname"));
		Utility.sendkeys(pass, prop.getProperty("password"));
		Utility.click(lgnBtn);
		
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual Title = " + actualTitle);
		test.info("Actual Title = " + actualTitle);
		
		Utility.click(logout);
		logP().info("Clicked Logout Button");
		test.info("Clicked Logout Button");
		
		if (actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and Expected titles are matched");
			test.info("Actual and Expected titles are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected titles are not matched");
			test.info("Actual and Expected titles are not matched");
			return false ;
		}
	}
	
	//9
	public boolean logoutSuccessfullyMessage(ExtentTest test)
	{
		logP().info("*************************************************************");
		
		String actMessage = Utility.getText(successfullyLgOutMsg);
		logP().info("Actual Message = " + actMessage);
		test.info("Actual Message = " + actMessage);
		
		String expMessage = "Logout successfully" ;
		logP().info("Expected Message = " + expMessage);
		test.info("Expected Message = " + expMessage);
		
		if (actMessage.equals(expMessage))
		{
			logP().info("Actual and Expected Message matched" );
			test.info("Actual and Expected Message matched");	
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Message not matched" );
			test.info("Actual and Expected Message not matched");
			return false ;
		}
	}
	
	//10
	public boolean invalidLogIn(ExtentTest test) 
	{
		logP().info("*************************************************************");
		
		Utility.sendkeys(uname, "akshay@gmail.com");
		Utility.sendkeys(pass, "123456789");
		Utility.click(lgnBtn);
		
		String expectedTitle = "JavaByKiran | Log in" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual Title = " + actualTitle);
		test.info("Actual Title = " + actualTitle);
		
		if (actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and Expected titles are matched");
			test.info("Actual and Expected titles are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected titles are not matched");
			test.info("Actual and Expected titles are not matched");
			return false ;
		}
	}
	
	//11
	public boolean invalidLogInErrorMessage(ExtentTest test)
	{
		logP().info("*************************************************************");
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email as kiran@gmail.com");
		expErrorMessage.add("Please enter password 123456");
		logP().info("List of Expected Error Messages = " + expErrorMessage);
		test.info("List of Expected Error Messages = " + expErrorMessage);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		logP().info("List of Actual Error Messages = " + actErrorMessage);
		test.info("List of Actual Error Messages = " + actErrorMessage);
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			logP().info("List of Expected and Actual Error Messages matched ");
			test.info("List of Expected and Actual Error Messages matched ");
			return true ;
		}
		else
		{
			logP().info("List of Expected and Actual Error Messages not matched ");
			test.info("List of Expected and Actual Error Messages not matched ");
			return false ;
		}
	}
	
	//12
	public boolean blankLogInErrorMessage(ExtentTest test) 
	{
		logP().info("*************************************************************");
		
		Utility.clear(uname);
		Utility.clear(pass);
		Utility.click(lgnBtn);
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email.");
		expErrorMessage.add("Please enter password.");
		logP().info("List of Expected Error Messages = " + expErrorMessage);
		test.info("List of Expected Error Messages = " + expErrorMessage);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		logP().info("List of Actual Error Messages = " + actErrorMessage);
		test.info("List of Actual Error Messages = " + actErrorMessage);
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			logP().info("List of Expected and Actual Error Messages matched ");
			test.info("List of Expected and Actual Error Messages matched ");
			return true ;
		}
		else
		{
			logP().info("List of Expected and Actual Error Messages not matched ");
			test.info("List of Expected and Actual Error Messages not matched ");
			return false ;
		}
	}
	
	//13
	public boolean registerLinkText(ExtentTest test) 
	{ 
		logP().info("*************************************************************");
		
		String actualRegisterLinkText = Utility.getText(registerLink);
		logP().info("Actual Register LinkText = " + actualRegisterLinkText);
		test.info("Actual Register LinkText = " + actualRegisterLinkText);
		
		String expectedRegisterLinkText = "Register a new membership" ;
		logP().info("expected Register LinkText = " + expectedRegisterLinkText);
		test.info("expected Register LinkText = " + expectedRegisterLinkText);
		
		if (actualRegisterLinkText.equals(expectedRegisterLinkText))
		{
			logP().info("Actual and Expected Register LinkText matched");
			test.info("Actual and Expected Register LinkText matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected Register LinkText not matched");
			test.info("Actual and Expected Register LinkText not matched");
			return false ;
		}
	}
	
	//14
	public boolean registerLink(ExtentTest test) 
	{ 	
		logP().info("*************************************************************");
		
		Utility.click(registerLink);
		logP().info("Clicked the Register Link");
		test.info("Clicked the Register Link");
	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		logP().info("Expected Title = " + expectedTitle);
		test.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		logP().info("Actual Title = " + actualTitle);
		test.info("Actual Title = " + actualTitle);
		
		Utility.click(alreadyMemberLink);
		
		if (actualTitle.equals(expectedTitle))
		{
			logP().info("Actual and Expected titles are matched");
			test.info("Actual and Expected titles are matched");
			return true ;
		}
		else
		{
			logP().info("Actual and Expected titles are not matched");
			test.info("Actual and Expected titles are not matched");
			return false ;
		}
	}
	
	//15
	public void loginWithAllData(HashMap<String,String> hm , ExtentTest test)
	{	
		logP().info("*************************************************************");
		
		Set<String> keys = hm.keySet();
		for(String key :keys)
		{
			Utility.sendkeys(uname, key);
			Utility.sendkeys(pass,hm.get(key));
			Utility.click(lgnBtn);
			
			if(Utility.getTitle(driver).contains("Dashboard"))
			{
				logP().info("Valid Data = Username : "+ key + "    Password :" + hm.get(key));
				test.info("Valid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.click(logout);
			}
			else
			{
				logP().info("invalid Data = Username : "+ key + "    Password :" + hm.get(key));
				test.info("invalid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.clear(uname);
				Utility.clear(pass);
			}
		}
	}
	
	public DashboardPage navigateToDashboardPg() 
	{
		Utility.sendkeys(uname, prop.getProperty("uname"));
		Utility.sendkeys(pass, prop.getProperty("password"));
		Utility.click(lgnBtn);
		
		return new DashboardPage(driver);
	}
	
	public RegisterPage navigateToRegisterPg() 
	{
		Utility.click(registerLink);
		return new RegisterPage(driver);
	}
}