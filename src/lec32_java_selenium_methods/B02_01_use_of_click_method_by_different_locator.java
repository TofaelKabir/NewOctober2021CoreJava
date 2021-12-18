package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_01_use_of_click_method_by_different_locator {
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

	@Test (enabled = true, priority = 1)
	public void loginButtonTest01(){
		driver.findElement(By.id("cms-login-submit")).click();
	}
	
	@Test (enabled = true, priority = 2)
	public void loginButtonTest02(){
		driver.findElement(By.name("Submit Login")).click();
	}
	
	@Test (enabled = true, priority = 2)
	public void newUserRegistrationTest(){
		driver.findElement(By.className("cms-newuser-reg")).click();
	}
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
