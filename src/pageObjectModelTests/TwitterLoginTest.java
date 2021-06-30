package pageObjectModelTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModelPages.TwitterHomePage;
import pageObjectModelPages.TwitterLoginPage;

public class TwitterLoginTest extends BaseTest {
	
	@Test
	public void TestCase () throws Exception
	{
		
		TwitterLoginPage loginpage= PageFactory.initElements(driver, TwitterLoginPage.class);
		loginpage.setEmail("kaeutrerf@gmail.com");
		loginpage.setPassword("qwertyuiop");
		loginpage.clickLogin();
		
		TwitterHomePage homepage= PageFactory.initElements(driver, TwitterHomePage.class);
		Thread.sleep(4000);
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnLogout();
	}

}
