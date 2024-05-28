package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_02 
{
	@Test

		public static void methodinput()
	{		
		Reporter.log("Enter the data here",true);
		
	}
	@Test
	public static void methodresult()
	{
		Reporter.log("Data has been entered",true);
	}
}
