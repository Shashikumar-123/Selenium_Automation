package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_Atributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in//");
		Thread.sleep(2000);
		WebElement abc = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);

		String txt = abc.getAttribute("aria-label");
		System.out.println(txt);
		driver.quit();
		
	}

}
