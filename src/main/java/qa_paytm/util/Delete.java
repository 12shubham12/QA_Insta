package qa_paytm.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Delete {
	
	public static XSSFWorkbook wb;
	
	public static void main(String[] args) {			
			
			try{
			File src = new File("D:/Java_Selenium/Programs/qa_paytm/TestData/Data.xlsx");
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
			getStringData("Login", 0, 0);
			getStringData("Login", 0, 1);
			}
			catch(Exception e){
				System.out.println("Unable to read the excel file"+e.getMessage());
			}
		}
		
		/*-----------------------------To Read the data from excel file---------------------------------*/
		
		public static void getStringData(String sheetName, int row, int col){
			System.out.println(wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue());
		}

		public static void getNumericData(int sheetIndex, int row, int col){
			System.out.println(wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getNumericCellValue());		
		}

}
