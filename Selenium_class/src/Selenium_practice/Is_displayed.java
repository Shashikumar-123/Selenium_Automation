package Selenium_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Is_displayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//select[@aria-invalid='false']"));
		Select s= new Select(ele);
		if(s.isMultiple())
		{
			s.selectByIndex(4)	;
s.selectByValue("Pierced Owl Rose Gold Plated Stainless Steel Double");
//Thread.sleep(500);
s.selectByVisibleText("Fjallraven - Foldsac...");

driver.findElement(By.xpath("//button[.='Add']")).click();

driver.findElement(By.xpath("//table[class='w-full border my-2 border-black']"));
s.deselectByVisibleText("Fjallraven - Foldsac...");
s.deselectByIndex(2);

			}
		else
		{
			System.out.println("is not multiple");
		}
	}}
