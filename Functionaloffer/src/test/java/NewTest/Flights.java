package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Flights {
	static WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters ("Browser")
  public static void beforeMethod(String Browser) throws IOException {
	  if (Browser.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\emal_\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver ();
	  driver.get("https://www.emirates.com");
	  driver.manage().window().maximize();
	  ScreenShot a = new ScreenShot ();
	  a.screenshots("Emirates", driver);
	  } else if (Browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver ();
		  driver.get("https://www.emirates.com");
		  driver.manage().window().maximize();
	  } else {
		  System.out.println("Check your browser or spelling in XML file");
	  }
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
