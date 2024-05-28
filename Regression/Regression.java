package Regression;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Regression {

	@Test
	public void method1()
	{
		Reporter.log("Hi",true);
	}
	
	@Test
public void method2()
	{
		Reporter.log("Regression Test",true);
	}
}