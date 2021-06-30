package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo {
	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void loginTest(String uname, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.id("session_key")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("session_password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
		Thread.sleep(3000);

		 if(driver.getTitle().equals("Feed | LinkedIn"))
		  System.out.println("Login Successful"); 
		   else
		  System.out.println("Invalid credentials"); 
		 
		 driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] feedTestData() throws Exception
	
	{
		
		ReadExcelFile config = new ReadExcelFile("C:\\Users\\kawaljit kaur\\eclipse-workspace\\learningautomation\\login-data.xlsx");
		int rows = config.getRowCount(0);
		Object[][] logindata = new Object[rows][2];
		for (int i = 0; i < rows; i++)
		{
			logindata[i][0] = config.getData(0, i, 0);
			logindata[i][1] = config.getData(0, i, 1);
		}

		return logindata;

	}
}
