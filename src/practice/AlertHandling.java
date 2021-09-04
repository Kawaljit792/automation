package practice;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		AlertHandling obj=new AlertHandling();
		obj.invokeBrowser();
		//obj.alertFunctions();
		obj.windowFunctions();
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
		// for alert box
		Alert alert= driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		//alert.dismiss(); to dismiss the alert
		Thread.sleep(3000);
		driver.close();
	}
	
	public void windowFunctions() throws InterruptedException {
		// for a pop-up window
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]")).click();
		Thread.sleep(3000);
		
		String parentWindow=driver.getWindowHandle(); //  will return parent window name as a string
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> It= s.iterator();

		while(It.hasNext())
		{

		String child_window=It.next();


		if(!parentWindow.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.close();
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.close();
		}	
		/* Robot robot= new Robot();
		robot.mouseMove(1500,150); // to get to the close button of window
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		 */
		//driver.switchTo().window(alertMessage).close();
		
		}	
		
	}

