package functions;

public class TestAccessModifiersAtPackageLevel {

	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.publicFunction();
        obj.protectedFunction();
        obj.defaultFunction();
	}

}
