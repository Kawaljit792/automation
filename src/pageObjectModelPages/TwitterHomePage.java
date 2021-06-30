package pageObjectModelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwitterHomePage {
	
	WebDriver driver;
	 public TwitterHomePage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/*[1]") WebElement profileDropdown;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Log out ") WebElement logoutLink;
	
	public void clickOnProfile()
	{
		profileDropdown.click();
	}
	public void clickOnLogout()
	{
		logoutLink.click();
	}

}
