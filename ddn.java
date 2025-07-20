package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddn {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://output.jsbin.com/osebed/2");
			driver.manage().window().maximize();
			WebElement ddn = driver.findElement(By.id("fruits"));
			Select s = new Select(ddn);
			s.selectByIndex(2);
				
			
	}
}
