package Groups;

import org.testng.annotations.Test;

public class TestCase_02_Multiple 
{
	@Test(groups = "Regression")
	public void regression_1()
	{
		System.out.println("It regression test");
	}
	@Test(groups = "Regression")
	public void regression_2()
	{
		System.out.println("It regression test");
	}
	@Test(groups = "System")
	public void System_1()
	{
		System.out.println("It System test");
	}
	@Test(groups = "System")
	public void System_2()
	{
		System.out.println("It System test");
	}
}
