package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		//set not allows duplicate values
		//no order for hash set
		Set<String> set=new HashSet<>();
		
		set.add("Madhu");
		set.add("Snehal");
		set.add("Reshma");
		set.add("Madhu");
		
		
		for(String s:set)
		{
			System.out.println(s);
		}
		System.out.println("*****************************************");
		//linked hash set 
		//get the order wise
		Set<String> set1=new LinkedHashSet<>();
		
		set1.add("Snehal");
		set1.add("Madhu");
		set1.add("Reshma");
		
		
		for(String s:set1)
		{
			System.out.println(s);
		}
		System.out.println("*****************************************");
		//values to be sorted
       set=new TreeSet<>();
		
		set1.add("Snehal");
		set1.add("Madhu");
		set1.add("Reshma");
		
		
		for(String s:set1)
		{
			System.out.println(s);
		}
		

	}

}
