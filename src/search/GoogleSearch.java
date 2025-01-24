package search;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearch {
	
WebDriver driver;
	
	
	@Test(dependsOnMethods="method2")
	public void method1() {
		
		driver.findElement(By.name("q")).sendKeys("Puttur");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
		
		@Test
		public void method2() {

			driver.get("https://www.google.com");
		}
 

}
