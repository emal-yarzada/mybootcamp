package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class sessionToday {
	static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"flt-pax-button\"]")).click();
	  Thread.sleep(2000);
	  int a = 1;
	  //for (int a=1;a<=6;a++)
	  while (a<7)
	  {
	  driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div/div[1]/div/div[3]")).click();
	  a++;
	  }
	  find("//*[@id=\"flt-modaldialog\"]/div/div/div[5]/div[1]");
	  Thread.sleep(2000);
	  find("//*[@id=\"flt-app\"]/div[2]/main[1]/div[4]/div/div[3]/div/div[1]/div[1]/dropdown-menu/div/div[1]");
	  //driver.findElement(By.xpath("//*[@id=\"gws-travel-header__unified-nav-header\"]/a[2]/g-ripple")).click();
	  Thread.sleep(1000);
	 find("//*[@id=\"gws-travel-header__unified-nav-header\"]/a[2]/g-ripple");
	 
		
  }
  @BeforeMethod
  public void beforeMethod() {
	    
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/flights?hl=en#flt=/m/0rh6k..2020-02-28*./m/0rh6k.2020-03-03;c:USD;e:1;ls:1w;sd:0;t:h");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void afterMethod() {
  }
  public static void find (String provide_the_expat)
  {
	  driver.findElement(By.xpath(provide_the_expat)).click();
  }
}
