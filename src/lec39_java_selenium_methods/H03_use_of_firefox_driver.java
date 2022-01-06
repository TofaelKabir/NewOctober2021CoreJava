package lec39_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H03_use_of_firefox_driver {
	// Important interview question
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/geckodriver");
		// FirefoxDriver is a class and it is instantiated
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	@Test
	public void loginButtonTest() throws InterruptedException{
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(8000); 
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
