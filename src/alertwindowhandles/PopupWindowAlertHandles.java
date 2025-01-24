package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupWindowAlertHandles {
	
	WebDriver driver;
  @Test
  public void alertokbutton() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
  }
  
  @Test
  public void alertcancelbutton() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().dismiss();
	    }
  
  @Test
  public void alertsendtextokcancelbutton() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(1000);
	  
	  Alert alt = driver.switchTo().alert();
	  
	  alt.sendKeys("Revathi");
	  alt.accept();
	 /* driver.switchTo().alert().sendKeys("Prasad");
	  driver.switchTo().alert().accept();*/
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
