package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone11 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/s?k=samsung+s20+fe+%2B+5g&crid=8U1H0UHOOB3U&sprefix=samsung+s20%2Caps%2C386&ref=nb_sb_ss_ts-doa-p_1_11");
				List<WebElement> sam = driver.findElements(By.xpath("(//span[text()='36,990'])[1]//ancestor::div[@class='sg-row']//child::h2"));
				for (WebElement phone : sam) {
					String text = phone.getText();
					System.out.println(text);
					
				}
//				driver.get("https://www.amazon.in/s?k=iphone+11&ref=nb_sb_noss_2");
//				driver.manage().window().maximize();
//				List<WebElement> price = driver.findElements(By.xpath("//span[text()='40,999']//ancestor::div[@class='sg-row']//preceding-sibling::div[@class='a-section a-spacing-none']//child::h2"));
//				for (WebElement x : price) {
//					String text = x.getText();
//					System.out.println(text);
//					
					
				

				//span[text()='40,999']//ancestor::div[@class='sg-row']//preceding-sibling::div[@class='a-section a-spacing-none']//child::h2 
	}
}
