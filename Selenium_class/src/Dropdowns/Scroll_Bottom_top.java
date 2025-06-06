package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Bottom_top {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				 Thread.sleep(2000);
				 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
