package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.jbk.testbase.TestBase;

public class ActionUtility extends TestBase
{
	public static void dragAndDrop (WebElement Source , WebElement Target)
	{
		Actions act = new Actions (driver);
		act.dragAndDrop(Source, Target);
	}
	
	public static void moveToElement (WebElement element)
	{
		Actions act = new Actions (driver);
		act.moveToElement(element);
	}
	
	public static void doubleClick (WebElement element)
	{
		Actions act = new Actions (driver);
		act.doubleClick(element);
	}
	
	public static void moveByOffset (int xOffset , int yOffset)
	{
		Actions act = new Actions (driver);
		act.moveByOffset(xOffset, yOffset);
	}
}
