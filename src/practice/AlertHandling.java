package practice;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		AlertHandling obj=new AlertHandling();
		obj.invokeBrowser();
		obj.alertFunctions();
		
	}

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void alertFunctions() throws AWTException, InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(3000);	
		// for and alert box
		Alert alert= driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		Thread.sleep(3000);
		// for a pop-up window
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]")).click();
		Thread.sleep(3000);
		driver.switchTo().window("2000");
		Thread.sleep(3000);
		driver.close();
		
		/* Robot robot= new Robot();
		robot.mouseMove(1500,150); // to get to the close button of window
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		 */
		//driver.switchTo().window(alertMessage).close();
		
		Thread.sleep(2000);
		driver.close();
		
		//driver.quit();
		
		
		
	}
	
}
