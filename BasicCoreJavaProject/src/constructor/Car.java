package constructor;

public class Car {
    //instance variable
	String colour;
	String model;
	int speed;
	int price;
	int wheel;
	
	static int wheels=4;
	
	public void features(){
		//local variable
		int a=10;
		System.out.println("car features are colour"+colour+"", model="+model+", speed="+speed+", price="+price+", wheel="+wheel+"  );
	}
	//default constructor
	public Car(){
		
	}
	
	//Parameterized constructor
	public Car(String colour, String model, int speed, int price){
		this.colour=colour;
		this.model=model;
		this.speed=speed;
		this.price=price;
	}
}
