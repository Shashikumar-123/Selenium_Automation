package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Width_of_element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore/delivery");
		Thread.sleep(2000);
	WebElement size = driver.findElement(By.xpath("//div[.='Delivery']"));
	Thread.sleep(2000);
	Dimension abc = size.getSize();
	System.out.println(abc);
	System.out.println(abc.getHeight());
	System.out.println(abc.getWidth());
	//height_width_font-family
	 String val = size.getCssValue("height");
	 System.out.println(val);
	 System.out.println(size.getCssValue("width"));
	 System.out.println(size.getCssValue("font-family "));
	 System.out.println("white-space-collapse ");
		
	}

}
