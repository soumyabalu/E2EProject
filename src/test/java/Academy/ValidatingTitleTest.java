package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import Academy.Base;

public class ValidatingTitleTest extends Base{
public static Logger log = LogManager.getLogger(ValidatingTitleTest.class.getName());

@BeforeTest

public void initialize() throws IOException {
	 driver = initialization();
     driver.get(prop.getProperty("url"));
     log.info("succesfully validated");
	
}
	
	
	@Test
public void basePageTitle() throws IOException {
 //count of the arguments we send must be equal to the count of the values which we are  sending      
      
  
       LandingPage lp = new LandingPage(driver);
    //validating the nav bar using assertion
        Assert.assertEquals(lp.Text().getText(),"FEATURED COURSES123");
      //System.out.println( lp.Text().getText()); 
	
}
	
	@AfterTest
	
	public void tearDown() {
		
		driver.close();
		driver=null;
	}
	
	
}
