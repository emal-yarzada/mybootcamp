package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DoubleClick {
	static WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		doubleclick(6);
		aserts ();
		driver.close();
	

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/flights?lite=0#flt=/m/0rh6k..2020-02-27*./m/0rh6k.2020-03-02;c:USD;e:1;a:SG*SG;sd:1;t:h");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//ScreenShot.screenshots("Flights");
	}

	@AfterMethod
	public void afterMethod() {

	}

	public static void doubleclick(int index) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"flt-pax-button\"]")).click();
		Thread.sleep(2000);
		for (int a = 2; a <= index; a++) {
			driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div/div[1]/div/div[3]/div[1]")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div/div[5]/div[1]")).click();

	}
	
	public static void aserts ()
	{
		boolean logo = driver.findElement(By.xpath("//*[@id=\"flt-app\"]/div[2]/main[1]/div[1]/div/div/div")).isDisplayed();
		System.out.println(logo);
		
		
		
	}

}
