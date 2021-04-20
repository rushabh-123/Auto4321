package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Telephone tel=new Telephone();
		tel.calling();
		
		Mobile mob=new Mobile();
		mob.texting();
		
		Telephone sm=new SmartPhone();
		
		sm.calling();

	}

}
