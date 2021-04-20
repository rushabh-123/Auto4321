package abstraction;

public class ICICI implements RBI{

	public void savingaccount() {
		// TODO Auto-generated method stub
		System.out.println("saving a/c icici");
	}

	@Override
	public void curentaccount() {
		// TODO Auto-generated method stub
		System.out.println("current a/c icici");
	}

	@Override
	public void debitcard() {
		System.out.println("debit card icici");
		
	}

	@Override
	public void creaditcard() {
		System.out.println("creadit card icici");
		
	}
}
