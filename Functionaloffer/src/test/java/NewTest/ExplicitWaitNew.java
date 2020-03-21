package NewTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitNew {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver ();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  //WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"email\"]")))).sendKeys("mike@hotmail.com");
		  
		  
	}

}
