package functions;

public class NonStaticFunctions {

	public static void main(String[] args) {
        NonStaticFunctions obj=new NonStaticFunctions();
		obj.sum(10,20);
	}

	public int sum(int a, int b){
		return a+b;
	}
}
