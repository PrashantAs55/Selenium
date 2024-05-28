package Groups;

import org.testng.annotations.Test;

public class Meta_testCase 
{
	@Test(groups = "Daily_Run")
	public void module_01()
	{
		System.out.println("It will test one module");
	}
	@Test(groups = "Daily_Run")
	public void module_02()
	{
		System.out.println("It will test sub module");
	}
	
	@Test(groups = "Weekly_Run")
	public void Dryrun()
	{
		System.out.println("It will test moudule which are in demo");
	}
	@Test(groups = "Weekly_Run")
	public void Dryrun_2()
	{
		System.out.println("It will test moudule which are in demo2");
	}
}
