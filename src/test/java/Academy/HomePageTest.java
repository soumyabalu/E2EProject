package Academy;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import Academy.Base;

public class HomePageTest extends Base {
	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	@BeforeTest
	public void initilalizing() throws IOException {
		driver = initialization();

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {
		// count of the arguments we send must be equal to the count of the values which
		// we are sending

		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.login().click();
		LoginPage lpp = new LoginPage(driver);
		lpp.id().sendKeys(username);
		lpp.password().sendKeys(password);
		lpp.login().click();
		// this is to test for the fraud or normal user
		// System.out.println(text);
		log.info("@@@@@@@@@@@@@@@@@@@@" + text);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

	@DataProvider
	// row stands for how many datatypes the ntest should run - here emailid and
	// password are the rows
	// column stands for the values which we are sending - here text ,email,
	// password are the columns

//here we are acheving data driving and parameterization using TestNG @DataProvider helper annotation
	// array size is 2
	// so index starts from 0,1 = 2

	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		// 0th row
		data[0][0] = "soumya123@gmail.com";
		data[0][1] = "abcd123";
		data[0][2] = "restricteduser";
		// 1st row
		data[1][0] = "jay123@gmail.com";
		data[1][1] = "efgh456";
		data[1][2] = "nonrestricteduser";
		return data;

	}

}
