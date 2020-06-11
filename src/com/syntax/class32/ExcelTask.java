package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask {

	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/andrii/eclipse-workspace/JavaBasics/testdata/Test1.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();

		// find number of columns
		int cols = sheet.getRow(0).getLastCellNum();

		// get data from all rows and columns
		for (int r = 0; r < rows; r++) {// iterates over rows
			for (int c = 0; c < cols; c++) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal + "  ");
			}
			System.out.println();
		}

	}

}
