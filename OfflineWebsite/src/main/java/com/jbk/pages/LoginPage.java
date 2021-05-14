package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.LginPgObjRepo;

public class LoginPage extends LginPgObjRepo
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{
		String expectedUrl = "file:///C:/Offline%20Website/index.html" ; 
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
		String expectedTitle = "JavaByKiran | Log in" ; 
		String actualTitle = driver.getTitle() ;
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("title is matched");
			return true ;
		}
		else 
		{
			System.out.println("title not matched");
			return false ;
		}		
	}
	
	//3
	public boolean logo() 
	{ 	
		if(logo.isDisplayed()==true)
		{
			System.out.println("Logo is displayed");
			return true ;
		}
		else
		{
			System.out.println("Logo is not displayed");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading() 
	{ 	
		String actualHeading = mainHeading.getText();
		String expectedHeading = "Java By Kiran" ;
		
		if (actualHeading.equals(expectedHeading))
		{
			System.out.println("Heading is matched");
			return true ;
		}
		else
		{
			System.out.println("Heading is not matched");
			return false ;
		}
	}
	
	//5
	public boolean subHeading()
	{
		String actualSubHeading = subHeading.getText();
		String expectedSubHeading = "JAVA | SELENIUM | PYTHON" ;
		
		if (actualSubHeading.equals(expectedSubHeading))
		{
			System.out.println("SubHeading is matched");
			return true ;
		}
		else
		{
			System.out.println("SubHeading is not matched");
			return false ;
		}
	}
	
	//6
	public boolean signInBoxHeading()
	{
		String actualSignInBoxHeading = signInBoxHeading.getText();
		String expectedSignInBoxHeading = "Sign in to start your session" ;
		
		if (actualSignInBoxHeading.equals(expectedSignInBoxHeading))
		{
			System.out.println("SignInBoxHeading is matched");
			return true ;
		}
		else
		{
			System.out.println("SignInBoxHeading is not matched");
			return false ;
		}
	}
	
	//7
	public boolean placeholders()
	{	
		ArrayList <String>actPlaceholderText = new ArrayList <String>();
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		
		for (WebElement element : placeholdersList)
		{
			actPlaceholderText.add(element.getAttribute("placeholder"));
		}
		
		if (actPlaceholderText.equals(expPlaceholderText))
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
	
	//8
	public boolean validLogIn() 
	{
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		lgnBtn.click();
		
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		String actualTitle = driver.getTitle() ;
		
		logout.click();
		
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Valid Login Successfull");
			return true ;
		}
		else
		{
			System.out.println("Valid Login Unsuccessfull");
			return false ;
		}
	}
	
	//9
	public boolean logoutSuccessfullyMessage()
	{
		String actMessage = successfullyLgOutMsg.getText();
		String expMessage = "Logout successfully" ;
		
		if (actMessage.equals(expMessage))
		{
			System.out.println("Logout Successfully Message Displayed");
			return true ;
		}
		else
		{
			System.out.println("Logout Successfully Message not Displayed");
			return false ;
		}
	}
	
	//10
	public boolean invalidLogIn() 
	{
		uname.sendKeys("akshay@gmail.com");
		pass.sendKeys("123456789");
		lgnBtn.click();
		
		String expectedTitle = "JavaByKiran | Log in" ;  
		String actualTitle = driver.getTitle() ;
		
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Invalid Log In Checked Successfully");
			return true ;
		}
		else
		{
			System.out.println("Invalid Log In Checked Unsuccessfully");
			return false ;
		}
	}
	
	//11
	public boolean invalidLogInErrorMessage()
	{
		ArrayList <String>actErrorMessage = new ArrayList <String>();
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email as kiran@gmail.com");
		expErrorMessage.add("Please enter password 123456");
		
		for (WebElement element : ErrorsList)
		{
			actErrorMessage.add(element.getText());
		}
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			System.out.println("Error Messages are Displayed");
			return true ;
		}
		else
		{
			System.out.println("Error Messages are not Displayed");
			return false ;
		}
	}
	
	//12
	public boolean blankLogInErrorMessage() 
	{
		uname.clear();
		pass.clear();
		lgnBtn.click();
		
		ArrayList <String>actErrorMessage = new ArrayList <String>();
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email.");
		expErrorMessage.add("Please enter password.");
		
		for (WebElement element : ErrorsList)
		{
			actErrorMessage.add(element.getText());
		}
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			System.out.println("Error Messages are Displayed");
			return true ;
		}
		else
		{
			System.out.println("Error Messages are not Displayed");
			return false ;
		}
	}
	
	//13
	public boolean registerLinkText() 
	{ 	
		String actualRegisterLinkText = registerLink.getText();
		String expectedRegisterLinkText = "Register a new membership" ;
		
		if (actualRegisterLinkText.equals(expectedRegisterLinkText))
		{
			System.out.println("Register Text is matched");
			return true ;
		}
		else
		{
			System.out.println("Register Text is not matched");
			return false ;
		}
	}
	
	//14
	public boolean registerLink() 
	{ 	
		registerLink.click();
	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		String actualTitle = driver.getTitle() ;
		
		alreadyMemberLink.click();
		
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Register Link is working");
			return true ;
		}
		else
		{
			System.out.println("Register Link is not working");
			return false ;
		}
	}
}