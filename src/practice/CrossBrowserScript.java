package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			throw new Exception("Incorrect Browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
  @Test
  public void testngParameters() throws InterruptedException {
	  
	  driver.get("https://www.edureka.co/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Log In")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("si_popup_email")).sendKeys("abcd@dhg.cnj");
	  Thread.sleep(1000);
	  driver.findElement(By.id("si_popup_passwd")).sendKeys("qwertyuiop");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	  
  }
}
