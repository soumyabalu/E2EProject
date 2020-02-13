package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Base {
	public static WebDriver driver;
	// to acess the properties class define it in public
	public Properties prop;

  // create a method to initialize the WebDriver
	public WebDriver initialization() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/base.properties");
		prop.load(fis);
	//String browserName = prop.getProperty("browser");
		//System.out.println(browserName);
		 prop.getProperty("browser");
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		//if(browserName.equals("chrome")) can also be used
		if ( prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		       driver = new ChromeDriver();
		}
		else if( prop.getProperty("browser").equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
		}
		else if ( prop.getProperty("browser").equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\soumya balu\\workspace\\New folder\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		         driver = new InternetExplorerDriver();
		
		
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;
	}

	public void getScreenshot() {
		// TODO Auto-generated method stub
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}
      

}


