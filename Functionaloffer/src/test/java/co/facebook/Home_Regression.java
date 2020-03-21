package co.facebook;

import org.testng.annotations.Test;

import Site.page.FB_forgotpassword_page;
import Site.page.Home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Home_Regression {
	public WebDriver driver;

	@Test(priority = 2)
	public void Login() {
		Home home = new Home(driver);
		home.EmailField("anil");
		home.passwordFeild("123");
		home.login();
	}

	@Test(priority = 1)
	public void forgotpasslink() throws InterruptedException

	{
		FB_forgotpassword_page fp = new FB_forgotpassword_page(driver);
		Home home = new Home(driver);
		home.forgotPasswordLink();
		fp.search("emal");
		Thread.sleep(2000);
		fp.searchbton();
		Thread.sleep(2000);

	}

	@BeforeMethod
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https:facebook.com");
		;
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterClass() {
		driver.close();
	}

}
