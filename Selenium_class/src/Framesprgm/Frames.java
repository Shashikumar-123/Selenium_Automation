package Framesprgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
driver.switchTo().frame(frame1);
		 WebElement ele = driver.findElement(By.id("email"));
		 ele.sendKeys("shashikumar150910@gmail.com");
		 
		 
		

}}
