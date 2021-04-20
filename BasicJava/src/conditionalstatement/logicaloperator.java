package conditionalstatement;

public class logicaloperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		boolean pan=true;
		boolean adhar=false;
		if(pan || adhar)
		{
			System.out.println("you are eligible");
		}else
		{
			System.out.println("you are not eligible");
		}
		boolean graduation=true;
		int age=31;
		if(age<=30 && graduation )
		{
			System.out.println("you are eligible");
		}
	else
	{
		System.out.println("you are  not eligible");
	}
		
	
	

}
}
