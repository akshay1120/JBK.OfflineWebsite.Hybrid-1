package com.utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxUtility 
{
	public static void selectSingleCheckBox (WebDriver driver, List<WebElement> list, String text)
	{
		for(WebElement element : list)
		{
			if(element.getAttribute("value").equals(text))
			{
				element.click();
				break;
			}
		}
	}
	
	
	public static void selectMultipleCheckBox (WebDriver driver, List<WebElement> list, ArrayList<String> texts) throws Exception
	{
		for(String text : texts)
		{
			for(WebElement element : list)
			{
				if(element.getAttribute("value").equals(text))
				{
					element.click();
					Thread.sleep(2000);
				}
			}
		}
	}
}
