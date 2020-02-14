package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Academy.Base;
import pageObjects.LandingPage;

public class ValidatingNavBarTest extends Base{
	public static Logger log=LogManager.getLogger(ValidatingNavBarTest.class.getName());

@BeforeTest

public void initialize() throws IOException {
	
   driver = initialization();
   log.debug("driver got initialized");
       driver.get(prop.getProperty("url"));
       log.info("navigated to url and hitting the url");
}
	
	
	
	
	@Test
public void basePageNavigation() throws IOException {
 //count of the arguments we send must be equal to the count of the values which we are  sending      
  
       LandingPage lp = new LandingPage(driver);
     //validating the navigation header
       Assert.assertTrue(lp.navigation().isDisplayed());
       System.out.println( lp.navigation().getText());
     log.info("successfully tested");
	}
	
	
	@AfterTest
    public void tearDown() {
		log.info("my test message");
		log.info("page got succesfully clossed");
		driver.close();

		driver=null;
	}
	
}
