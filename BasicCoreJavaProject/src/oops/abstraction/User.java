package oops.abstraction;

public class User {

	public static void main(String[] args) {
	
		script(new A());
		//script(new B());
		
		Parent obj;
	    
		WordPad product= new Sprint3();
		
		product.copy();
		product.delete();
		product.edit();
		product.format();
		product.save();
		product.paste();

	}
    public static void script(Parent obj){
	{
		 obj.fun1();
		 obj.fun2();
	}
 }
}
