package DataDrivenPackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData_01 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("./ExcelFile/Test_01.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet sheet = Book.getSheet("Sheet1");
		Row rw = sheet.getRow(0);
		Cell c1 = rw.getCell(0);
		String value = c1.getStringCellValue();
		//double value = c1.getNumericCellValue();
		System.out.println(value);
	}
	
}
