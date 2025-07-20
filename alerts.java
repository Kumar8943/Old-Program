package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			WebElement aok = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
			aok.click();
			WebElement btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
			btn.click();
			
			Alert a = driver.switchTo().alert();
			a.sendKeys("Prem");
			a.dismiss();

			
	}
}
