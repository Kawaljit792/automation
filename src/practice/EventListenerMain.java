package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventListenerMain {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		EventFiringWebDriver eventHandler= new EventFiringWebDriver(driver);
		EventCapture ecapture= new EventCapture();
		// registering with EventFiringWebDriver
		eventHandler.register(ecapture);
	    eventHandler.navigate().to("https://www.edureka.co/blog/");	
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(3000);
	    eventHandler.findElement(By.id("wzrk-cancel")).click();
	    eventHandler.findElement(By.linkText("Software Testing")).click();
	    eventHandler.navigate().to("https://www.edureka.co/all-courses");
	    eventHandler.navigate().back();
	    eventHandler.quit();
	    eventHandler.unregister(ecapture);
	    System.out.println("End of listeners class");
		
	}

}
