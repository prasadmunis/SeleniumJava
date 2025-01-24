package dropdownselection;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropdownOption {
	
	WebDriver driver;
  @Test
  public void selectdropdown() throws InterruptedException {
	  
	  driver.get("https://www.redmine.org/account/register");
	  driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("prasadsmn@gmail.com");
	  Thread.sleep(2000);
	  
	  Select lan = new Select(driver.findElement(By.xpath("//select[@id='user_language']")));
	  //lan.selectByVisibleText("Indonesian (Bahasa Indonesia)");
	  //lan.selectByValue("ko");
	  //lan.selectByIndex(8);
	   lan.selectByContainsVisibleText("Galician");	
	   }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
