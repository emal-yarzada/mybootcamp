package NewTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String window = driver.getWindowHandle();
		System.out.println(window);
		boolean logo = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).isDisplayed();
		System.out.println(logo);
		Actions action = new Actions (driver);
		WebElement forgotpss = driver.findElement(By.partialLinkText("Forgot account"));
		action.keyDown(Keys.SHIFT).click(forgotpss).keyDown(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		String current = driver.getWindowHandle();
		Set <String> windows = driver.getWindowHandles();
		for (String counter:windows)
		{
			if (!counter.equals(current))
			{
			driver.switchTo().window(counter);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			}
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("23r");
		}
		
		
	}
	}


