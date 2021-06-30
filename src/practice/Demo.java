package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String args[]) {
		System.out.println("welcome to eclipse");
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    	
		 String baseUrl = "https://www.linkedin.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch browser and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close browser
	        driver.close();
	}
}
