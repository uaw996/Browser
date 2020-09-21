package testRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class RahulShettyPageTest extends BaseTest {
	WebDriver driver;
	
	
	
	

	@Test
	public void radioBtnTest() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@class='dRYYxd']/preceding::input[1]")).click();
	
	}
	
	

}
