package Framesprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiframe {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Dell/Desktop/Multimainpage.html");
			driver.manage().window().maximize();
			 WebElement un = driver.findElement(By.id("u1"));
			 un.sendKeys("shashikumar");
			 driver.switchTo().frame("f1");
		 driver.findElement(By.id("u1")).sendKeys("Admin@123");
		driver.switchTo().defaultContent();
		 driver.switchTo().frame("f2");
		 driver.findElement(By.id("p1")).sendKeys("Admin@123");
			
			 

	}

}
