package exception;

public class TC_tracsaction_01 {
static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println(10/2);
		

		System.out.println(name.charAt(9));
		String[] arr= {};
		System.out.println(arr[1]);
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println(ae.getMessage());
		}
		catch(NullPointerException ae)
		{
			
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			
			System.out.println(ae.getMessage());
		}
		
	}

}
