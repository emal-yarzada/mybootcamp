package bootcampfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepoHomePage {


		@FindBy(xpath = "//*[@id=\"headerMyAccount\"]")
		WebElement account;

		@FindBy(id = "SPSORegister")
		WebElement regeister;

		public HomeDepoHomePage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}

		public void accnt() {
			account.click();
		}

		public void registers() throws InterruptedException {
		Thread.sleep(3000);
			regeister.click();
			
		}

	}

