package NewTest;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;

	@Test(priority = 1)
	public void one() {
	
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.findElement(By.id("tab-flight-tab-hp")).click();

		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("iad");
		driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("jfk");
		driver.findElement(By.xpath("//*[@id=\"flight-departing-hp-flight\"]")).click();

		driver.findElement(By.xpath("(//button[@type='button'])[81]")).click();

		driver.findElement(By.xpath("//*[@id=\"flight-returning-hp-flight\"]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[88]")).click();
		driver.findElement(By.id("travel-advisory-close-button")).click();

		driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")).click();
	}
		@Test(priority = 2)
		public void two() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[35]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[37]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@data-test-id=\"select-button\"])[1]")).click();
	
		driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[2]")).click();
		}
		@Test(priority = 3)
		public void three() throws InterruptedException {
		ArrayList<String> page = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(page.get(1));
		driver.findElement(By.id("bookButton")).click();

		driver.findElement(By.id("firstname[0]")).sendKeys("first name");
		driver.findElement(By.xpath("//input[@data-tealeaf-name='middleName']")).sendKeys("middl name");
		driver.findElement(By.id("lastname[0]")).sendKeys("last name");
		driver.findElement(By.id("phone-number[0]")).sendKeys("7575757575");
		driver.findElement(By.id("gender_male[0]")).click();

		Select pick = new Select(driver.findElement(By.id("date_of_birth_month0")));
		pick.selectByIndex(8);
		Select day = new Select(driver.findElement(By.id("date_of_birth_day[0]")));
		day.selectByVisibleText("08");
		Select year = new Select(driver.findElement(By.id("date_of_birth_year[0]")));
		year.selectByVisibleText("1980");
		}
		
		@Test(priority = 4)
		public void four() throws InterruptedException {
	
		
		
		driver.findElement(By.xpath("(//input[@name=\"creditCards[0].cardholder_name\"])[2]")).sendKeys("45484651584651");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@data-tealeaf-name=\"expirationMonth_1\"]")));
		month.selectByVisibleText("08-Aug");
		
		Select year= new Select(driver.findElement(By.xpath("(//select[@data-custom-rules=\"ccExpiry\"])[2]")));
		year.selectByVisibleText("2024");
		driver.findElement(By.xpath("(//input[@type=\"tel\"])[5]")).sendKeys("444");
		
		driver.findElement(By.id("complete-booking")).click();
	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
	
	}

	@AfterClass
	public void afterClass() {
	}

}

