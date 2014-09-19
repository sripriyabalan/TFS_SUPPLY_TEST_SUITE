package com.TaxiForSure.Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	// String
	String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\com\\TaxiForSure\\TestData\\testdata.xlsx";
	public static Workbook ExcelWBook;
	public static Sheet ExcelWSheet;
	public static Cell Cell;
	public static Row Row;

	public Object[][] testData( String SheetName)
			throws Exception {

		FileInputStream fis = new FileInputStream(filePath);
		ExcelWBook = WorkbookFactory.create(fis); 
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int totalRows = ExcelWSheet.getLastRowNum();
		int ci, cj;
		// Get total number of columns
		int noOfColumns = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();// getPhysicalNumberOfCells()
		String[][] arr = new String[totalRows][noOfColumns];
		ci = 0;
		
		for (int i = 1; i <= totalRows; i++, ci++) {
			cj = 0;
			for (int j = 0; j < noOfColumns; j++, cj++) {

				// Cell cell =
				arr[ci][cj] = getCellData(i, j);
				// System.out.println(arr[ci][cj]);
			}
		}
		return arr;
	
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			int dataType = Cell.getCellType();
			if (dataType == 3) {
				return "";
			} else {
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw (e);
		}

	}
}
