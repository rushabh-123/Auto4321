package functions;

public class AccessModifier {

	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.publicFunction();
        obj.privateFunction();
        obj.protectedFunction();
        obj.defaultFunction();
	}
    public void publicFunction()
    {
       System.out.println("public function");	
    }
    private void privateFunction(){
	System.out.println("private function");
    }
    protected void protectedFunction(){
	System.out.println("protected function");
    }
    void defaultFunction(){
	System.out.println("default function");
    }
}
