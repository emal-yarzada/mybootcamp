package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class General {
	WebDriver driver;

	@Test
	public void f() throws IOException, InterruptedException {

			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[2]/a")).click();
			findelement("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]");
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).click();	
			findelement("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[2]/a");
			Thread.sleep(1000);
			findelement("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]/a");
			Thread.sleep(2000);
			findelement("//*[@id=\"divpaxinfo\"]");
			Select sel = new Select (driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
			sel.selectByVisibleText("5");
			
			
	
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
	
	}
	public void shot (String fileName) throws IOException
	{
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File ("C:\\ScreenShots\\"+fileName+".jpg"));
	

	
	}
	public void findelement (String xpat)
	{
		driver.findElement(By.xpath(xpat)).click();
		
	}

}
