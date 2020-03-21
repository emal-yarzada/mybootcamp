package co.practice.wednesday;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Facebook_Login_Test {
	WebDriver driver;
	
	
  @BeforeMethod
  @Parameters ({"browser","URL"})
  public void beforeMethod(String browser, String URL) throws InterruptedException {
	  if (browser.equalsIgnoreCase("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
	  else if (browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\emal_\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }
  }
		
		  @Test
		  public void f() throws InterruptedException {
			  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("emal_yarzada@hotmail.com");
			  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
			  Thread.sleep(4000);
		  
	} 


  @AfterMethod
  public void afterMethod() {
	  driver.close();
	 
  }

}
