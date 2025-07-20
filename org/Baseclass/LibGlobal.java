package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
		WebDriver driver;
	public WebDriver driver() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public void url(String data) {
		driver.get(data);
	}
		
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
   public void click(WebElement element) {
	   element.click();
}	
	public void Maximize() {
		driver.manage().window().maximize();
	}
	public void closebrowser() {
		driver.quit();
	}
	public void closecurrentbrowser() {
     driver.close();
	}
	
	
	
	
}
	
	