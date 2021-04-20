package functions;

public class Accessmodifire {
	public static void main(String[] args) {
		Accessmodifire obj=new Accessmodifire();
		obj.publicfunction();
		obj.protectedfunction();
		obj.prifunction();
		obj.defaultfr();
	
	
	}
public void publicfunction()
{
	System.out.println("public");
}
protected void protectedfunction()
{
	System.out.println("protected");
}
private void prifunction()
{
	System.out.println("private");
}
 void defaultfr()
{
	System.out.println("default");
}

}
