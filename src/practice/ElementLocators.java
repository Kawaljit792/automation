package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {

		ElementLocators obj=new ElementLocators();
		obj.elementLocators();
		
	}
	
	WebDriver driver;
	
	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

						

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void elementLocators() {
		try {
			invokeBrowser();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
	    /*	driver.findElement(By.className(null));
			driver.findElement(By.id(null));
			driver.findElement(By.linkText(null));
			driver.findElement(By.partialLinkText(null));
			driver.findElement(By.tagName(null));
			driver.findElement(By.name(null));
		*/
			driver.findElement(By.cssSelector("input#email")).sendKeys("xyz@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
}
