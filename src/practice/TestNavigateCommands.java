package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {

	WebDriver driver;

	public static void main(String[] args) {

		TestNavigateCommands obj= new TestNavigateCommands();
		obj.invokeBrowser();
		
	}

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

			navigateCommands();
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

public void navigateCommands() {
	try {
		driver.navigate().to("https://www.amazon.com.au/");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.navigate().back();  
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
}
}
