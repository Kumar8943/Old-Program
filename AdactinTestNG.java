package com.BaseTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinTestNG {
	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		}
	
		@BeforeMethod
		public void Screenshot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(srcfile);
			File desfile = new File("D:\\Selenium Workspace\\TestNG\\Screenshot\\Login1.png");
			FileUtils.copyFile(srcfile, desfile);
		}
	@Test
	public void LocatorbyID() {
	driver.findElement(By.id("username")).sendKeys("pkumar8943");
	driver.findElement(By.id("password")).sendKeys("Kumar@8943");
	driver.findElement(By.id("login")).click();
	}
	
	@Test
	public void ddnSearchHotel()
	{
		
	}
	
	@AfterMethod
	public void Screenshot1() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcfile);
		File desfile = new File("D:\\Selenium Workspace\\TestNG\\Screenshot\\Login.png");
		FileUtils.copyFile(srcfile, desfile);
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
}
