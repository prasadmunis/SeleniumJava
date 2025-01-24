package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_9_TCs_Groups {

	WebDriver driver;

	@Test(groups="search")
	public void google() {

		driver.get("https://www.google.com");
	}

		@Test(groups="social")
		public void facebook() {

			driver.get("https://www.facebook.com");
			
		}
		@Test(groups="tech")
		public void redmine() {

			driver.get("https://www.redmine.org");
		}
		@Test(groups="tech")
		public void techlearn() {

			driver.get("https://www.techlearn.in");
		}
		@Test(groups="social")
		public void twitter() {

			driver.get("https://www.x.com");
		}
		@Test(groups="communication")
		public void gmail() {

			driver.get("www.gmail.com");

		}
		@BeforeTest(groups="tech")
		public void beforeTest() {

				driver = new ChromeDriver();
				driver.manage().window().maximize();
						}

		@AfterTest
		public void afterTest() {

		driver.quit();
						}

					}
