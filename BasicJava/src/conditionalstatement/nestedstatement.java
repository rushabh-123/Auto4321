package conditionalstatement;

public class nestedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean login=true;
		boolean createAccountt=true;
		boolean fundTrasfer=true;
		
		if (login)
		{
			if(createAccountt)
			{
				if(fundTrasfer)
				{
					System.out.println("success");
				}
				else
				{
					System.out.println("fail");
				}
			}
				else
				{
					System.out.println("fail");
					
				}
		}
		else
		{
			System.out.println("fail");
				
			}
		}
		
		
		
		
		
	
	

}
