package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	WebDriver driver;
	public static void main(String[] args) {
		GetCommands obj= new GetCommands();
		obj.invokeBrowser();

	}

	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
			 driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			getCommands();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void getCommands() {
		try {
			driver.get("https://www.doordash.com/");
			String PageTitle=driver.getTitle();
			System.out.println("The Title of the page is: "+PageTitle);
			
			driver.findElement(By.linkText("Sign Up")).click();
			String CurrentURL=driver.getCurrentUrl();
			System.out.println("The current URL is : "+ CurrentURL);
			System.out.println("The current page source is: "+ driver.getPageSource());
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}
	
}
