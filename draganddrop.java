package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {


public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement src = driver.findElement(By.xpath("//li[@id='credit2']"));
	WebElement desc = driver.findElement(By.xpath("//ol[@id='bank']"));
	Actions a = new Actions(driver);
	a.dragAndDrop(src, desc).build().perform();		
	
	
/*	driver.navigate().to("https://www.browserstack.com/");
	driver.manage().window().maximize();
	WebElement course = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg col-md-3 get-started-hero']"));
	Actions a= new Actions(driver);
	a.moveToElement(course).perform();		
*/
}
}		


