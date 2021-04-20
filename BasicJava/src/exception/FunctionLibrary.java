package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FunctionLibrary {

	public boolean Uploadfile(String filepath)
	{
		
		try {
			FileInputStream file=new FileInputStream(filepath);
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
	}
	public boolean Uploadfile2(String filepath)
	{
		
		
			FileInputStream file=new FileInputStream(filepath);
			return true;
			
		
	}
}
