package co.codes;

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
import org.openqa.selenium.support.PageFactory;

public class MyMethods extends MyCodes {
	WebDriver driver;

	public void click(WebDriver driver, String xpath) {
		// TODO Auto-generated method stub
		this.driver = driver;
		driver.findElement(By.xpath(xpath)).click();

	}

	public void send(WebDriver driver, String xpath, String value) {
		// TODO Auto-generated method stub
		this.driver = driver;
		driver.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public void screen(WebDriver driver, String fileName) throws IOException {
		this.driver = driver;
		File shots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shots, new File("C:\\New folder\\" + fileName + ".jpg"));
	}
	// TODO Auto-generated method stub

	public void multiClick(WebDriver driver, String xpath, int numberOfclicks) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= numberOfclicks; a++) {
			driver.findElement(By.xpath(xpath)).click();
		}
	}

	public void initialize(WebDriver driver, String URL) {
		this.driver = driver;
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
}