package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {
	public static void main(String []args) throws IOException{
		String filePath="E:\Moentek Automation Training\BasicCoreJavaProject\src\fileHandling\TestData.xlsx";
		
		FileInputStream file=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//sheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());
		//row
		XSSFRow row=sheet.getRow(0);
		System.out.println(row.getPhysicalNumberOfCells());
		
		//cols
		XSSFCell cell=row.getCell(0);
		
		//data
		String data=cell.getStringCellValue();
		System.out.println(data);
		
	}

}
