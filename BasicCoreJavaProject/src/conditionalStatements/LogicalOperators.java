package conditionalStatements;

public class LogicalOperators {
	public static void main(String[] args){
		//OR
		boolean PAN=true;
		boolean aadhar=false;
		if(PAN || aadhar)
		{
			System.out.println("you are eligible");
		}else{
			System.out.println("you are not eligible");
		}
		
		//And
		int age=41; //30
		boolean graduation=true;	
				
		if(age<=30 && graduation)
		{
			System.out.println("you are eligible");
		}else{
			System.out.println("you are not eligible");
		}
		
		
		
	}

}
