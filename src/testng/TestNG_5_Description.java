package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_Description {

	WebDriver driver;
	
	
	@Test(description="Verify the Google")
	public void google() {

		driver.get("https://www.google.com");
	}
		
		@Test(description="Verify the facebook")
		public void facebook() {

			driver.get("https://www.facebook.com");
			
		}
		@Test(description="Verify the redmine")
		public void redmine() {

			driver.get("https://www.redmine.org");
		}
		
		@Test(description="Verify the techlearn")
		public void techlearn() {

			driver.get("https://www.techlearn.in");
		}
		@Test(description="Verify the Twitter")
		public void twitter() {

			driver.get("https://www.x.com");
		}
		@Test(description="Verify the Gmail")
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
