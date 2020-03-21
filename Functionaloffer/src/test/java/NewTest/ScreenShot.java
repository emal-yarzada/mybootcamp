package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ScreenShot {
	static WebDriver driver;
	
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  screenshots("Facebook_password_check", driver);
	  
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  screenshots("ahmad", driver);
	  
  }
  public void screenshots (String fileName, WebDriver driver) throws IOException 
  {
	  this.driver= driver;
	  File shots = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
	  FileUtils.copyFile(shots, new File ("C:\\New folder\\"+fileName+".jpg"));
  }
}
