package NewTest;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ErrorMessage {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("emal@gm");
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String error = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
	  Assert.assertEquals("Enter a valid email or phone number", error);
	  System.out.println(error);
	  boolean lgo = driver.findElement(By.xpath("//*[@class='l5Lhkf']")).isDisplayed();
	  Assert.assertEquals(true, lgo);
	  driver.close();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("https://www.gmail.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
