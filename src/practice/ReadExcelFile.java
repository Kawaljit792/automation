package practice;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ReadExcelFile(String excelfilepath) throws Exception {
		
		File source= new File(excelfilepath);
		FileInputStream fis= new FileInputStream(source);
		wb=new XSSFWorkbook(fis);
		
	}
	
	public String getData(int sheetnumber, int row, int col)
	{
		sheet= wb.getSheetAt(sheetnumber);
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	public int getRowCount(int sheetindex)
	{
		int rowcount=  wb.getSheetAt(sheetindex).getLastRowNum();
		rowcount= rowcount+1;
		return rowcount;
	}
}
