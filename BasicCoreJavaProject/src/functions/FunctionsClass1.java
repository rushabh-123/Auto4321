package functions;

public class FunctionsClass1 {

	public static void main(String[] args) {
	  sum(10,20);	
	  sum(30,40);
	  sum(10,20,30);
	}
	//access modifier //nature/type of method //return type   //name of function //parameters/arguments
	public           static                   void              sum               (int a, int b)
	{
		 //10,20
		System.out.println(a+b);
	}
	
    public static void sum(int a, int b, int c){
    	System.out.println(a+b+c);
    }
    
    public static void eligibility(int age, boolean graduation)
    {
    	if(age<=30 && graduation)
		{
			System.out.println("you are eligible");
		}else{
			System.out.println("you are not eligible");
		}
    }
//can we pass array in function parameters
    public static void array()
    {
    	 //int[] arrr={10, 20, 30, 40};
    	int[] arrr1= new int[4];
        arrr1[0]=10;
 	    arrr1[1]=20;
 		arrr1[2]=30;
 		arrr1[3]=40;
 		for(int i=0; i<arrr1.length; i++){
			System.out.println(arrr1[i]);
		}
    }
}
