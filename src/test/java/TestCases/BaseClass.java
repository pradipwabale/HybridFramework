package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 

public class BaseClass {

	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

	}
	
	@AfterTest
	public void CloseBrowser(){
		driver.close();
	}
}