package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/andrii/Documents/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		//accessing workbook
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet1");
		//accessing row
		Row row1 = sheet.getRow(0);
		//accessing cell
		Cell cell = row1.getCell(1);
		//get value from cell
		String row1cell2 = cell.toString();
		System.out.println(row1cell2);//LastName
		
		//how to get New York from excel
		String r2c3 = sheet.getRow(2).getCell(2).toString();
		System.out.println(r2c3);
		//how to access VA
		String r1c3 = sheet.getRow(1).getCell(3).toString();
		System.out.println(r1c3);
		//to retrieve value based on type
		double cellv = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);//convert to int
		//how to get 20151 in string format
		String valC = sheet.getRow(1).getCell(4).toString();
		String[] arr = valC.split("\\.");
		System.out.println(arr[0]);
		
		
		
	}

}
