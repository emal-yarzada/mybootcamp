package bootcampfinal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HomeDepoStartUp {

	public static WebDriver driver;

		@BeforeClass
		public void beforeClass() {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		
			driver.navigate().to("https://www.homedepot.com/");

			driver.manage().window().maximize();

			

		}

		@AfterClass
		public void afterClass() {
			driver.close();
		}

	}

