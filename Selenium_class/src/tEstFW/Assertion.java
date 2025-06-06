package tEstFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void CheckTitle()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String ExpectedResult="abcds";//WhatsApp Web
		String ActualResult = driver.getTitle();
	System.out.println("Assertion done");	
	Assert.assertEquals(ActualResult, ExpectedResult);
	driver.close();
	}

}
