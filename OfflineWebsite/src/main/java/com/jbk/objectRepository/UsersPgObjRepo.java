package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPgObjRepo 
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement users;
	
	@FindBy(xpath = "//th")
	public List<WebElement> headings;
	
	@FindBy(xpath = "//td[1]")
	public List<WebElement> idCol;
	
	@FindBy(xpath = "//td[2]")
	public List<WebElement> unameCol;
	
	@FindBy(xpath = "//td[3]")
	public List<WebElement> emailCol;
	
	@FindBy(xpath = "//td[4]")
	public List<WebElement> mobCol;
	
	@FindBy(xpath = "//td[5]")
	public List<WebElement> courseCol;
	
	@FindBy(xpath = "//td[6]")
	public List<WebElement> genderCol;
	
	@FindBy(xpath = "//td[7]")
	public List<WebElement> stateCol;
	
	@FindBy(xpath = "//td[8]")
	public List<WebElement> actionCol;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
	
	@FindBy(xpath = "//span[text()='Delete']")
	public List<WebElement> delete;
	
	@FindBy(xpath = "//a//button")
	public WebElement addUserBtn ;
}