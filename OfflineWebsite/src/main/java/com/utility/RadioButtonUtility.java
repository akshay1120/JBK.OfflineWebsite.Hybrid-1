package com.utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonUtility 
{
	public static void selectRadioButton (WebDriver driver, List<WebElement> list, String text)
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
}
