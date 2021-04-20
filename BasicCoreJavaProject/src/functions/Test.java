package functions;

public class Test {

	public static void main(String[] args) {
		 FunctionsClass1.sum(10, 20);
		 FunctionsClass1.sum(30, 20);
		
		 FunctionsClass1.eligibility(31, true);
		 FunctionsClass1.eligibility(30, true);
		 
		 FunctionsClass1.array();
		 
		 NonStaticFunctions obj=new NonStaticFunctions();
		 obj.sum(11, 22);
		 
	}

}
