package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alltexts_inwebpage {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			WebElement abc = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
			Thread.sleep(2000);
			String txt = abc.getText();
			System.out.println(txt);
			driver.close();
			
	}
}
