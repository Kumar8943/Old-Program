package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {
	
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\originalsample\\Excel\\Mvn Sample.xlsx");		
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);
		int cellType = c.getCellType();
		System.out.println(cellType);
		if (cellType ==1)
		{
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
			
		} 
		else if (cellType ==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
				String format = sim.format(dateCellValue);
				System.out.println(format);
			}
			else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long)numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
								}
		}
		String stringCellValue = c.getStringCellValue();
		if (stringCellValue.equals("Arjun")) {
			c.setCellValue("Chenni");
		}
		
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("Done");
		
	
		
		
		/*	for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
	}*/
		
	/*	Row r = s.getRow(4);
		Cell c = r.getCell(1);
		System.out.println(c);
		int pnr = s.getPhysicalNumberOfRows();
		System.out.println("Physical no of row : " + pnr);
		int pnc = r.getPhysicalNumberOfCells();
		System.out.println("Physical no of cell : " + pnc);
		String scv = c.getStringCellValue();
		System.out.println(scv);*/
	}

}
