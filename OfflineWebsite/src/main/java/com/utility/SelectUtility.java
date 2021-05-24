package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jbk.testbase.TestBase;

public class SelectUtility extends TestBase
{
	public static void selectProductByText (WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public static void selectProductByIndex (WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
}
