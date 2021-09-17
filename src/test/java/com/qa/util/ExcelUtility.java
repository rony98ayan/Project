package com.qa.util;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static  FileInputStream fileloc;
     public static XSSFWorkbook wbook;	  
     public static XSSFSheet wsheet;
     public static XSSFRow row;
     public static XSSFCell col;
     
     public static int getRowCount(String xFile,String xSheet) throws IOException
     {
    	 fileloc=new FileInputStream(xFile);
    	 wbook=new XSSFWorkbook(fileloc);
    	 wsheet=wbook.getSheet(xSheet);
    	 int rowcount=wsheet.getLastRowNum();
    	 return rowcount;
    	 
     }
     public static int getCellCount(String xFile,String xSheet,int rowNum) throws IOException
     {
    	 fileloc=new FileInputStream(xFile);
    	 wbook=new XSSFWorkbook(fileloc);
    	 wsheet=wbook.getSheet(xSheet);
    	 row=wsheet.getRow(rowNum);
    	 int cellCount=row.getLastCellNum();
    	 return cellCount;
     }
     public static String getCellData(String xFile,String xSheet,int rowNum,int cellNum) throws IOException
     {
    	 fileloc=new FileInputStream(xFile);
    	 wbook=new XSSFWorkbook(fileloc);
    	 wsheet=wbook.getSheet(xSheet);
    	 row=wsheet.getRow(rowNum);
    	 
    	 col = row.getCell(cellNum);
    	 DataFormatter formatter=new DataFormatter();
    	 String cellData=formatter.formatCellValue(col);
    	 wbook.close();
    	 fileloc.close();
    	 return cellData;
    	 
    	 
     }
}
