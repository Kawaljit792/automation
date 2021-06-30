package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
public class BrokenURL{
   public static void main(String[] args) throws
   InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      // wait of 5 seconds
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
      //get list of elements with anchor tag
      List<WebElement> l = driver.findElements(By.tagName("a"));
      //iterate links
      for(int j=0; j<l.size(); j++) {
         WebElement e = l.get(j);
         //get URL of links with getAttribute()
         String u = e.getAttribute("href");
         // to catch MalFormedURLException
         try{
            //object of URL class
            URL link = new URL(u);
            // establish connection URL object
            HttpURLConnection c = (HttpURLConnection)link.openConnection();
            //have timeout
            c.setConnectTimeout(1000);
            // connection began
            c.connect();
            //getResponseCode() to obtain response code
            if(c.getResponseCode()== 200) {
               System.out.println(u+" - "+ c.getResponseMessage());
            }
            if(c.getResponseCode()== 404) {
               System.out.println(u+" - "+c.getResponseMessage());
            }
         }
         catch (Exception ex) {
         }
      }
   }
}
