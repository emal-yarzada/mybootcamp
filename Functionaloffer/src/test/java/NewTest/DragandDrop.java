package NewTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class DragandDrop {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		action.contextClick(rightClick).build().perform();
		
		WebElement copy = driver.findElement(By.xpath("/html/body/ul/li[3]"));
		
		String copText = copy.getText();
		
		copy.click();
	
	}

	@BeforeMethod 
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenue/demo.html");
	;
		driver.manage().window().maximize();
		

	}

	@AfterMethod
	public void afterMethod() {
	}

}
