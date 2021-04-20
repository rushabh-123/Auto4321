package billing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_UsageValidation {

	@BeforeClass	
	public void	usageValidationPreCondition()
	{
		System.out.println("usageValidation pre conditiond");
		System.out.println("*****************");
	}

	@AfterClass
	public void	usageValidationPostCondition()
	{
		System.out.println("usageValidation post condition");
		System.out.println("*****************");
	}
	
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Before method");
		System.out.println("reload the page,clear database table,delete log file");
		System.out.println("*****************************");
	}
	
	@AfterMethod
	public void postCondition()
	{
		System.out.println("After method");
		System.out.println("check the status of testcase and capture screenshot");
		System.out.println("**************************");
		
	}
	
	@Test
	public void checkTotalBillableMins()
	{
		System.out.println("checkTotalBillableMins");
	}
	
	@Test
	public void checkPremiumMins()
	{
		System.out.println("checkPremiumMins");
	}
	
	@Test
	public void checkLongDistanceMins()
	{
		System.out.println("checkLongDistanceMins");
	}
}
