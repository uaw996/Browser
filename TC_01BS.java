package testRepository;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TC_01BS {
	public WebDriver driver;
	public static final String USERNAME = "umeshawasarmol1";
	public static final String AUTOMATE_KEY = "VCEuEnvKX4HMxDGDpu9N";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeClass
	public void setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "79.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.10.0");

		driver = new RemoteWebDriver(new URL(URL), caps);
	}

	@Test
	public void googleSarchTest() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@class='dRYYxd']/preceding::input[1]")).click();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
