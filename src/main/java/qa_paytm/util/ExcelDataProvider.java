package qa_paytm.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook wb;
	
	/*-----------------------------To Load the excel file---------------------------------*/
	
	public ExcelDataProvider(){
		
		try{
		File src = new File("./TestData/Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		}
		catch(Exception e){
			System.out.println("Unable to read the excel file"+e.getMessage());
		}
	}
	
	/*-----------------------------To Read the data from excel file---------------------------------*/
	
	public String getStringData(String sheetName, int row, int col){
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}

	public double getNumericData(int sheetIndex, int row, int col){
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getNumericCellValue();		
	}
}
