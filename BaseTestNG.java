package com.BaseTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestNG {
	WebDriver driver;
	
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	public WebElement LocatorByID(String id) {
		return driver.findElement(By.id(id));
	}
	
	public void time(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
	
	
	public String Exceldata(String sheetname, int rowIndex, int cellIndex) throws IOException {
		File f = new File("D:\\Selenium Workspace\\TestNG\\Excel\\Adactin data.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
 	   String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		wb.close();		
		return stringCellValue;
	}
}
