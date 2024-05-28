package Groups;

import org.testng.annotations.Test;
@Test(groups="CompleteTestcase")
public class Partial_Execution_testCase_03 
{

	@Test(groups = "testsample")
	public void module_01()
	{
		System.out.println("It will test one module");
	}
	@Test(groups = "testsample")
	public void module_02()
	{
		System.out.println("It will test sub module");
	}
	
	@Test(groups = "Demo01")
	public void Dryrun()
	{
		System.out.println("It will test moudule which are in demo");
	}
	@Test(groups = "Demo01")
	public void Dryrun_2()
	{
		System.out.println("It will test moudule which are in demo2");
	}
}
