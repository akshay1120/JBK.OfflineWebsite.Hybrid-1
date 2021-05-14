package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LginPgObjRepo 
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath = "//img")
	public WebElement logo ;
	
	@FindBy(xpath = "//b")
	public WebElement mainHeading;

	@FindBy(xpath = "//h4")
	public WebElement subHeading;

	@FindBy(xpath = "//p")
	public WebElement signInBoxHeading;
	
	@FindBy(xpath = "//input")
	public List<WebElement> placeholdersList;
	
	@FindBy(xpath="//p[2]")
	public WebElement successfullyLgOutMsg;
	
	@FindBy(linkText = "LOGOUT")
	public WebElement logout ;
	
	@FindBy(xpath = "//div[contains(@id,'error')]")
	public List<WebElement> ErrorsList;
	
	@FindBy(partialLinkText = "Register")
	public WebElement registerLink;
	
	@FindBy(partialLinkText = "membership")
	public WebElement alreadyMemberLink;
}