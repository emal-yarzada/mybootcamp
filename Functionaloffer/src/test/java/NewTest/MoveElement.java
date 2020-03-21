package NewTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class MoveElement {
	WebDriver driver;
	
  @SuppressWarnings("deprecation")
@Test
  public void f() {
	  Actions cont = new Actions (driver);
	  cont.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).perform();
	  String title =driver.getCurrentUrl();
	
	  System.out.println(title);
	  
	
  }
 @BeforeMethod
 public void beforemethod ()
 {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
