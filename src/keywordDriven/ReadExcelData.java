package keywordDriven;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData
{

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFCell cell;

	public static void getExcelFile(String path, String sheetname) throws Exception
	{
		FileInputStream fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
	}

	public static String getCellData(int row, int col) 
	{
		cell = sheet.getRow(row).getCell(col);
		String celldata = cell.getStringCellValue();
		return celldata;
	}
}
