package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  WebElement searchMain = driver.findElement(By.xpath("//*[@id=\"header-search-input\"]"));
	  searchMain.sendKeys("Kobe");
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//*[@id=\"header-desktop-search-button\"]")).click();
	  driver.navigate().back();
	  WebElement sport = driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[4]/a"));
	  sport.click();
	  driver.findElement(By.xpath("//*[@id=\"Nav-0-DesktopNav\"]/div/div[3]/div/nav/ul/li[3]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"uh-signedin\"]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"search-assist-input\"]/div[1]/input"));
	  search.sendKeys("Lakers");
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
	  Thread.sleep(1000);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("http://www.yahoo.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }
}

 