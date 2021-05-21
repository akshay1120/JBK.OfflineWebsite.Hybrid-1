package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jbk.testbase.TestBase;

public class WaitUtility extends TestBase
{
	public static void waitForPageLoad (long timeInSec)
	{
		driver.manage().timeouts().pageLoadTimeout(timeInSec, TimeUnit.SECONDS);
	}
	
	public static void implicitWait (long timeInSec)
	{
		driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
	}
	
	public static void explicitWait (long timeInSec , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver , timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void sleep (long timeInMillis) throws Exception
	{
		Thread.sleep(timeInMillis);
	}
}
