package stringclass;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Reshma";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.trim());
		
		String stm="My name is reshma";
		String[] arr=stm.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}

		System.out.println(name.equals(stm));
		System.out.println(stm.toLowerCase()); 
		System.out.println(stm.toUpperCase());
	}

}
