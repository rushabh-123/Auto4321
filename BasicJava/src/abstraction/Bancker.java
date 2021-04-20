package abstraction;

public class Bancker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
RBI bank=new HDFC();
bank.savingaccount();
bank.curentaccount();
bank.creaditcard();
bank.debitcard();
bank=new SBI();
*/
		script(new HDFC());
		script(new SBI());
		script(new ICICI());
		

	}
	public static void script(RBI bank)
	{
		bank.savingaccount();
		bank.curentaccount();
		bank.creaditcard();
		bank.debitcard();
	}

}
