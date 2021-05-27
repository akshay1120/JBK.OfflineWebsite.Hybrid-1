package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.testbase.TestBase;

public class OperatorsPgObjRepo extends TestBase
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath = "//span[text()='Operators']")
	public WebElement users;
	
	@FindBy(xpath = "//th")
	public List<WebElement> headings;
	
	@FindBy(xpath = "//td[1]")
	public List<WebElement> idCol;
	
	@FindBy(xpath = "//td[2]")
	public List<WebElement> personCol;
	
	@FindBy(xpath = "//td[3]")
	public List<WebElement> forCol;
	
	@FindBy(xpath = "//td[4]")
	public List<WebElement> prefferedWayToConnectCol;
	
	@FindBy(xpath = "//td[5]")
	public List<WebElement> contactCol;
	
	@FindBy(xpath = "//td[6]")
	public List<WebElement> timingsCol;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
}
