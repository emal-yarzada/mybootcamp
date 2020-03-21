package Com.Amazon.Functionaloffer;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import NewTest.ExplicitWait;

public class googleFlights {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(
					"https://www.google.com/flights?hl=en#flt=/m/0rh6k..2020-02-28*./m/0rh6k.2020-03-03;c:USD;e:1;ls:1w;sd:0;t:h");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"flt-pax-button\"]/div")).click();
		Thread.sleep(1000);
		for (int a = 1; a<=5;a++)
		{
		driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div/div[1]/div/div[3]")).click();
	
		}
		String b = "Flights";
		Date date = new Date (0);
		System.out.println(date);
		int fileName = 1;
		fileName ++;
		File file = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File ("C:\\ScreenShots\\"+fileName+ b+".jpg"));
		
		}

	}


