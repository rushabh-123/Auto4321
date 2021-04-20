package functions;

public class ReturnType {

	public static void main(String[] args) {
		int var=sum(10,20);
		int var2=sum(30,40);
		System.out.println(var+var2);
		
		boolean var3=eligibility(30,true);
		System.out.println(var3);
	}
    public static boolean eligibility(int age, boolean graduation) {
    	if(age<=30 && graduation)
    	{
    		return true;
    	}else{
    		return false;
    	}
	}
	public static int sum(int a, int b){
	return a+b;
   }

}

