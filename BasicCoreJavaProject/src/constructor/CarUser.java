package constructor;

public class CarUser {

	public static void main(String[] args) {
     
		Car car1=new Car(){
			car1.colour="white";
			car1.model="polo";
			car1.price=10000000;
			car1.speed=120;
			car1.features();
		}
         
		Car car2=new Car(){
			car2.colour="silver";
			car2.model="alto";
			car2.price=1000000;
			car2.speed=130;
			car2.features();
		}
		
		Car car3=new Car(){
			car3.colour="red";
			car3.model="city";
			car3.price=100000;
			car3.speed=100;
			car3.features();
		}
	}

}
