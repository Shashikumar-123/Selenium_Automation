package tEstFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_1 {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void Browserclose()
	{
		driver.close();
	}

}
