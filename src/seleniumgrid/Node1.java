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

public class Node1 {
	
	WebDriver driver;
	String nodeurl;
	
	
  @Test
  public void f() {
	  try {
		nodeurl="http://192.168.1.2:5555/wd/hub";
		  DesiredCapabilities capabilities= DesiredCapabilities.chrome();
		  capabilities.setBrowserName("chrome");
		  capabilities.setPlatform(Platform.WIN10);
		  driver= new RemoteWebDriver(new URL(nodeurl), capabilities);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.amazon.com.au/");
		  driver.findElement(By.linkText("New Releases")).click();
		
		  
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	  
  }
}
