package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPgObjRepo 
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath="//span[2]")
	public WebElement cornerHead ;
	
	@FindBy(xpath="//h1")
	public WebElement mainHead ;
	
	@FindBy(xpath="//img")
	public WebElement userImg ;
	
	@FindBy(xpath="//p[text()='Kiran']")
	public WebElement userName ;

	@FindBy(xpath="//a[text()=' Online']")
	public WebElement userStatus ;
	
	@FindBy(xpath = "//ul//following::span")
	public List<WebElement> navMenu;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	public WebElement dashboard;
	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement users;
	
	@FindBy(xpath = "//span[text()='Operators']")
	public WebElement operators;
	
	@FindBy(xpath = "//span[text()='     Useful Links']")
	public WebElement usefulLinks;
	
	@FindBy(xpath = "//span[text()='Downloads']")
	public WebElement downloads;
	
	@FindBy(xpath = "//span[text()='Logout']")
	public WebElement leftLgOut;
	
	@FindBy(xpath = "//li[@class='dropdown user user-menu']")
	public WebElement rightLgOut;
	
	@FindBy(xpath = "//h3")
	public List<WebElement> courseHeading;
	
	@FindBy(xpath = "//h3//following::p")
	public List<WebElement> courseSubHeading;
	
	@FindBy(xpath = "//a[text()='More info ']")
	public List<WebElement> moreInfo;
	
	@FindBy(xpath = "//footer")
	public WebElement footer;
	
	@FindBy(xpath = "//a[text()='JavaByKiran']")
	public WebElement jbkLink;
	
	@FindBy(xpath = "//ol")
	public WebElement sequence ;
}
