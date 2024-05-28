package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Priority 
{
		// 3 Methods like Priority
	   // Invocable
	  // dependsOnMethod
	@Test(priority = 1)
	public void priority()
	{
		Reporter.log("Hello",true);	
	}
	@Test(priority = 0)
	public void priority2()
	{
		Reporter.log("There",true);
		
	}
	//invocable
	@Test(invocationCount = 5)
	public void Demo1()
	{
		Reporter.log("Print 2");
	}
	
	
	
	
	
	
	
	
	
	
}

	
