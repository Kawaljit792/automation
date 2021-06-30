package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AnnotationDemo {
	WebDriver driver;
	String Url = "https://www.edureka.co/";
	
	
	@Test
	public void verifyPageTitle() {
		String ExpectedTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	
		
	}

}
