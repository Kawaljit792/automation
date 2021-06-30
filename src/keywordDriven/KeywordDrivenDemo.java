package keywordDriven;

public class KeywordDrivenDemo {

	public static void main(String[] args) throws Exception 
	{

		String fpath = "C:\\Users\\kawaljit kaur\\eclipse-workspace\\learningautomation\\keyworddriven-data.xlsx";
		ReadExcelData.getExcelFile(fpath, "Sheet1");
		for (int i = 1; i <= 6; i++) 
		{
			String method = ReadExcelData.getCellData(i, 1);
			if (method.equals("openBrowser"))
				TestMethods.openBrowser();
			else if (method.equals("navigate"))
				TestMethods.navigate();
			else if (method.equals("inputLoginData"))
				TestMethods.inputLoginData();
			else if (method.equals("submit"))
				TestMethods.submit();
			else if (method.equals("verifySuccessfulLogin"))
				TestMethods.verifySuccessfulLogin();
			else if (method.equals("closeBrowser"))
				TestMethods.closeBrowser();
		}
	}

}
