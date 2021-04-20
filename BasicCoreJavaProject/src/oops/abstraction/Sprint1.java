package oops.abstraction;

public abstract class Sprint1 extends WordPad {

	
		@Override
		public void edit(){
			System.out.println("edit feature");
		}
		
		@Override
		public void copy(){
			System.out.println("copy feature");
		}
		
		//we can not have abstract methods inside a concrete class
		//we can have any number of concrete methods inside abstract class
		
	

}
