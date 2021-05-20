package com.utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility 
{
	WebDriver driver ;
	
	// 1
	public static ArrayList <String> getListOfElements(List<WebElement> Data) 
	{
		ArrayList <String> actHead = new ArrayList <String>();
		for (WebElement element : Data)
		{
			actHead.add(element.getText());
		}
		return actHead ;
	}
	
	// 2
	public static ArrayList<String> usersTableheadings()
	{
		ArrayList <String> expHead = new ArrayList <String>();
		expHead.add("#");
		expHead.add("Username"); 
		expHead.add("Email");
		expHead.add("Mobile");
		expHead.add("Course");
		expHead.add("Gender");
		expHead.add("State");
		expHead.add("Action");
		
		return expHead;
	}
	
	// 3
	public static void click(WebElement button)
	{
		button.click();
	}
	
	// 4
	public static void sendkeys(WebElement element, String datatoEnter)
	{
		element.sendKeys(datatoEnter);
	}
	
	// 5
	public static void clear(WebElement element)
	{
		element.clear();
	}
	
	// 6
	public static String getText(WebElement element)
	{
		String actText = element.getText();
		return actText ;
	}
	
	// 7
	public static String getAlertMsg_accept(WebDriver driver)
	{
		Alert al = driver.switchTo().alert();
		String alertMsg = al.getText();
		al.accept();
		return alertMsg ;
	}
	
	// 8
	public static String getAlertMsg_dismiss(WebDriver driver)
	{
		Alert al = driver.switchTo().alert();
		String alertMsg = al.getText();
		al.dismiss();;
		return alertMsg ;
	}

	// 9
	public static String getCurrentUrl(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		return url ;
	}
	
	// 10
	public static String getTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		return title ;
	}
	
	// 11
	public static boolean displayed (WebElement element)
	{
		if(element.isDisplayed()==true)
			return true ;
		else
			return false ;
	}
	
	// 12
	public static ArrayList <String> getPlaceholdersList(List<WebElement> listWbEle) 
	{
		ArrayList <String> actPlaceholders = new ArrayList <String>();
		for (WebElement element : listWbEle)
		{
			actPlaceholders.add(element.getAttribute("placeholder"));
		}
		return actPlaceholders ;
	}
	
	// 13
	public static void clickElementsList(List<WebElement> listWbEle) throws Exception 
	{
		for (WebElement element : listWbEle)
		{
			element.click();
			Thread.sleep(2000);
		}
	}
	
	// 14
	public static ArrayList<String> getListContainingXYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , String Text) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (element.getText().contains(Text))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		return actData ;
	}
	
	// 15
	public static ArrayList<String> getListEqualsXYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , String Text) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (element.getText().equals(Text))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		return actData ;
	}
	
	//16
	public static ArrayList<String> getListLengthXYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , int length) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (element.getText().length()== length)
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		return actData ;
	}
	
	// 17
	public static ArrayList <String> getCompleteSheetData(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2) 
	{
		ArrayList <String> actHead = new ArrayList <String>();
		for (WebElement element : ListWbEle1)
		{
			actHead.add(element.getText());
		}
		for (WebElement element : ListWbEle2)
		{
			actHead.add(element.getText());
		}
		return actHead ;
	}
	
	// 18
	public static ArrayList<String> getListNotContainingXYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , String Text) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (!element.getText().contains(Text))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		return actData ;
	}
	
	// 19
	public static ArrayList<String> getListContainingABC_and_XYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , String Text1 , String Text2) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (element.getText().contains(Text1) && element.getText().contains(Text2))
			{
				System.out.println(name); 
				actData.add(name);
			}
			i++ ;
		}
		return actData ;
	}
	
	// 20 
	public static ArrayList<String> getListContainingABC_not_XYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , String Text1 , String Text2) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		int i=0 ;
		
		for(WebElement element : ListWbEle1)
		{
			String name = ListWbEle2.get(i).getText();
		
			if (element.getText().contains(Text1))
			{
				if (!element.getText().contains(Text2))
				{
					System.out.println(name); 
					actData.add(name);
				}
			}
			i++ ;
		}
		return actData ;
	}
	
	// 21
	public static ArrayList<String> getListContainingNoABC_and_NoXYZ(List<WebElement> ListWbEle1 , List<WebElement> ListWbEle2 , List<WebElement> ListWbEle3 , String Text1 , String Text2) 
	{
		ArrayList<String> actData = new ArrayList<String>();
		
		for (int i=0 ; i<ListWbEle1.size() ; i++ )
		{
			if (!ListWbEle1.get(i).getText().equals("32bit") && !ListWbEle2.get(i).getText().equals("Common"))
			{
				String vname = ListWbEle3.get(i).getText();
				System.out.println(vname);
				actData.add(vname);
			}
		}
		return actData ;
	}
	
	

	//***************************************#####****************************************//
	
	public static ArrayList<String> dashboardPgNavMenu ()
	{
		ArrayList <String> expNavigationMenuText = new ArrayList <String>();
		expNavigationMenuText.add("Dashboard");
		expNavigationMenuText.add("Users"); 
		expNavigationMenuText.add("Operators");
		expNavigationMenuText.add("Useful Links");
		expNavigationMenuText.add("Downloads");
		expNavigationMenuText.add("Logout");
		
		return expNavigationMenuText;
	}
	
	public static ArrayList <String> getToolTipsList(List<WebElement> listWbEle) 
	{
		ArrayList <String> actPlaceholders = new ArrayList <String>();
		for (WebElement element : listWbEle)
		{
			actPlaceholders.add(element.getAttribute("title"));
		}
		return actPlaceholders ;
	}
}