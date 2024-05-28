package System;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class System {

	@Test
	public void method1()
	{
		Reporter.log("Hi",true);
	}
	
	@Test
public void method2()
	{
		Reporter.log("System Test",true);
	}
}