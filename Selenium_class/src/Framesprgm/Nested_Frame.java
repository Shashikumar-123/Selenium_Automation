package Framesprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Mainpage.html");
		driver.manage().window().maximize();
		 WebElement un = driver.findElement(By.id("u1"));
		 un.sendKeys("shashi");
		 driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 
		WebElement pswd = driver.findElement(By.id("p1"));
		pswd.sendKeys("sipl@123");
	WebElement framea = driver.findElement(By.name("frame2"));
	driver.switchTo().frame(framea);
	 Thread.sleep(2000);

WebElement cpswd = driver.findElement(By.id("c1"));
cpswd.sendKeys("sipl@123");
Thread.sleep(2000);
driver.findElement(By.id("c1")).clear();
driver.switchTo().parentFrame();
driver.findElement(By.id("p1")).clear();
driver.switchTo().parentFrame();
driver.findElement(By.id("u1")).clear();


		 
		
	}

}
