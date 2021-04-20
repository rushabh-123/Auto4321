package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Madhu");
		list.add("Reshma");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	}

}
