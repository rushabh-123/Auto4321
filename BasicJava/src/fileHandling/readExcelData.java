package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelData {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filepath="D:\\Selenium-Automation\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx";

		FileInputStream file= new FileInputStream(filepath);

		//1.Workbook
		XSSFWorkbook wbs= new XSSFWorkbook(file);

		//2.Sheet
		XSSFSheet sheet=wbs.getSheet("Sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());

		//3. Rows
		XSSFRow row=sheet.getRow(0);
		System.out.println(row.getPhysicalNumberOfCells());


		//4.Cols
		XSSFCell cell=row.getCell(0);

		//5. Data
		String data=cell.getStringCellValue();

		System.out.println(data);



}
}
