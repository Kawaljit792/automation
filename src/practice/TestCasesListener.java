package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(ListenerTestng.class)
public class TestCasesListener {
		WebDriver driver;
		
		@Test
		public void TestCase1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.edureka.co/");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			driver.findElement(By.cssSelector(".open_search_overlay")).click();
			driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("test");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Manual Testing Certification Training")).click();
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
					
		}
		// forcefully failing the test
		@Test
		public void TestToFail() 
		{
			System.out.println("This method is to fail the test");
			Assert.assertTrue(false);
		}
		
	
}
