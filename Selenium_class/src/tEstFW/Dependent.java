package tEstFW;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependent {
	@Test
	public void Signup()
	{
System.out.println("this is signin page");							
			}
	@Test(dependsOnMethods="Signup")
	public void Login()
	{
		System.out.println("this is Login page");							
	}
	@Test(dependsOnMethods="Login")
	
	public void Home()
	{Assert.fail();
		
		System.out.println("this is home page");							
	}
	@Test(dependsOnMethods="Home")
	public void Logout()
	{
		System.out.println("this is logout page");							
	}
	
}

