package org.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("Enter the username, password and Login by Click")
	public void enter_the_username_password_and_Login_by_Click() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("kumar8943");
		driver.findElement(By.id("password")).sendKeys("123456789");
	    driver.findElement(By.name("login")).click();
	}

	@When("Select the Hotel details and click")
	public void select_the_Hotel_details_and_click() throws InterruptedException {
		 WebElement location = driver.findElement(By.name("location"));
			Select a = new Select(location);
			a.selectByIndex(3);
			
			WebElement hotels = driver.findElement(By.name("hotels"));
			Select b = new Select(hotels);
			b.selectByIndex(3);
			
			WebElement roomtype = driver.findElement(By.name("room_type"));
			Select c = new Select(roomtype);
			c.selectByValue("Deluxe");
			
			WebElement numberofrooms = driver.findElement(By.name("room_nos"));
			Select d = new Select(numberofrooms);
			d.selectByIndex(3);
			
			WebElement adultroom = driver.findElement(By.name("adult_room"));
			Select e = new Select(adultroom);
			e.selectByIndex(2);
			
			WebElement childroom = driver.findElement(By.name("child_room"));
			Select f = new Select(childroom);
			f.selectByIndex(1);
			
			WebElement searchbutton = driver.findElement(By.name("Submit"));
			searchbutton.click();
			
			Thread.sleep(3000);
	}

	@And("Click the Hotel")
	public void click_the_Hotel() {
		
		WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();
		
		WebElement continuebutton = driver.findElement(By.name("continue"));
		continuebutton.click();
		
	}
	@And("Fill the Personal details")
	public void fill_the_Personal_details() throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys("Kumar");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("address")).sendKeys("656, St.Mount Road, Park Nagar, Pollachi ");
		driver.findElement(By.id("cc_num")).sendKeys("4856259645617895"); 
		
		WebElement creditcardtype = driver.findElement(By.id("cc_type"));
		Select g = new Select(creditcardtype);
		g.selectByVisibleText("VISA");
		
		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		Select h = new Select(expirymonth);
		h.selectByIndex(7);		
		
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		Select i = new Select(expiryyear);
		i.selectByIndex(7);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("852");
		
		WebElement bookbutton = driver.findElement(By.name("book_now"));
		bookbutton.click();
		Thread.sleep(5000);
		
		WebElement orderid = driver.findElement(By.name("order_no"));
		orderid.click();
		Thread.sleep(3000);
		WebElement myitenary = driver.findElement(By.name("my_itinerary"));
		myitenary.click();
		Thread.sleep(3000);
}
	@Then("Verify the Booking Id")
	public void verify_the_Booking_Id() {
		WebElement orderno= driver.findElement(By.name("order_id_634679"));
		String text = orderno.getText();
		System.out.println("Order Id : " +text);
		
}



}
