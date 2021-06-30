package hybridFrameworkDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethods 
{
	static WebDriver driver;
	public static void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public static void navigate()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	public static void inputLoginData() throws InterruptedException 
	{
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("mercury");
	}
	public static void submit() throws InterruptedException
	{
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}
	@Test
	public static void verifySuccessfulLogin() 
	{
		
		Assert.assertEquals("Login: Mercury Tours", driver.getTitle());
	}
	public static void closeBrowser()
	{
		driver.close();
	}
}
