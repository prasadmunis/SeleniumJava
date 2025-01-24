package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1_TCs_Execution_Order {

	WebDriver driver;

	@Test
	public void google() {

		driver.get("https://www.google.com");
	}

		@Test
		public void facebook() {

			driver.get("https://www.facebook.com");
			
		}
		@Test
		public void redmine() {

			driver.get("www.redmine.org");
		}
		@Test
		public void techlearn() {

			driver.get("https://www.techlearn.in");
		}
		@Test
		public void twitter() {

			driver.get("https://www.x.com");
		}
		@Test
		public void gmail() {

			driver.get("www.gmail.com");

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
