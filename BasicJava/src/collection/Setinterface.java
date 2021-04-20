package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.list.TreeList;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		set.add("snehal");
		set.add("reshma");
		set.add("madhu");
		set.add("madhu");
		for(String s:set)
			
		{
			
			System.out.println(s);
		}
		
		System.out.println("********************");
		set=new LinkedHashSet<>();
		set.add("snehal");
		set.add("reshma");
		set.add("madhu");
		set.add("madhu");
		for(String s:set)
			
		{
			
			System.out.println(s);
		}
		
		System.out.println("********************");
		set=new TreeSet<>();
		set.add("snehal");
		set.add("reshma");
		set.add("madhu");
		set.add("madhu");
		for(String s:set)
			
		{
			
			System.out.println(s);
		}
		
	}

}
