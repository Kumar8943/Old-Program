package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	

public class javascript {
	
	
 	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.navigate().to("http://demo.guru99.com/V4/");
			driver.manage().window().maximize();
			
			WebElement btn = driver.findElement(By.name("btnLogin"));
			driver.findElement(By.name("uid")).sendKeys("Kumar");
			driver.findElement(By.name("password")).sendKeys("123456");
			
			js.executeScript("arguments[0].click();", btn);
		/*js.executeScript("alert('Welcome to demo site');");*/          

	/*		driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			JavascriptExecutor j =(JavascriptExecutor)driver;
			WebElement user = driver.findElement(By.id("email"));
			j.executeScript("argument[0].setAttribute('value','test')", user);
		*/	

	}
}

