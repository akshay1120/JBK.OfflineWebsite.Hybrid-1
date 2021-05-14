package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPgObjRepo 
{
	@FindBy(xpath="//b")
	public WebElement head ;
	
	@FindBy(partialLinkText="membership")
	public WebElement alreadyMember ;
	
	@FindBy(xpath = "//input")
	public List<WebElement> placeholdersList;
	
	@FindBy(xpath = "//div[contains(@id,'error')]")
	public List<WebElement> ErrorsList;
	
	@FindBy(id="name")
	public WebElement name ;
	
	@FindBy(id="mobile")
	public WebElement mobile ;
	
	@FindBy(id="email")
	public WebElement email ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(partialLinkText = "Register")
	public WebElement registerLink;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
}
