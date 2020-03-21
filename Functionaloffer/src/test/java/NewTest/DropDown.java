package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropDown {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebElement dropDownMonth = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	  Select dropDown1 = new Select (dropDownMonth);
	  dropDown1.selectByIndex(3);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
