package tEstFW;

import org.testng.annotations.Test;

public class Generic_2 extends Generic_1 {
	@Test
	public void Testcase1()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
@Test
public void Testcase2()
{
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
