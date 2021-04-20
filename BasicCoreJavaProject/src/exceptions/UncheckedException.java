package exceptions;

import functions.AccessModifier;

public class UncheckedException {
   static AccessModifier ref;
   String name;
	public static void main(String[] args) {
		//arithmatic exception
		System.out.println(10/0);
		
		//string index out of bound exception
		String name="anand";
        System.out.println(name.charAt(5));
        
        //
        String[] str={"anand","abc","xyz"};
        System.out.println(str[4]);
        
        ref.publicFunction();
        
	}

}
