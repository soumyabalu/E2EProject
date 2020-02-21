package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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
	By popup = By.xpath("//button[@text()='NO THANKS']");
			

	//cssSelector=tagname[attribute =value] * means all
	private @FindBy(css="a[href*='sign_in']")
	WebElement Login;
	 
	
	private @FindBy(xpath="//div[@class='text-center']/h2")
	WebElement text;
	
	
	private @FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
	WebElement navbar;
	
	private @FindBy(xpath="//div[@class='col-sm-6 col-md-8 hidden-xs video-banner']/p")
	WebElement Courses;


	
	
public int getpopUpsize() {
	return driver.findElements(popup).size();
}
public WebElement  getpopUp() {
	return driver.findElement(popup);
}
public WebElement login() {
		return Login;
		
	}
public WebElement Text() {
	return text;
}
public WebElement navigation() {
	return navbar;
}

public WebElement courses() {
	return Courses;
}

}

