package adactin;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adactinlogin {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\originalsample\\Drivers\\chromedriver.exe");
		/*WebDriverManager.chromedriver().setup();*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("kumar8943");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456789");
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		Thread.sleep(2000);
		WebElement loc = driver.findElement(By.name("location"));
		Select s =new Select(loc);
		s.selectByIndex(6);
		Thread.sleep(2000);
		WebElement ho = driver.findElement(By.name("hotels"));
		Select s1 =new Select(ho);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 =new Select(room);
		s2.selectByVisibleText("Double");
		Thread.sleep(2000);
		WebElement nos = driver.findElement(By.name("room_nos"));
		Select s3 =new Select(nos);
		s3.selectByIndex(1);
		Thread.sleep(2000);
		WebElement idate = driver.findElement(By.id("datepick_in"));
		idate.clear();
		idate.sendKeys("08/10/2021");
		Thread.sleep(2000);
		WebElement odate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		odate.clear();
		Thread.sleep(2000);
		odate.sendKeys("10/10/2021");
		Thread.sleep(2000);
		WebElement adroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adroom);
		s4.selectByIndex(2);
		Thread.sleep(2000);
		WebElement chroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(chroom);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radio.click();
		Thread.sleep(2000);
		WebElement conti = driver.findElement(By.xpath("//input[@type='submit']"));
		conti.click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.name("first_name"));
		fn.sendKeys("Kumar");
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.name("last_name"));
		ln.sendKeys("P");
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("50,51 Omr Main Road Chennai");
		Thread.sleep(2000);
		WebElement cc= driver.findElement(By.name("cc_num"));
		cc.sendKeys("6458 8546 8795 2545");
		Thread.sleep(2000);
		WebElement cctype= driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByIndex(2);
		Thread.sleep(2000);
		WebElement emon= driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(emon);
		s7.selectByIndex(7);
		Thread.sleep(2000);
		WebElement eyear= driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(eyear);
		s8.selectByIndex(7);
		Thread.sleep(2000);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("896");
		Thread.sleep(2000);
		WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
		book.click();
		Thread.sleep(4000);
		WebElement BI = driver.findElement(By.xpath("//a[contains(text(),'Booked Itinerary')]"));
		BI.click();
		WebElement ordid = driver.findElement(By.name("order_id_466652"));
		String T = ordid.getText();
		System.out.println(T);
		
	}

}
