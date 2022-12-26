package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestUtil {
	
	
	
	public static String TEST_SHEET_PATH ="C:\\QA2022\\Selenium_Workspace\\RestAssuredProjectSDET\\src\\test\\java\\DataDrivenTesting\\EMPDATA.xlsx";

	static Workbook book;
	static Sheet sheet;
	



	public static Object[][] getTestData(String sheetname){
		FileInputStream file = null;
		try {
			file = new FileInputStream(TEST_SHEET_PATH);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book= WorkbookFactory.create(file);
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		
			
		}


		sheet =book.getSheet(sheetname);
		Object [][]data =  new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i<sheet.getLastRowNum(); i++) {
			for (int k =0; k<sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				System.out.println(data[i][k]);
			}
		}
		return data;

	}

		
	}

