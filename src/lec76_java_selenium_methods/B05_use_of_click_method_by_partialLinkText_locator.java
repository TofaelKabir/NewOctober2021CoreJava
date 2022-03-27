package lec76_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B05_use_of_click_method_by_partialLinkText_locator {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.ebay.com/");
		Thread.sleep(4000);
	}

	// source: at the bottom of the page, first element from Sell column
	
	@Test (enabled = true, priority = 1)
	public void SellTest02() {
		driver.findElement(By.partialLinkText("Start selli")).click();
	}
	
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
