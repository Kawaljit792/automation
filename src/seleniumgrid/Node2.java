package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
	WebDriver driver;
	String nodeurl;
	
  @Test
  public void f() {
	  try {
			
		  nodeurl="http://192.168.1.2:5555/wd/hub"; // ip address of node
			  DesiredCapabilities capabilities= DesiredCapabilities.firefox();
			  capabilities.setBrowserName("firefox"); // also add the path of gecko driver in command prompt
			  capabilities.setPlatform(Platform.WIN10);
			  driver= new RemoteWebDriver(new URL(nodeurl), capabilities);
			  driver.manage().deleteAllCookies();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get("https://www.ebay.com.au/");
			  driver.findElement(By.linkText("Health & Beauty")).click();
			  System.out.println("The title of the page is :"+driver.getTitle());
			  
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
  }
}
