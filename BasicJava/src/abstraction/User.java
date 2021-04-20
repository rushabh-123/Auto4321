package abstraction;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		script(new a());
		script(new B());
		
		Wordpad p=new Sprint3();
		p.copy();
		p.paste();
		p.edit();
		p.delete();
		p.format();
		p.save();
		
		
		

	}
	public static void script(Parent obj)
	{
		obj.fun1();
		obj.fun2();
		
	}

}
