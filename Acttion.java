package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acttion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
/*		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Test");
		Actions a=new Actions(driver);
		a.doubleClick(user).perform();
		a.contextClick(user).perform();
*/
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		radio.click();
		WebElement check = driver.findElement(By.xpath("(//input[@type=\'checkbox\'])[3]"));
		check.click();
	}

}
