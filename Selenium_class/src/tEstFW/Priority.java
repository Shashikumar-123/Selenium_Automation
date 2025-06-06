package tEstFW;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test
	public void TestCase1()
	{
	Reporter.log("This is first test execute",true);
							
			}
	@Test
	public void TestCase2()
	{
		Reporter.log("This is second test execute",true);
	}
	@Test(priority=1)
	public void TestCase3()
	{
		Reporter.log("This is Third test execute",true);
	}
	
}

