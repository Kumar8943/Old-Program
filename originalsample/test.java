package originalsample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\originalsample\\Excel\\Mvn Sample.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
    Sheet sheet = w.getSheet("Sheet1");
	Row row = sheet.getRow(3);
	Cell cell = row.getCell(2);
	System.out.println(cell);
	
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\originalsample\\Drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	driver.manage().window().maximize();

 }	
}
