package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Z New Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	By id = By.id("email");
	WebElement findElement = driver.findElement(id);
	findElement.sendKeys("kumar789654");
		
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("123456");
		
	WebElement login = driver.findElement(By.name("login"));
	login.click();
		

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);

	
	//	By tagName = By.tagName("h2");
	 //  WebElement textElement = driver.findElement(tagName);
	//	String text = textElement.getText();
	//	System.out.println(text);
		
	WebElement findElement2 = driver.findElement(By.xpath("//div[@class='_9ay7']"));
	String text = findElement2.getText();
	System.out.println(text);
		
	}

}
