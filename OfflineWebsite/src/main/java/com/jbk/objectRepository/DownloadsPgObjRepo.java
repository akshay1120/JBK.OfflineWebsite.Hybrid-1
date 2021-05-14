package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsPgObjRepo 
{
	@FindBy(id="email")
	public WebElement uname ;
	
	@FindBy(id="password")
	public WebElement pass ;
	
	@FindBy(xpath = "//button")
	public WebElement lgnBtn ;
	
	@FindBy(xpath = "//span[text()='Downloads']")
	public WebElement downloads;
	
	@FindBy(xpath = "//tr/td[1]")
	public List<WebElement> srCol;
	
	@FindBy(xpath = "//tr/td[2]")
	public List<WebElement> nameCol;
	
	@FindBy(xpath = "//tr/td[3]")
	public List<WebElement> vendorCol;
	
	@FindBy(xpath = "//tr/td[4]")
	public List<WebElement> versionCol;
	
	@FindBy(xpath = "//tr/td[5]")
	public List<WebElement> lowBitCol;
	
	@FindBy(xpath = "//tr/td[6]")
	public List<WebElement> highBitCol;
	
	@FindBy(xpath = "//tr/td[7]")
	public List<WebElement> commonCol;
	
	@FindBy(xpath = "//tr/td[8]")
	public List<WebElement> officialSourceCol;
	
	@FindBy(xpath = "//th")
	public List<WebElement> headings;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
}
