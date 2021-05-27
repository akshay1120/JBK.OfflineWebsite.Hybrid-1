package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.testbase.TestBase;

public class UsefulLinksPgObjRepo extends TestBase
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath = "//span[text()='     Useful Links']")
	public WebElement usefulLinks;
	
	@FindBy(xpath = "//span[text()='Go !']")
	public List<WebElement> clickCol;
	
	@FindBy(xpath = "//th")
	public List<WebElement> tableHead;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
}
