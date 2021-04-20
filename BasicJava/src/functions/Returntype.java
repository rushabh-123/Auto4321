package functions;

public class Returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=sum(10,20);
		int var2=sum(10,20);
		System.out.println(var*var2);
		boolean var3=elligible(30,true);
		System.out.println(var3);

	}
	public static int sum(int a,int b)

	{
		
		return a+b;
	}
	public static boolean elligible(int age,boolean graduation)
	{
		if(age<=30 && graduation )
		{
			return true;
			
		}
	else
	{
		return false;
	}
		
		
	}
}
