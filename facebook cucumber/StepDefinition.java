package org.facebook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	@Given("Open the facebook application")
	public void open_the_facebook_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}

	@When("Click the Login")
	public void click_the_Login() {
		 WebElement button = driver.findElement(By.name("login"));
		  button.click();		

	}

	@Then("Verify the validation")
	public void verify_the_validation() throws InterruptedException {
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Vaildation is passed");		
		Thread.sleep(2000);
		driver.close();

	}
	}
