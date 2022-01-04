package lec38_java_selenium_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class K04_how_to_find_hidden_element {
	WebDriver driver;
	JavascriptExecutor js;
	

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		// use of implicitly wait 
		// Please ask Nasir when he use implicitly wait , why it is deprecated and what is the alternative
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}

	@Test(enabled = true, priority = 1)
	public void findHiddenElementsWrongWay() throws InterruptedException {
		// identify the 'Hide' element and click on it
		// The search field will be disappeared, but we can pass value on it (line 40)
		driver.findElement(By.id("hide-textbox")).click();

		// identify element and set value
		// it will fail by below error message
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Selenium");

		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 2)
	public void findHiddenElements() throws InterruptedException {
		// identify the Hide element and click on it
		// The search field will be disappeared, but we can pass value on it (line 53)
		driver.findElement(By.id("hide-textbox")).click();

		// identify element and set value by JavascriptExecutor
		WebElement element = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		js.executeScript("arguments[0].value='Selenium' ", element);
		Thread.sleep(4000);

		// Extra not related to hidden elements and not important
		// To find out what is send as text, not necessary for this scenario
		// Just save the below code for future reference
		String s = (String) js.executeScript("return document.getElementById('displayed-text').value");
		System.out.print("Value entered in hidden field: " + s + "\n");
		
		// not important
		// How to get title of the page by JavaScript
		// How to read a JavaScript variable in Selenium WebDriver?
		String title = (String) js.executeScript("return document.title");
		System.out.println("Title of the webpage : " + title);


	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}


}
