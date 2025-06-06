package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_tagname {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore/delivery");
		Thread.sleep(2000);
	WebElement tag = driver.findElement(By.cssSelector("img[loading='lazy']"));
	System.out.println(tag.getTagName());
	Thread.sleep(2000);
	System.out.println(tag.getLocation());
		
		
	}

}
