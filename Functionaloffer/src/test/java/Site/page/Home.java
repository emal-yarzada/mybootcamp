package Site.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
	WebDriver driver;
	@FindBy (name="email")
	WebElement userid;
	@FindBy (name="pass")
	WebElement password;
	@FindBy (xpath= "//*[@id=\"pass\"]")
	WebElement loginbutton;
	@FindBy (xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
	WebElement forgotPasswordLink;
	
	public Home (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void EmailField (String enteremail)
	{
		userid.sendKeys(enteremail);
		
	}
	public void passwordFeild (String enterpass)
	{
		password.sendKeys(enterpass);
	
}
	public void login ()
	{
		loginbutton.click();
	}
	public void forgotPasswordLink ()
	{
		forgotPasswordLink.click();
	}
	

}
