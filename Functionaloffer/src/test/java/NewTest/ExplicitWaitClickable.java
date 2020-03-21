package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ExplicitWaitClickable {
	private static final Function<? super WebDriver, Object> ExpectedCondtions = null;
	WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  ExplicitWait wait = new ExplicitWait ();
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://facebook.com");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"emaill\"]"));
		ExplicitWait.sendk(driver, email, 10, "Ahmad");
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		ClickOn(driver, firstname, 10);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedCondtions)
		
		
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  public static void ClickOn (WebDriver driver, WebElement element, int timeout)
  {
	  new WebDriverWait (driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
	  element.click();
  }

}
