package testRepository;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.net.URL; 
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver = null;

	public static final String USERNAME = "umeshawasarmol1";
	public static final String AUTOMATE_KEY = "VCEuEnvKX4HMxDGDpu9N";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) throws MalformedURLException  {
		System.out.println("Browser name is " + BrowserName);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.10.0");

		if (BrowserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			caps.setCapability("BrowserName", "chrome");

		}

		if (BrowserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			caps.setCapability("BrowserName", "firefox");
		}

		driver = new RemoteWebDriver(new URL(URL), caps);
//		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	// (alwaysRun= true) configuration method will be run even if one or more methods invoked previously failed or was skipped.

	@AfterClass
	public void tearDown() {
		
//		driver.quit();
	}
	
	
}
