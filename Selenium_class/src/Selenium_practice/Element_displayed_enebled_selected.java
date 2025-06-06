package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_displayed_enebled_selected {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//div[.='Explore more']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//section[.='Radio Button']")).click();
Thread.sleep(3000);
 WebElement rb =driver.findElement(By.id("attended"));
 if(rb.isDisplayed())
 {
	 System.out.println("yes displayed");
 }
 else
 {
	 System.out.println("no display");
 }
 if(rb.isEnabled())
 {
	 System.out.println("yes enebled");
 }
 else
 {
	 System.out.println("no eneble");
 }
 if(rb.isSelected())
 {
	 System.out.println("yes selected");
 }
 else
 {
	 //System.out.println("no selected");

	 rb.click();
 }
Thread.sleep(3000);

driver.quit();
	}

}
