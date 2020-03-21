package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Newpractice {
	
	WebDriver driver;
	
  @Test (priority = 3)
  public void f() throws InterruptedException {
	  driver.get("https://www.google.com");
	  WebElement search = driver.findElement(By.xpath("(/html/body/div/div/div/input )[1]"));
	  search.sendKeys("Book");
	  Thread.sleep(500);
	  search.submit();
	  driver.findElement(By.id("id=\"gsr\"")).click();
	  
  }
  
  @Test (priority = 1)
  public void searchtest2 () throws InterruptedException
  {
	  driver.get("https://www.google.com");
	  WebElement search = driver.findElement(By.xpath("(/html/body/div/div/div/input )[1]"));	  
	  search.sendKeys("BOOK");
	  Thread.sleep(1000);
	  search.submit();
	  driver.findElement(By.id("id=\"gsr\"")).click();
	  
	  
  }
  @Test (priority = 2)
  public void searchtest3 () throws InterruptedException
  {
	  driver.get("https://www.google.com");
	  WebElement search = driver.findElement(By.xpath("(/html/body/div/div/div/input )[1]"));
	  search.sendKeys("Note BOOk");
	  Thread.sleep(1000);
	  search.submit();
	  driver.findElement(By.id("id=\"gsr\"")).click();
	    
  }
  
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\emal_\\Downloads\\chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver ();
	driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
