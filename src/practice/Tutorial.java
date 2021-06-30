package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {

	WebDriver driver;
	JavascriptExecutor jse;
	public static void main(String[] args) {
		
		Tutorial obj= new Tutorial();
		obj.invokeBrowser();
		
		
	}

public void invokeBrowser() {
	
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		
		/* to scroll
		jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)" );
		
		//searchCourse();  */
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public void searchCourse()  {
	try {
		driver.findElement(By.cssSelector(".open_search_overlay")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("test");
				Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	
	
	
}
	
	
}
