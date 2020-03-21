package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SelectioninFB {
	WebDriver driver;

  @Test (priority = 2)
  public void f() throws InterruptedException {
	  
	  WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	  Select dropDown1 = new Select (month);
	  dropDown1.selectByIndex(4);  
	  Thread.sleep(2000);
	  
  }
  
  @Test (priority = 1)
  public void loginTest () throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("emal_yarzada@hotmail.com");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1233445");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	
	 
	  
  }
  
  @BeforeMethod 
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	 
  }

}
