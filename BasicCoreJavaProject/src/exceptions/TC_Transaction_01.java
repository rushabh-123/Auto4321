package exceptions;

public class TC_Transaction_01 {
	static String name;
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
			
			System.out.println(name.charAt(9));
			
			String[] arr={};
			System.out.println(arr[1]);
			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("finally block");
		}

	}

}
