package Groups;

import org.testng.annotations.Test;

public class TestCase_01 
{
	// It is example of how to make groups in test case TestNG
	
	@Test(groups="function")
	public void function_01()
	{
		System.out.println("It is function test case 1");
	}
	@Test(groups="function")
	public void function_02()
	{
		System.out.println("It is function test case 2");	
	}
	@Test(groups="smoke")
	public void Smoke_01()
	{
		System.out.println("It is Smoke test case 1");
	}
	@Test(groups="smoke")
	public void Smoke_02()
	{
		System.out.println("It is Smoke test case 2");	
	}
}
