package Groups;

import org.testng.annotations.Test;

public class Depends_TestCase 
{
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
	@Test(dependsOnGroups="smoke")
	public void Smoke_02()
	{
		System.out.println("It is Smoke test case 2");	
	}
}
