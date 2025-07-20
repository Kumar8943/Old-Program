package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demosite {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			WebElement user = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
			user.sendKeys("Kumar");
			WebElement pass = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
			pass.sendKeys("Kumar");
			WebElement add = driver.findElement(By.xpath(" //textarea[contains(@ng-model,'Adress')]"));
			add.sendKeys("Kumar");
}
}