package walletHub_module;

import org.testng.annotations.Test;

import base.Baseclass;
import walletHub.Profile_page;
import walletHub.WHLogin;
import walletHub.WHreviewPage;

public class Wallethub_tests extends Baseclass {
	
	
	@Test(priority = 1)
	public void WHlogin() {
		
		driver.get(WalletH_url);
		WHLogin a = new WHLogin(driver);
		a.login("tejipatel89@yahoo.com", ".paswordtej123T");
	
		
	}

	@Test(priority = 2)
	public void verifystarsthengiverating() throws InterruptedException {
		driver.get(review_url);
		Thread.sleep(10000);
		WHreviewPage b = new WHreviewPage(driver);
		// b.hoveronstarandverify();
		b.giverating();

	}
	
	


	@Test(priority = 3)
	public void verifyreviewinprofile() {
		Profile_page b = new Profile_page(driver);
		b.verifyreviewpresent();

	}
	
}

