package Handling_popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_tabs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		 Set<String> handles = driver.getWindowHandles();
		 for(String g:handles)
		 {
 WebDriver browser = driver.switchTo().window(g);
	String title = browser.getTitle();
if(title.equals("DemoApps | Qspiders | Browser Windows"))
{
	Thread.sleep(2000);
	browser.close();
}
//driver.quit();
		 }}
}
