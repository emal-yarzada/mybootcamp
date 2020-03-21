package co.xml.tests;

import org.testng.annotations.Test;

import co.codes.MyMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Login_Function_Test {
	WebDriver driver;

	@Test
	public void test1() {
		MyMethods mm = new MyMethods ();
		mm.send(driver, "//*[@id=\"email\"]", "emal_yarzada@hotmail.com");
		mm.send(driver, "//*[@id=\"pass\"]", "123");
	}

	@Parameters("Browser")
	@BeforeMethod
	public void set_up(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https:facebook.com");
			;
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\emal_\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("https:facebook.com");
			;
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (browser.equals("Internet")) {
			System.out.println("Please install Internet Explorer Driver First");
		}
	}

	@AfterMethod
	public void tear_down() {
		//driver.close();
	}

}
