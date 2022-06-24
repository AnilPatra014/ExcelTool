package com.excelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	 
	@Test
	public void readdata() throws IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/Qspider.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("Anil");
		Row r = s.getRow(9);
		Cell c=r.getCell(5);
		System.out.println(c.getStringCellValue());
		
		
	}

}
