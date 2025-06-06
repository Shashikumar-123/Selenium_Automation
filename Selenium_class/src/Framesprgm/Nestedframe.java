package Framesprgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame1);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("shashi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kumaar1233");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
driver.switchTo().frame(frame1);
		
	driver.findElement(By.id("email")).sendKeys("Shashi");
	driver.findElement(By.id("password")).sendKeys("shashi@123");
	driver.findElement(By.id("confirm-password")).sendKeys("shashi@123");
	//driver.findElement(By.id("submitButton")).click();
	driver.switchTo().defaultContent();
	//driver.switchTo().parentFrame();
	Thread.sleep(2000);
	
WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));

driver.switchTo().frame(frame2);
driver.findElement(By.id("username")).sendKeys("kumarqwe");
driver.findElement(By.id("password")).sendKeys("kumar");
*/
	
	
	}}
