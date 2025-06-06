package tEstFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pom {
	WebDriver driver;
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("shashi");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("shashi@123");
		driver.navigate().refresh();
		un.sendKeys("kumar");
		
		
		
		driver.close();
	}

}
