package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_Script_01 
{
	@Test
	public static void method1()
	{
		Reporter.log("Hello",true);
	}
	
	@Test

		public static void method2()
		{
			Reporter.log("Hi",true);
		}
	}

