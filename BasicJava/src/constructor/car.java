package constructor;

public class car {
	//public static void main(String[] args) {
	//instance veriable
	String color;
	String model;
	int price;
	//int wheels;
	int speed;
	
	//class veriable
	static int wheels=4;
	public void features()
	{
		//local var
		int a=10;
		System.out.println("car features are color:"+color+" Model:"+model+" Speed:"+speed+" Price:"+price+" Wheels:"+wheels);
	}
	//default constructor
	public car()
	{
		
	}
	//parameterised constructor
	public car(String color,String model,int price,int speed) {
		
		this.color=color;
		this.model=model;
		this.price=price;
		this.speed=speed;
		
	}

}
