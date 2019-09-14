package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_Utils {
	
	public static ArrayList<Object[]> getdatafromExcel() throws IOException {
		
		ArrayList<Object[]> mydata =new ArrayList<Object[]>();
		FileInputStream fis;
		 XSSFWorkbook workbook=null;
			XSSFSheet sheet;
			 Row row;
			 Cell cell;
			fis=new FileInputStream("./ExcelFiles/testdata.xlsx");
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet("BaseData");
			int rowCount=sheet.getLastRowNum();
			
			for(int i=1;i<=rowCount;i++)
			{
					 String firstname=sheet.getRow(i).getCell(0).getStringCellValue();
					 String middlename=sheet.getRow(i).getCell(1).getStringCellValue();
					 String lastname=sheet.getRow(i).getCell(2).getStringCellValue();
					 
					  Object[] ob= {firstname,middlename,lastname} ;
					  mydata.add(ob);
					 
		    }
			return mydata;
			}
}
