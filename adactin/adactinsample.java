package adactin;

import java.awt.AWTException;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinsample
{
	private static final String ordid = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\originalsample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("pkumar8943");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("987654321");
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		WebElement loc = driver.findElement(By.name("location"));
		Select s =new Select(loc);
		s.selectByIndex(6);
		WebElement ho = driver.findElement(By.name("hotels"));
		Select s1 =new Select(ho);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 =new Select(room);
		s2.selectByVisibleText("Double");
		WebElement nos = driver.findElement(By.name("room_nos"));
		Select s3 =new Select(nos);
		s3.selectByIndex(1);
		WebElement idate = driver.findElement(By.id("datepick_in"));
		idate.clear();
		idate.sendKeys("08/10/2021");
		WebElement odate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		odate.clear();
		odate.sendKeys("10/10/2021");
		WebElement adroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adroom);
		s4.selectByIndex(2);
		WebElement chroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(chroom);
		s5.selectByIndex(1);
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radio.click();
		WebElement conti = driver.findElement(By.xpath("//input[@type='submit']"));
		conti.click();
		WebElement fn = driver.findElement(By.name("first_name"));
		fn.sendKeys("Kumar");
		WebElement ln = driver.findElement(By.name("last_name"));
		ln.sendKeys("P");
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("50,51 Omr Main Road Chennai");
		WebElement cc= driver.findElement(By.name("cc_num"));
		cc.sendKeys("6458 8546 8795 2545");
		WebElement cctype= driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByIndex(2);
		WebElement emon= driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(emon);
		s7.selectByIndex(7);
		WebElement eyear= driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(eyear);
		s8.selectByIndex(7);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("896");
		WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
		book.click();
		WebElement BI = driver.findElement(By.xpath("//a[contains(text(),'Booked Itinerary')]"));
		BI.click();
	 WebElement ordid = driver.findElement(By.id("order_id_466652"));
		String T = ordid.getAttribute("value");
		System.out.println(T);
	/*	WebElement findElement = driver.findElement(By.tagName("td"));
		for (WebElement x : orderid) 
		{
			System.out.println(x.getText());
		}
		*/		
	}

}


