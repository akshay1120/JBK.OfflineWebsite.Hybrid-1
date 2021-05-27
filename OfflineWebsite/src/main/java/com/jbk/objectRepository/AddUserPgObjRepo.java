package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.testbase.TestBase;

public class AddUserPgObjRepo extends TestBase
{	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement users;
	
	@FindBy(xpath = "//button[text()='Add User']")
	public WebElement addUser;
	
	@FindBy(id="username")
	public WebElement userName ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(id="mobile")
	public WebElement mobile ;
	
	@FindBy(id="email")
	public WebElement email ;
	
	@FindBy(id="course")
	public WebElement course ;
	
	@FindBy(id="Male")
	public WebElement genderMale ;
	
	@FindBy(id="Female")
	public WebElement genderFemale ;
	
	@FindBy(xpath = "//option[@value='Maharashtra']")
	public WebElement maharashtra;
	
	@FindBy(xpath = "//option[@value='Delhi']")
	public WebElement Delhi;
	
	@FindBy(xpath = "//option[@value='HP']")
	public WebElement HP;
	
	@FindBy(xpath = "//option[@value='Punjab']")
	public WebElement Punjab;
	
	@FindBy(xpath = "//button")
	public WebElement submitBtn ;
	
	@FindBy(xpath = "//select")
	public WebElement selectState;
}