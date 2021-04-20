package conditionalStatements;

public class NestedStatements {

	public static void main(String[] args) {
		boolean login=true;
		boolean createAccount=false;
		boolean fundTransfer=true;
		if(login){
			if(createAccount){
				if(fundTransfer){
					System.out.println("fund transfer successful");
				}else{
					System.out.println("fund transfer failed");
				}
			}else{
				System.out.println("create account failed");
				}
		}else{
			System.out.println("login failed");
		}
		

	}

}
