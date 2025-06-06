package Selenium_practice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
String title = driver.getTitle();
System.out.println(title);
wait.until(ExpectedConditions.urlContains("https://www.flipkart.com/"));
String url = driver.getCurrentUrl();
System.out.println(url);

WebElement ele = driver.findElement(By.xpath("//input[@autocomplete='off']"));
ele.sendKeys("shoes");
Robot r =new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());


System.out.println(driver.getTitle());

	}}

