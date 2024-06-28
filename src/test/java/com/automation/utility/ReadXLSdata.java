package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSdata {


public static String[][] getData(String path,String excelSheetName) throws EncryptedDocumentException, IOException, InvalidFormatException
{
	File fi=new File(path);
	FileInputStream fis=new FileInputStream(fi);
	XSSFWorkbook wb =new XSSFWorkbook(fi);
	XSSFSheet sheetname=wb.getSheet(excelSheetName);
	int totalRows=sheetname.getPhysicalNumberOfRows();
	System.out.println(totalRows);
	XSSFRow rowcells=sheetname.getRow(0);
	int totalCols=rowcells.getLastCellNum();
	System.out.println(totalCols);
	
	DataFormatter format=new DataFormatter();
	String testData[][]=new String[totalRows][totalCols];
	for(int i=0;i<totalRows;i++)
	{
		for(int j=0;j<totalCols;j++)
		{
			testData[i][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
			System.out.println(testData[i][j]);
			
		}
	}
	return testData;
}
}
