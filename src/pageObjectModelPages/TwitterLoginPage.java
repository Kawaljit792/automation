package pageObjectModelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwitterLoginPage {

	WebDriver driver;
	public TwitterLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='session[username_or_email]' and @type='text']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@name='session[password]' and @type='password']") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]") WebElement loginButton;
	
	public void setEmail(String email)
	{
		emailTextBox.sendKeys(email);
	
	}
	public void setPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
}
