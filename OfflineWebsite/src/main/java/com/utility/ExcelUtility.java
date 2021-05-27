package com.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtility 
{
	WebDriver driver;
	
	// To get data from particular Column..
	public static ArrayList<String> getTableColData(String fileNm, String sheetNm, int colNo, int fromRow)throws Exception
	{
		ArrayList<String> expData=new ArrayList<String>();
		String value=null;
		String path=System.getProperty("user.dir")+"/src/test/resources/"+fileNm;
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetNm);
		
		int row = sh.getPhysicalNumberOfRows();
		
		for (int i=fromRow ; i<row ; i++) 
		{
			Cell cell = sh.getRow(i).getCell(colNo);
			DataFormatter df = new DataFormatter();
			value = df.formatCellValue(cell);
			expData.add(value);
		}
		return expData;
	 }
	 
	 
	// To get data from particular Row..
	public static ArrayList<String> getTableRowData(String fileNm ,String sheetNm ,int rowNo ,int fromCol)throws Exception
	{
		ArrayList<String> expData=new ArrayList<String>();
		String value = null;
		String path = System.getProperty("user.dir")+"/src/test/resources/"+fileNm;
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNm);
		
		int col = sh.getRow(rowNo).getLastCellNum();
		
		for (int i=0 ; i<col ; i++) 
		{
			Cell cell = sh.getRow(rowNo).getCell(i);
			DataFormatter df = new DataFormatter();
			value = df.formatCellValue(cell);
			expData.add(value);
		}
		return expData;
	 }
	 
	
	// To get data of complete sheet..
	public static ArrayList<String> getTableData(String fileNm, String sheetNm)throws Exception
	{
		ArrayList<String> expData = new ArrayList<String>();
		String value = null;
		String path = System.getProperty("user.dir")+"/src/test/resources/"+fileNm;
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNm);
		
		int row = sh.getPhysicalNumberOfRows();
		
		for (int i=0 ; i<row ; i++) 
		{
			int col = sh.getRow(i).getLastCellNum();
			
			for (int j=0; j<col ; j++) 
			{
				Cell cell = sh.getRow(i).getCell(j);
				DataFormatter df = new DataFormatter();
				value = df.formatCellValue(cell);
				expData.add(value);
			}
		}
		return expData;
	 }
	
	
	// To get data for login from particular columns..
	public static  HashMap<String, String> readUnameAndPass(String fileNm, String sheetName, int unameCol, int passCol , int fromRow) throws Exception
	{
		HashMap<String, String> data= new HashMap<String, String>();
		String path = System.getProperty("user.dir")+"/src/test/resources/"+fileNm;
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		
		int row= sh.getPhysicalNumberOfRows();
		
		for(int i=fromRow ; i<row ; i++)
		{	
			DataFormatter df = new DataFormatter();
			String uname =df.formatCellValue(sh.getRow(i).getCell(unameCol));
			String pass =df.formatCellValue(sh.getRow(i).getCell(passCol));
			data.put(uname, pass);		
		}
		return data;
	}
}
