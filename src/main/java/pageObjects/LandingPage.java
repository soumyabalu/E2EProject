package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	
		// TODO Auto-generated constructor stub
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	//cssSelector=tagname[attribute =value] * means all
	@FindBy(css="a[href*='sign_in']")
	WebElement Login;
	 
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	WebElement text;
	
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
	WebElement navbar;
	
	

public WebElement login() {
		return Login;
		
	}
public WebElement Text() {
	return text;
}
public WebElement navigation() {
	return navbar;
}

}

