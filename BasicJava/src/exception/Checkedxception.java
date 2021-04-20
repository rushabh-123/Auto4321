package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import functions.Functionclass1;

public class Checkedxception {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("Anand");
		Functionclass1.sum(10, 20);
		
		
		System.out.println("Moentek");
		wai2t(1000);
		wait(2000);
		readExcelFileData("");
		

	}
	public static void wait(int time) throws InterruptedException

	{
		Thread.sleep(time);
	}
	public static void wai2t(int time)

	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readExcelFileData(String filepath) throws FileNotFoundException 
	{
		FileInputStream file=new FileInputStream(filepath);
		
	}
}
