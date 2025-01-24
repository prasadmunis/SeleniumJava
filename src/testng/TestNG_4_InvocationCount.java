package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_InvocationCount {

	WebDriver driver;
	
	
	@Test(priority=2 , enabled = false )
	public void google() {

		driver.get("https://www.google.com");
	}
		@Ignore
		@Test(priority=0)
		public void facebook() {

			driver.get("https://www.facebook.com");
			
		}
		@Test(priority=1)
		public void redmine() {

			driver.get("https://www.redmine.org");
		}
		@Ignore
		@Test(priority=3)
		public void techlearn() {

			driver.get("https://www.techlearn.in");
		}
		@Test(enabled = false,priority=4)
		public void twitter() {

			driver.get("https://www.x.com");
		}
		@Test(priority=5, invocationCount=3)
		public void gmail() {

			driver.get("https://www.gmail.com");

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
