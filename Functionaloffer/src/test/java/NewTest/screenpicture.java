package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class screenpicture {
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("emal_yarzada@hotmail.com");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sdfdsfs");
	  String fileName = "Facebook_logo";
	  File pics = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(pics, new File ("C:\\ScreenShotss\\"+fileName+".jpg"));
	  
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
