package facebook_module;

import org.testng.annotations.Test;

import base.Baseclass;
import facebook.FLoginpage;

public class Facebooktests extends Baseclass  {
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		driver.get(FB_url);
		FLoginpage a = new FLoginpage(driver);
		a.doLogin("9168750957", "passwordoftej");

	}
	
	@Test
	public void message() {
		System.out.println("Hello World");
		
	}
	
	

}
