package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='user_email']")
    WebElement Email;
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Login;
	
	
	public WebElement id() {
		return Email;
	}
	
	public WebElement password() {
		return Password;
	}
 public WebElement login() {
	 return Login;
 }
}
