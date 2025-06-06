package Handling_popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Childtabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
	Set<String> handles = driver.getWindowHandles();
	for(String h:handles)
	{
	WebDriver browser = driver.switchTo().window(h);
String title = browser.getTitle();
if(!title.equals("DemoApps | Qspiders | Browser Windows"))
{
	browser.close();
}
	}
	driver.quit();
	}

}
