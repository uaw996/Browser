package testRepository;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL; 


public class BSsample {
	static WebDriver driver;
	public static final String USERNAME = "umeshawasarmol1";
	public static final String AUTOMATE_KEY = "VCEuEnvKX4HMxDGDpu9N";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "IE");
		caps.setCapability("browser_version", "11.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.5.2");
	
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id ='radio-btn-example']/fieldset/label[1]/input")).click();
		driver.close();
	}

}
