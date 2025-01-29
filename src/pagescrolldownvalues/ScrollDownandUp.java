package pagescrolldownvalues;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUp {
	
	WebDriver driver;
  @Test
  public void pagedown() throws InterruptedException {
	  
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  
	  JavascriptExecutor jse =(JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,3550)");
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
	  Thread.sleep(2000);
	   }
  @Test
  public void pageup() throws InterruptedException {
	  
	 // driver.get("https://www.selenium.dev/");
	  //driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  
	  JavascriptExecutor jse =(JavascriptExecutor)driver;
	  jse.executeScript("scroll(3500,0)");
	  //driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
	  
	   }
 
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
