package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyTest {
	  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("www.yahoo.com");
	  driver.manage().window().maximize();
	  
	  @Test
	  public void f (); {
		  
		  WebElement sport = driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[4]/a"));
		  sport.click();
		  
		  
		
	  }
	
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
