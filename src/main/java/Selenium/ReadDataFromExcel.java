package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void readExcelData(String filepath, String sheetName) throws IOException {

		FileInputStream fis = new FileInputStream(new File(filepath));
		Workbook workook = new XSSFWorkbook(fis);
		Sheet sheet = workook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		for (int i = 1; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				Cell cell = row.getCell(j);
			}
		}
		fis.close();
		Object data;
		return;
	}

}
