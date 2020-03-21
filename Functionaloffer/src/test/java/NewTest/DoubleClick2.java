package NewTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick2 {
	
	static WebDriver driver;
	static General gen = new General ();
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/flights?lite=0#flt=/m/0rh6k..2020-02-27*./m/0rh6k.2020-03-02;c:USD;e:1;a:SG*SG;sd:1;t:h");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement frm = driver.findElement(By.xpath("//*[@id=\"flt-app\"]/div[2]/main[1]/div[4]/div/div[3]/div/div[2]/div[1]"));
		frm.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input")).sendKeys("New");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait (driver,10);
		WebElement frm3 = driver.findElement(By.xpath("//*[@id=\"sbse1\"]/div[1]/div[1]/span[1]"));
		wait.until(ExpectedConditions.visibilityOf(frm3));
		frm3.click();		
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String fileName = "flights3";
		//FileUtils.copyFile(file, new File ("C:\\ScreenShots\\" + fileName + ".jpg"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flt-pax-button\"]/div")).click();
		for (int a = 2; a <= 5; a++) {
			driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div/div[1]/div/div[3]/div[1]")).click();

		}
		Thread.sleep(2000);
		driver.close();
	}

}
