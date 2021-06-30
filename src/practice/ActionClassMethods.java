package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions actor= new Actions(driver);
		
		driver.get("https://www.edureka.co/");
		Thread.sleep(3000);		
		actor.contextClick();
		actor.moveByOffset(500, 500);
		actor.moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/span[1]"))).build().perform();
		Thread.sleep(3000);
		actor.moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/ul[1]/li[8]/a[1]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/nav[1]/div[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(3000);
	 
		// checking drag and drop method
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		actor.keyDown(source, Keys.SHIFT);
		actor.keyUp(source, Keys.SHIFT);
		actor.dragAndDrop(source, target).build().perform();
		
		//actor.clickAndHold(source).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
	
	

}
