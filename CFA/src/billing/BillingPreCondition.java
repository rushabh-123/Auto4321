package billing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BillingPreCondition {
	@BeforeTest	
	public void	billingPreCondition()
	{
		System.out.println("Billing pre conditiond");
		System.out.println("crate reseve number ,premium number");
		System.out.println("*****************");
	}

	@AfterTest
	public void	billingPostCondition()
	{
		System.out.println("billing post condition");
		System.out.println("close the report");
		System.out.println("*****************");
	}

}
