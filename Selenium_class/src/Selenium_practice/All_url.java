package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore/delivery");
		Thread.sleep(2000);
		/*
	List<WebElement> tag = driver.findElements(By.xpath("//a"));//all links
	
int count = tag.size();
	for(int i=0;i<=tag.size();i++)
	{
	WebElement links = tag.get(i);
	String url = links.getAttribute("href");
	System.out.println(i+" "+url);
	}
	*/

//all texts
		List<WebElement> tag = driver.findElements(By.xpath("//*"));//all texts
		for(WebElement abc:tag)
		{
			System.out.println(abc.getText());
		}
	}

}
