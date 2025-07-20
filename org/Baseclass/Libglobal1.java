package org.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Libglobal1 {
		public static void main(String[] args) {
			
			LibGlobal base = new LibGlobal();
			WebDriver driver = base.driver();
			base.url("https://en-gb.facebook.com/");
			base.Maximize();
			WebElement user = driver.findElement(By.id("email"));
			base.type(user,  "asgdhh@gmail.com");
			WebElement pass = driver.findElement(By.id("pass"));
			base.type(pass, "kbklklkl");
			WebElement btn = driver.findElement(By.name("login"));
			base.click(btn);
		}
		
	}

