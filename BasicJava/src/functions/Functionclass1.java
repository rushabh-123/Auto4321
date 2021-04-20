package functions;

public class Functionclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(10,20,30);
		nonstaticfunctions obj=new nonstaticfunctions();
		obj.sum(10,20);
		
	}
	public static void sum(int a,int b)
	{
		
		
		System.out.println(a+b);

	}
	public static void sum(int a,int b , int c)
	{
		
		
		System.out.println(a+b+c);

	}
	public static void elligible(int age,boolean graduation)
	{
		if(age<=30 && graduation )
		{
			System.out.println("you are eligible");
		}
	else
	{
		System.out.println("you are  not eligible");
	}
		
		
	}
//pass array to function
	

}
