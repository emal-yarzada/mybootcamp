package co.codes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypractice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\emal_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver ();
		
		MyMethods md = new MyMethods ();
		md.initialize(driver, "https:\\facebook.com");
		md.send(driver, "//*[@id=\"email\"]", "emal_yarzada@hotmail.com");
		md.click(driver, "//*[@id=\"loginbutton\"]");
		md.screen(driver, "FacebookNew");
			
		
	}
	
	
	
	
	

}
