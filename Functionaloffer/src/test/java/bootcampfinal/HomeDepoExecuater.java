package bootcampfinal;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeDepoExecuater extends HomeDepoStartUp {
	
	@Test(priority = 0)
	public void one() throws InterruptedException {

		HomeDepoHomePage hom = new HomeDepoHomePage(driver);
		hom.accnt();
		hom.registers();
	}

	@Test(priority = 1)
	@Parameters({ "emx", "psx", "zcx", "phx" })
	public void two(String em, String ps, String zc, String ph) {
		HomeDepoRegistrationPage re = new HomeDepoRegistrationPage(driver);
		re.emails(em);
		re.pass(ps);
		re.zipcode(zc);
		re.phone(ph);
		re.create();
	}
}

