package Selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(driver,10);
WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
ele.sendKeys("3");
WebElement ele1 = driver.findElement(By.xpath("//button[.='Start']"));
ele1.click();
WebElement ele2 = driver.findElement(By.xpath("//select[@name='']"));
Select s = new Select(ele2);
wait.until(ExpectedConditions.visibilityOf(ele2));
s.selectByVisibleText("Yes");



	}

}
