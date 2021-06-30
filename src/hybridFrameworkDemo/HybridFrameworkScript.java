package hybridFrameworkDemo;

import java.lang.reflect.Method;
import keywordDriven.ReadExcelData;

public class HybridFrameworkScript {
	public static TestMethods actions;
	public static String actionkeywords;
	public static Method method[] ;
	public static void main(String[] args) throws Exception {
		
		String fpath = "C:\\Users\\kawaljit kaur\\eclipse-workspace\\learningautomation\\keyworddriven-data.xlsx";
		ReadExcelData.getExcelFile(fpath, "Sheet1");
		for (int i = 1; i <= 6; i++) 
		{
			 actionkeywords= ReadExcelData.getCellData(i, 1);
			 executeMethods();
		}
	}
	public static void executeMethods() throws Exception
	{
		actions= new TestMethods();
		method=actions.getClass().getMethods();
		for(int i=0; i<method.length; i++)
		{
			if(method[i].getName().equals(actionkeywords))
			{
				method[i].invoke(actions);
				break;
			}
				
		}
	}

}
