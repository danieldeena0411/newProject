package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exc {

	public static void readExcel(String[] args) throws IOException  {
		
		// To read particular data from the excel file
		
		//1.Mention excel file path location
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\Mv1\\Excel\\sample.xlsx");
		
		//2.read the file
		
		FileInputStream fis = new FileInputStream(f); //FileNotFoundException
		
		
		//3. read the exact file format
		
		Workbook w = new XSSFWorkbook(fis); //IOException
		
		//4 . To get the sheet from workbook
		
		Sheet mySheet = w.getSheet("Sample");
		
//		//5.get the row from sheet
//		
//		Row r = mySheet.getRow(0);
//		Row r1 = mySheet.getRow(1);
//		
//		//6 get the cell from row
//		
//		Cell zero = r.getCell(0);
//		Cell first = r.getCell(1);
//		
//		System.out.println(zero);
//		System.out.println(first);
//		
		
		
		//  To iterate all the rows from  sheet
		
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row r = mySheet .getRow(i);
			
			// To iterate all the cells from each row
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
//				System.out.println(c);
				
				String value = "";
				
				int cellType = c.getCellType();
				// by default cellType == 1 --> that is string cell
				//cellType otherthan 1--> that is Date cell or Numeric cell
				
				if (cellType == 1) {
					
					 value = c.getStringCellValue();
					System.out.println(value);
					
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {
					
					Date d = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd MMM yyyy" );
				  value = s.format(d);
					System.out.println(value);
				}
				
				else {
					double dd = c.getNumericCellValue();
					long l = (long)dd;
					 value = String.valueOf(1);
					
				}
				
				
					
				}
					
				}
				
				
				
				
			}
		
	}
		
	
		
		
		
		
		
		
	

	

