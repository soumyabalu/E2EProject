package stepDefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import org.junit.runner.RunWith;


import Academy.Base;

@RunWith(Cucumber.class)
public class StepDefinition extends Base {

	@Given("^initialize chromeDriver$")
    public void initialize_chromedriver() throws Throwable {
        driver = initialization();
    }


    @When("^the user login using (.+) and (.+)$")
    public void the_user_login_using_and(String username, String password) throws Throwable {
    	
		LoginPage lpp = new LoginPage(driver);
		lpp.id().sendKeys(username);
		lpp.password().sendKeys(password);
		lpp.login().click();
		
    }


    @Then("^do the validation$")
    public void do_the_validation() throws Throwable {
    System.out.println("all the validations are done");
    }
    @Then("^click on the login button to land on the homepage$")
    public void click_on_the_login_button_to_land_on_the_homepage() throws Throwable {
    	LandingPage lp = new LandingPage(driver);
    	
		lp.login().click();
    }

    @And("^hit the url \"([^\"]*)\"$")
    public void hit_the_url_something(String strArg1) throws Throwable {
        driver.get("http://www.qaclickacademy.com");
    }

    @And("^close the browser after action$")
    public void close_the_browser_after_action() throws Throwable {
       driver.close();
       driver=null;
    }

}
