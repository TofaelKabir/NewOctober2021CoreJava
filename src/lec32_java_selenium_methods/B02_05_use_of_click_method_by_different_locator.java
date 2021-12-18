package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_05_use_of_click_method_by_different_locator {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	// cssSelector by class (class name should be unique, if more than one class is present)
	// --> dot and the write class name inside the string, remove the space, and put dot between class
	@Test (enabled = true, priority = 1)
	public void loginHeadingTest(){
		driver.findElement(By.cssSelector(".cms-icon.cms-sprite-loggedout.mt-0.mb-0")).isDisplayed();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
