package com.crm.qa.utlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
//	public static final String TEST_DATA_SHEET="C:\\Users\\Gopi\\eclipse-workspace\\May_2022_POM_Searies\\src\\main\\java\\com.crm.qa.testdata\\Test Data-1.xlsx\"";
	public static final String TEST_DATA_SHEET="C:\\Users\\kiran\\Downloads\\May_2022_POM_Searies\\May_2022_POM_Searies\\src\\main\\java\\com\\crm\\qa\\testdata\\Test Data-1.xlsx";


	public static Workbook book;
	public static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		Object[][] data=null;
		try {
			FileInputStream fi= new FileInputStream(TEST_DATA_SHEET);
			book=WorkbookFactory.create(fi);
			sheet=book.getSheet(sheetName);
			data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i<sheet.getLastRowNum(); i++) {
				for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch(IOException e) {
			
		}
		return data;
		
	}
	
	
	

}
