package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_Timeout_Feature {

	WebDriver driver;
	
	
	@Test(timeOut=2000)
	public void googlesearchchittor() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Chitoor");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hdtb-tls")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		
	}
		
	@Test
	public void googlesearchtirupathi() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupathi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hdtb-tls")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		
	}
	
	@Test
	public void googlesearchtechlearn() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Techlearn.in");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hdtb-tls")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		
	}

		
		@BeforeTest
		public void beforeTest() {

				driver = new ChromeDriver();
				driver.manage().window().maximize();
						}

		@AfterTest
		public void afterTest() {

		driver.quit();
						}

					}
