package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  //WebElement email = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[1]"));
	  //email.sendKeys("emal_yarzada@hotmail.com");
	  //WebElement password = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[2]"));
	  //password.sendKeys("JanJANjana");
	  //driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody//tr/td/label)[3]")).click();
	  driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Emal");
	  driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("yarzada");
	  driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("emal_yarzada@hotmail.com");
	  Select dropDown = new Select (driver.findElement(By.xpath("//*[@aria-label='Month']")));
	  dropDown.selectByVisibleText("Oct");
	  Select dropDown2 = new Select (driver.findElement(By.xpath("//*[@aria-label='Day']")));
	  dropDown2.selectByValue("12");
	  Select dropDown3 = new Select (driver.findElement(By.xpath("//*[@aria-label='Year']")));
	  dropDown3.selectByValue("1985");
	  
	  
	  driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
	 
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
