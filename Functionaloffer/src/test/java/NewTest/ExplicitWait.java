package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ExplicitWait {
	WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/flights?lite=0#flt=/m/0rh6k..2020-02-27*./m/0rh6k.2020-03-02;c:USD;e:1;a:SG*SG;sd:1;t:h");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"flt-app\"]/div[2]/main[1]/div[4]/div/div[3]/div/div[2]/div[1]")).click();

		WebElement from = driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input"));
		sendk(driver, from, 10, "New York");

	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {
	}

	public static void sendk(WebDriver driver, WebElement element, int timeout, String value)

	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}
}
