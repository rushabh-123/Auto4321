package variablesAndDataTypes;

import functions.AccessModifier;

public class TestAccessModifiersAtProjectLevel extends AccessModifier{

	public static void main(String[] args) {
			AccessModifier obj=new AccessModifier();
			obj.publicFunction();
			
			TestAccessModifiersAtProjectLevel obj2=new TestAccessModifiersAtProjectLevel();
			obj2.protectedFunction();
			
		}


	}


