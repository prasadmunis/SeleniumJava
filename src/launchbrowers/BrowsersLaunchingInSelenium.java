package launchbrowers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersLaunchingInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();		
	   // ChromeDriver driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		//driver.manage().window().minimize();
		
		//WebDriver driver = new FirefoxDriver();		
		   // FirefoxDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new Edgedriver();		
		   // EdgeeDriver driver = new EdgeDriver();
		
		//WebDriver driver = new SafariDriver();		
		   // ChromeDriver driver = new ChromeDriver();
	}

}
