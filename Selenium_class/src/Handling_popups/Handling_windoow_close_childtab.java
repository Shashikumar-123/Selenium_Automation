package Handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_windoow_close_childtab {

public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
	WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
	WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
	WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
	Actions a =new Actions(driver);	
	Robot r = new Robot();
	ArrayList<WebElement> arr=new ArrayList<>();
  arr.add(ele1);
  arr.add(ele2);
	arr.add(ele3);
	arr.add(ele4);
	for(WebElement tabs:arr)
	{
a.contextClick(tabs).perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}
Set<String> handles = driver.getWindowHandles();
ArrayList<String> arr1= new ArrayList<>(handles);
for(String abc:arr1)
{
 WebDriver childtabs = driver.switchTo().window(abc);
 String title = childtabs.getTitle();
 System.out.println(title);
 if(title.equals("Downloads | Selenium"))
 {
	 childtabs.close();
 }

}
}}
