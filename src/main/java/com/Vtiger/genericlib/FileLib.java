package com.Vtiger.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;







public class FileLib {
/**
 * its used to read data from commonData property file bsed on key
 * @param key
 * @return String value 
 * @throws Throwable
 * 
 */
	
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\avips\\eclipse-workspace\\Selenium\\src\\commonData.properties");

		// step-2 : create an object to properties to load all keys
		Properties pObj = new Properties();
		pObj.load(fis);
		String value =pObj.getProperty(key);
		return value;
	}
		
	/**
	 * Its  used to read data from Book1.xlsx  file based on user argument
	 * @Param sheetNum ,rowNum,cellNum 	
	 * @param data
	 * @throws Throwable
	 */
		
		public String getExcelData(String sheetname, int rowNum , int cellNum) throws  Throwable{
		FileInputStream fis = new FileInputStream("C:\\Users\\avips\\Documents\\Book1.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowNum);
		String data =row.getCell(cellNum).getStringCellValue();
		wb.close();
		
		return data;
		
	}
	
	/**
	 * it is write data back to BOOk1.xlsx file based on user argument
	 * @param sheetname , rollname , cellNum
	 * @param data
	 * throws throwable 
	 * 
	 */
	
	public void setExcelData(String sheetName , int rowNum , int cellNum , String data) throws Throwable {
		FileInputStream fis =new FileInputStream("C://Users//avips//Documents//Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C://Users//avips//Documents//Book1.xlsx");
		wb.write(fos);
		wb.close();
		
	}
	
	public void execuetDbquery(String query) {
		
	}
}
