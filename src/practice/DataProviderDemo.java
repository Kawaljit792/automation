package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void testLogin(String uname, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.close();

	}

	@DataProvider(name = "testdata")
	public Object[][] feedData() {
		Object[][] logindata = new Object[2][2];
		logindata[0][0] = "user1@gmail.com";
		logindata[0][1] = "12345678";
		logindata[1][0] = "user2@xyz.com";
		logindata[1][1] = "qwertyuiop";
		return logindata;

	}
}
