package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
     
	public int getNumberOfRows(String filePath, String sheetName) throws IOException
	{
		
		FileInputStream file= new FileInputStream(filePath);
		
		//1. Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//2. Sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getNumberOfCells(String filePath, String sheetName) throws IOException
	{
		
		FileInputStream file= new FileInputStream(filePath);
		
		//1. Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//2. Sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		XSSFRow row=sheet.getRow(0);
		
		return row.getPhysicalNumberOfCells();
	}
	
	public String getCellData(String filePath, String sheetName, int rowNum, int colNum) throws IOException
	{
		FileInputStream file= new FileInputStream(filePath);
		
		//1. Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//2. Sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		//3. Rows
		XSSFRow row=sheet.getRow(rowNum);
		
		System.out.println(row.getPhysicalNumberOfCells());
		
		//4. Cols
		XSSFCell cell=row.getCell(colNum);
		
		//5. Data
		String data=cell.getStringCellValue();
		
		return data;
	}



}
