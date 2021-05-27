package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility 
{
	WebDriver driver;
	
	public static void dragAndDrop (WebDriver driver , WebElement Source , WebElement Target)
	{
		Actions act = new Actions (driver);
		act.dragAndDrop(Source, Target);
	}
	
	public static void moveToElement (WebDriver driver , WebElement element)
	{
		Actions act = new Actions (driver);
		act.moveToElement(element);
	}
	
	public static void doubleClick (WebDriver driver , WebElement element)
	{
		Actions act = new Actions (driver);
		act.doubleClick(element);
	}
	
	public static void moveByOffset (WebDriver driver , int xOffset , int yOffset)
	{
		Actions act = new Actions (driver);
		act.moveByOffset(xOffset, yOffset);
	}
}
