package NewTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_test {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver ();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  feedvalue("//*[@id=\"email\"]", "sukrat.emal@gmail.com");
		  feedvalue("//*[@id=\"pass\"]", "1232323");
		  feedvalue("//*[@id=\"u_0_m\"]", "Mohammad");
		  feedvalue("//*[@id=\"u_0_o\"]", "Yarzada");
		 
		  

	}
	public static void feedvalue (String xpat, String value)
	{
	driver.findElement(By.xpath(xpat)).sendKeys(value);
}
}
