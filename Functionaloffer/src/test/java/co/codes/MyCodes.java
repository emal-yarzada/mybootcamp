package co.codes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class MyCodes {
	public abstract void click (WebDriver driver, String xpath);
	public abstract void send (WebDriver driver, String xpath, String value);
	public abstract void screen (WebDriver driver, String fileName) throws IOException;
	public abstract void multiClick (WebDriver driver, String xpath, int numberOfclicks);
	public abstract void initialize (WebDriver driver, String URL);
	
}

