package com.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandlingUtility 
{
	public static String getWindowTitle(WebElement Element , WebDriver driver) throws Exception 
	{
		String parent = driver.getWindowHandle();
		
		Element.click();
		Thread.sleep(3000);
		
		String actWindowTitle = null ;
	
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actWindowTitle = driver.getTitle();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		return actWindowTitle ;
	}
	
	public static String getWindowUrl(WebElement Element , WebDriver driver) throws Exception 
	{
		String parent = driver.getWindowHandle();
		
		Element.click();
		Thread.sleep(2000);
		
		String actWindowUrl = null ;
	
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actWindowUrl = driver.getCurrentUrl();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		return actWindowUrl ;
	}
	
	
	public static ArrayList <String> getWindowsUrls(List<WebElement> listWbEle , WebDriver driver) throws Exception 
	{
		ArrayList <String> actNewWindowUrls  = new ArrayList <String>();

		String parent = driver.getWindowHandle();
		
		for (WebElement element : listWbEle)
		{
			element.click();
			Thread.sleep(2000);
		}
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actNewWindowUrls.add(driver.getCurrentUrl());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		return actNewWindowUrls ;
	}
	
	public static ArrayList <String> getWindowsTitles(List<WebElement> listWbEle , WebDriver driver) throws Exception 
	{
		ArrayList <String> actNewWindowTitles  = new ArrayList <String>();

		String parent = driver.getWindowHandle();
		
		for (WebElement element : listWbEle)
		{
			element.click();
			Thread.sleep(3000);
		}
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actNewWindowTitles.add(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		return actNewWindowTitles ;
	}
}
