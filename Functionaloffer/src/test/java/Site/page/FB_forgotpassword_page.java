package Site.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_forgotpassword_page {
	public WebDriver driver;
	@FindBy (xpath ="//*[@id=\"identify_email\"]")
	WebElement search;
	@FindBy (xpath = "//*[@id=\"did_submit\"]")
	WebElement searchButton;
	
	public FB_forgotpassword_page (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void search (String value)
	{
		search.sendKeys(value);
		
	}
	public void searchbton ()
	{
		searchButton.click();
	}
}
