package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in");
	}
	
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
	}
}
